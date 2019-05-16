package com.mywebservice;

import javax.annotation.Nonnull;

public interface VoxFactory {

    @Nonnull
    Vox create();
}
