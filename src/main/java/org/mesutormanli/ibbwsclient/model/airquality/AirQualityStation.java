package org.mesutormanli.ibbwsclient.model.airquality;

import com.google.gson.annotations.SerializedName;

public record AirQualityStation(
    @SerializedName("Id") String id,
    @SerializedName("Name") String name,
    @SerializedName("Address") String address,
    @SerializedName("Location") String location
) {}
