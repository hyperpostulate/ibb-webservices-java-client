package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir hattın sefer saatleri çizelgesini temsil eder.
 */
public record MetroTimeTable(
    /** Hat kimliği. */
    @SerializedName("LineId") int lineId,
    /** Hat adı. */
    @SerializedName("LineName") String lineName,
    /** Yön kimliği. */
    @SerializedName("DirectionId") int directionId,
    /** Yön adı. */
    @SerializedName("DirectionName") String directionName,
    /** İstasyon kimliği. */
    @SerializedName("StationId") int stationId,
    /** İstasyon adı. */
    @SerializedName("StationName") String stationName,
    /** Varış saati. */
    @SerializedName("ArrivalTime") String arrivalTime
) {}
