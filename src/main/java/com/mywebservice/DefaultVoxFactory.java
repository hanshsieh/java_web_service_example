package com.mywebservice;

import com.mywebservice.services.event.EventService;
import com.mywebservice.services.event.DummyEventService;
import com.mywebservice.services.id.IDService;
import com.mywebservice.services.id.UUIDService;
import com.mywebservice.services.storage.Storage;
import com.mywebservice.services.storage.event.EventNotifyingStorage;
import com.mywebservice.services.storage.sql.SqlStorage;
import com.mywebservice.services.system.SystemService;

import javax.annotation.Nonnull;

public class DefaultVoxFactory implements VoxFactory {

    @Nonnull
    @Override
    public Vox create() {
        SystemService systemService = new SystemService();
        IDService idService = new UUIDService();
        EventService eventService = new DummyEventService();
        Storage sqlStorage = new SqlStorage(idService, systemService);
        Storage eventStorage = new EventNotifyingStorage(sqlStorage, eventService);

        return new Vox(eventStorage);
    }
}
