package com.mywebservice.services.storage.sql;

import org.apache.ibatis.annotations.Param;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public interface TrackMapper {

    int insertTrack(@Param("track") TrackModel track);
}
