package com.mywebservice.services.id;

import com.mywebservice.VoxException;

import javax.annotation.Nonnull;

public interface IDService {

    @Nonnull
    String createTrackId() throws VoxException;
}
