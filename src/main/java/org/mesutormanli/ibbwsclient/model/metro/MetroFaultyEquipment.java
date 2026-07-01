package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroFaultyEquipment(
    @SerializedName("Id") int id,
    @SerializedName("EquipmentName") String equipmentName,
    @SerializedName("FaultName") String faultName,
    @SerializedName("LineName") String lineName,
    @SerializedName("TechnicalUnit") String technicalUnit,
    @SerializedName("Date") String date
) {}
