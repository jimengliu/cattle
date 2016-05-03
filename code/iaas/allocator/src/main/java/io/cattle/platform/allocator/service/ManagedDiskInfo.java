package io.cattle.platform.allocator.service;

public class ManagedDiskInfo {
    private String diskDevicePath;
    private Long capacity;
    private Long allocatedSize;

    public ManagedDiskInfo(String diskDevicePath, Long capacity) {
        this.diskDevicePath = diskDevicePath;
        this.capacity = capacity;
        this.allocatedSize = 0L;
    }

    public String getDiskDevicePath() {
        return diskDevicePath;
    }

    public Long getCapacity() {
        return capacity;
    }

    public Long getAllocatedSize() {
        return allocatedSize;
    }

    public void addAllocatedSize(Long allocateSize) {
        this.allocatedSize += allocateSize;
    }

    public void freeAllocatedSize(Long freeSize) {
        this.allocatedSize -= freeSize;
    }
}
