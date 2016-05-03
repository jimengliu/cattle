package io.cattle.platform.allocator.constraint;

import io.cattle.platform.allocator.service.AllocationAttempt;
import io.cattle.platform.allocator.service.AllocationCandidate;
import io.cattle.platform.allocator.service.CacheManager;
import io.cattle.platform.allocator.service.ManagedDiskInfo;
import io.cattle.platform.allocator.service.DiskReserveInfo;
import io.cattle.platform.allocator.service.InstanceInfo;
import io.cattle.platform.core.constants.HostConstants;
import io.cattle.platform.core.model.Host;
import io.cattle.platform.object.ObjectManager;
import io.cattle.platform.object.util.DataAccessor;
import io.cattle.platform.util.type.CollectionUtils;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DiskSizeConstraint extends HardConstraint implements Constraint {

    private Long reserveSize;
    String volumeName;
    private ObjectManager objectManager;

    public DiskSizeConstraint(String volumeName, String sizeWithUnit, ObjectManager objMgr) {
        this.objectManager = objMgr;
        this.volumeName = volumeName;
        this.reserveSize = Long.parseLong(sizeWithUnit.replaceAll("[^0-9]", ""));
    }

    @Override
    public boolean matches(AllocationAttempt attempt, AllocationCandidate candidate) {
        Set<Long> hostIds = candidate.getHosts();

        // if one of the host does not have enough free space then return false
        for (Long hostId : hostIds) {
            boolean oneGood = false;

            // TODO we need to cache all host info related to disks
            Host host = objectManager.loadResource(Host.class, hostId);

            if (host == null) {
                continue;
            }
            
            Object obj = DataAccessor.fields(host).withKey(HostConstants.FIELD_INFO).get();

            @SuppressWarnings("unchecked")
            Map<Object, Object> fileSystems = (Map<Object, Object>) CollectionUtils.getNestedValue(obj, "diskInfo", "fileSystems");

            // we will get a bunch of disks for that host and we need at least one disk with
            // free space large enough
            oneGood = checkDisks(hostId, attempt.getInstanceId(), fileSystems);
            
            // if no disk with big enough free space for this host, then
            // candidate is no good
            if (!oneGood) {
                return false;
            }
        }
        return true;
    }

    public boolean checkDisks (Long hostId, Long instanceId, Map<Object, Object> fileSystems) {

        for (Entry<Object, Object> fs : fileSystems.entrySet()) {
            Double capacityDouble = (Double)CollectionUtils.getNestedValue(fs.getValue(), "capacity");
            if (capacityDouble == null) {
                continue;
            }
            Long capacity = Math.round(capacityDouble);
            Long allocatedSize = 0L;
            
            // get the allocated size from a cache, if cache setting is
            // empty or capacity is changed which assumes it could be a
            // different disk basically, create a new one and fill it
            // on-demand now
            ManagedDiskInfo diskInfo = CacheManager.getDiskInfoForHost(hostId, (String)fs.getKey());
            if (diskInfo == null || !capacity.equals(diskInfo.getCapacity())) {
                diskInfo = new ManagedDiskInfo((String)fs.getKey(), capacity);
                CacheManager.setDiskInfoForHost(hostId, diskInfo);
            }
            allocatedSize = diskInfo.getAllocatedSize();
            Long freeSize = capacity - allocatedSize;
            

            InstanceInfo instanceInfo = CacheManager.getInstanceInfoForHost(hostId, instanceId);
            
            // we need to consider more than one volume constraints for this
            // container case. That means free size will subtract all reserved
            // size by other volumes as well beside allocated size.
            DiskReserveInfo diskReserved = instanceInfo.getDiskReserveInfo((String)fs.getKey());
            if (diskReserved != null) {
                freeSize -= diskReserved.getReservedSize();
            }
            if (freeSize >= this.reserveSize) {
                // reserve disk for this instance
                if (diskReserved != null) {
                    diskReserved.addReservedSize(this.reserveSize);
                } else {
                    diskReserved = new DiskReserveInfo((String)fs.getKey(), this.reserveSize, this.volumeName);
                    instanceInfo.reserveDisk(diskReserved);
                }

                // set a scheduling size on the disk
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("host needs a disk with free space larger than %s GB ", this.reserveSize);
    }
}
