package com.mywebservice;

import com.mywebservice.services.id.IDService;
import com.mywebservice.services.storage.Storage;

import javax.annotation.Nonnull;

public class Vox {

    private final Storage storage;

    public Vox(@Nonnull Storage storage) {
        this.storage = storage;
    }

    @Nonnull
    public TrackCreate newTrackCreate() {
        return storage.newTrackCreate();
    }
}
