package io.cattle.platform.allocator.service;

import java.util.HashMap;
import java.util.Map;

public class CacheManager
{
    public static final Map<Long, HostInfo> hostsInfo = new HashMap<Long, HostInfo>();

    public static HostInfo getHostInfo(Long hostId) {
        HostInfo hostInfo = CacheManager.hostsInfo.get(hostId);
        if (hostInfo == null) {
            hostInfo = new HostInfo(hostId);
            CacheManager.hostsInfo.put(hostId, hostInfo);
        }

        return hostInfo;
    }

    public static ManagedDiskInfo getDiskInfoForHost(Long hostId, String diskDevicePath) {
        return CacheManager.getHostInfo(hostId).getDiskInfo(diskDevicePath);
    }

    public static void setDiskInfoForHost(Long hostId, ManagedDiskInfo diskInfo) {
        CacheManager.getHostInfo(hostId).addDisk(diskInfo);
    }

    public static InstanceInfo getInstanceInfoForHost(Long hostId, Long instanceID) {
        InstanceInfo instanceInfo = CacheManager.getHostInfo(hostId).getInstanceInfo(instanceID);
        if (instanceInfo == null) {
            instanceInfo = new InstanceInfo(instanceID, hostId);
            CacheManager.setInstanceInfoForHost(hostId, instanceInfo);
        }

        return instanceInfo;
    }

    private static void setInstanceInfoForHost(Long hostId, InstanceInfo instanceInfo) {
        CacheManager.getHostInfo(hostId).addInstance(instanceInfo);
    }

}
