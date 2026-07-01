package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroStation(
    @SerializedName("Id") int id,
    @SerializedName("Name") String name,
    @SerializedName("LineId") int lineId,
    @SerializedName("LineName") String lineName,
    @SerializedName("Description") String description,
    @SerializedName("Order") int order,
    @SerializedName("FunctionalCode") String functionalCode
) {}
