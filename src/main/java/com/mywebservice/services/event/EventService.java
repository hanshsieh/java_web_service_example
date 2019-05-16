package com.mywebservice.services.event;

import javax.annotation.Nonnull;

public interface EventService {
    void sendTrackCreateEvent(@Nonnull String trackId);
}
