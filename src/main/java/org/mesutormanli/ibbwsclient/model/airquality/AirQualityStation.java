package org.mesutormanli.ibbwsclient.model.airquality;

import com.google.gson.annotations.SerializedName;

/**
 * IBB hava kalitesi API'sindeki bir ölçüm istasyonunu temsil eder.
 */
public record AirQualityStation(
    /**
     * İstasyonun kimliği.
     */
    @SerializedName("Id") String id,
    /**
     * İstasyonun adı.
     */
    @SerializedName("Name") String name,
    /**
     * İstasyonun adresi.
     */
    @SerializedName("Address") String address,
    /**
     * İstasyonun konumu.
     */
    @SerializedName("Location") String location
) {}
