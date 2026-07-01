package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroAddress(
    @SerializedName("Id") int id,
    @SerializedName("Name") String name,
    @SerializedName("Address") String address,
    @SerializedName("Phone") String phone,
    @SerializedName("Latitude") String latitude,
    @SerializedName("Longitude") String longitude
) {}
