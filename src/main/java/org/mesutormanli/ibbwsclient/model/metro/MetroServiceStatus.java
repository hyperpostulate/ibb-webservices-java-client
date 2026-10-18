package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir hattın servis durumunu temsil eder.
 */
public record MetroServiceStatus(
    /** Hat kimliği. */
    @SerializedName("LineId") int lineId,
    /** Durum açıklaması. */
    @SerializedName("Description") String description,
    /** Hattın etkin olup olmadığı. */
    @SerializedName("IsActive") boolean active,
    /** Hat adı. */
    @SerializedName("LineName") String lineName,
    /** Hattın rengi. */
    @SerializedName("LineColor") LineColor lineColor
) {
    /**
     * Bir hattın RGB renk bileşenlerini temsil eder.
     */
    public record LineColor(
        /** Kırmızı renk bileşeni. */
        @SerializedName("Color_R") String colorR,
        /** Yeşil renk bileşeni. */
        @SerializedName("Color_G") String colorG,
        /** Mavi renk bileşeni. */
        @SerializedName("Color_B") String colorB
    ) {}
}
