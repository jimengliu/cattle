package io.cattle.platform.allocator.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InstanceInfo {

    private Long instanceId;
    private Long hostId;
    private Map<String, DiskReserveInfo> reserveDisks = new HashMap<String, DiskReserveInfo>();


    public InstanceInfo(Long instanceId, Long hostId) {
        super();
        this.instanceId = instanceId;
        this.hostId = hostId;
    }
    
    public Long getHostId() {
        return hostId;
    }
    
    public void setHostId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public Long getInstanceId() {
        return instanceId;
    }
    
    public void reserveDisk(DiskReserveInfo diskReserveInfo)
    {
        this.reserveDisks.put(diskReserveInfo.getDiskDevicePath(), diskReserveInfo);
    }
    
    public void releaseDisk(DiskReserveInfo diskReserveInfo)
    {
        this.reserveDisks.remove(diskReserveInfo.getDiskDevicePath());
    }
    
    public DiskReserveInfo getDiskReserveInfo(String diskDevicePath)
    {
        return this.reserveDisks.get(diskDevicePath);
    }
    
    public Set<Entry<String, DiskReserveInfo>> getAllReservedDisksInfo() {
        return this.reserveDisks.entrySet();
    }

}