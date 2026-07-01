package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroTimeTable(
    @SerializedName("LineId") int lineId,
    @SerializedName("LineName") String lineName,
    @SerializedName("DirectionId") int directionId,
    @SerializedName("DirectionName") String directionName,
    @SerializedName("StationId") int stationId,
    @SerializedName("StationName") String stationName,
    @SerializedName("ArrivalTime") String arrivalTime
) {}
