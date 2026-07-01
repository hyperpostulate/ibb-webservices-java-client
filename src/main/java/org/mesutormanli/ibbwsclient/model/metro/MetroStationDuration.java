package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroStationDuration(
    @SerializedName("LineId") int lineId,
    @SerializedName("LineName") String lineName,
    @SerializedName("FromStationId") int fromStationId,
    @SerializedName("FromStationName") String fromStationName,
    @SerializedName("ToStationId") int toStationId,
    @SerializedName("ToStationName") String toStationName,
    @SerializedName("Duration") int duration
) {}
