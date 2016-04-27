package io.cattle.platform.allocator.constraint;

import static io.cattle.platform.core.model.tables.HostDiskTable.HOST_DISK;

import io.cattle.platform.allocator.service.AllocationAttempt;
import io.cattle.platform.allocator.service.AllocationCandidate;
import io.cattle.platform.core.model.HostDisk;
import io.cattle.platform.object.ObjectManager;

import java.util.List;
import java.util.Set;

public class DiskSizeConstraint extends HardConstraint implements Constraint {

    private Long size;
    private ObjectManager objectManager;

    public DiskSizeConstraint(String sizeWithUnit, ObjectManager objMgr) {
        this.objectManager = objMgr;
        this.size = Long.parseLong(sizeWithUnit.replaceAll("[^0-9]", ""));
    }

    @Override
    public boolean matches(AllocationAttempt attempt, AllocationCandidate candidate) {
        Set<Long> hostIds = candidate.getHosts();

        // if one of the host does not have enough free space then return false
        for (Long hostId : hostIds) {
            boolean oneGood = false;

            // we will get a bunch of disks for that host and we need at least one disk with
            // free space large enough
            List<HostDisk> disks = objectManager.find(HostDisk.class, HOST_DISK.HOST_ID, hostId, HOST_DISK.REMOVED,
                    null);
            for (HostDisk disk : disks) {
                Long freeSize = disk.getTotalSize() - disk.getAllocatedSize();
                if (freeSize >= this.size) {
                    oneGood = true;
                    break;
                }
            }

            // if no disk with big enough free space for this host, then
            // candidate is no good
            if (!oneGood) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("host needs a disk with free space larger than %s GB ", this.size);
    }
}
