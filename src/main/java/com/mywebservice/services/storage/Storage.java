package com.mywebservice.services.storage;

import com.mywebservice.Track;
import com.mywebservice.TrackCreate;

import javax.annotation.Nonnull;

public interface Storage {
    @Nonnull
    TrackCreate newTrackCreate();

    @Nonnull
    Track getTrack(@Nonnull String id);
}
