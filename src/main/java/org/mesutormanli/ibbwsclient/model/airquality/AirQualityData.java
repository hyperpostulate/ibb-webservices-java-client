package org.mesutormanli.ibbwsclient.model.airquality;

import com.google.gson.annotations.SerializedName;

public record AirQualityData(
    @SerializedName("ReadTime") String readTime,
    @SerializedName("Concentration") String concentration,
    @SerializedName("AQI") String AQI
) {}
