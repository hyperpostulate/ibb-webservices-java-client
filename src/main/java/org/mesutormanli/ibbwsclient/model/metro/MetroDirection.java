package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir hattın yönünü temsil eder.
 */
public record MetroDirection(
    /** Yön kimliği. */
    @SerializedName("DirectionId") int directionId,
    /** Yön adı. */
    @SerializedName("DirectionName") String directionName,
    /** Yön değeri. */
    @SerializedName("DirectionValue") int directionValue,
    /** Hat kimliği. */
    @SerializedName("LineId") int lineId,
    /** İstasyon kimliği. */
    @SerializedName("StationId") int stationId
) {}
