package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul iki istasyon arasındaki seyahat süresini temsil eder.
 */
public record MetroStationDuration(
    /** Hat kimliği. */
    @SerializedName("LineId") int lineId,
    /** Hat adı. */
    @SerializedName("LineName") String lineName,
    /** Başlangıç istasyonunun kimliği. */
    @SerializedName("FromStationId") int fromStationId,
    /** Başlangıç istasyonunun adı. */
    @SerializedName("FromStationName") String fromStationName,
    /** Varış istasyonunun kimliği. */
    @SerializedName("ToStationId") int toStationId,
    /** Varış istasyonunun adı. */
    @SerializedName("ToStationName") String toStationName,
    /** İki istasyon arasındaki süre. */
    @SerializedName("Duration") int duration
) {}
