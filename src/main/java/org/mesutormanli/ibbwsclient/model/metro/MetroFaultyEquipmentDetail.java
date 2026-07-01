package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroFaultyEquipmentDetail(
    @SerializedName("Id") int id,
    @SerializedName("EquipmentName") String equipmentName,
    @SerializedName("FaultyDescription") String faultyDescription,
    @SerializedName("LineName") String lineName,
    @SerializedName("StationName") String stationName,
    @SerializedName("Date") String date,
    @SerializedName("Status") String status
) {}
