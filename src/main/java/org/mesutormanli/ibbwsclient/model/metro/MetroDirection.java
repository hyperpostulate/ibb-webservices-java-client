package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroDirection(
    @SerializedName("DirectionId") int directionId,
    @SerializedName("DirectionName") String directionName,
    @SerializedName("DirectionValue") int directionValue,
    @SerializedName("LineId") int lineId,
    @SerializedName("StationId") int stationId
) {}
