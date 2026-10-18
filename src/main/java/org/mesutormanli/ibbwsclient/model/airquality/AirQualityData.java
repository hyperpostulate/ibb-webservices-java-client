package org.mesutormanli.ibbwsclient.model.airquality;

import com.google.gson.annotations.SerializedName;

/**
 * IBB hava kalitesi API'sinden dönen bir hava kalitesi ölçüm verisini temsil eder.
 */
public record AirQualityData(
    /**
     * Ölçümün gerçekleştiği zaman.
     */
    @SerializedName("ReadTime") String readTime,
    /**
     * Ölçülen konsantrasyon değeri.
     */
    @SerializedName("Concentration") String concentration,
    /**
     * Hava kalitesi indeksi (AQI) değeri.
     */
    @SerializedName("AQI") String AQI
) {}
