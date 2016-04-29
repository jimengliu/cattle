package io.cattle.platform.servicediscovery.process;

import static io.cattle.platform.core.model.tables.DiskTable.DISK;

import io.cattle.platform.core.model.Disk;
import io.cattle.platform.core.model.Host;
import io.cattle.platform.engine.handler.HandlerResult;
import io.cattle.platform.engine.handler.ProcessPostListener;
import io.cattle.platform.engine.process.ProcessInstance;
import io.cattle.platform.engine.process.ProcessState;
import io.cattle.platform.process.common.handler.AbstractObjectProcessLogic;
import io.cattle.platform.util.type.Priority;

import java.util.List;

public class HostRemovedPostListener extends AbstractObjectProcessLogic implements ProcessPostListener, Priority {

    @Override
    public String[] getProcessNames() {
        return new String[] { "host.remove" };
    }

    @Override
    public HandlerResult handle(ProcessState state, ProcessInstance process) {
        final Host host = (Host) state.getResource();
        List<Disk> disks = objectManager.find(Disk.class, DISK.HOST_ID, host.getId());

        for (final Disk disk : disks) {
            objectManager.delete(disk);
        }

        return null;
    }

    @Override
    public int getPriority() {
        return Priority.DEFAULT;
    }
}
