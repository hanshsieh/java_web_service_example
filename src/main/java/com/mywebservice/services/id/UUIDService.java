package com.mywebservice.services.id;

import com.mywebservice.VoxException;

import javax.annotation.Nonnull;
import java.util.UUID;

public class UUIDService implements IDService {
    @Nonnull
    @Override
    public String createTrackId() throws VoxException {
        return UUID.randomUUID().toString();
    }
}
