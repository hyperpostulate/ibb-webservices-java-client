package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir arızalı ekipmana ilişkin detayı temsil eder.
 */
public record MetroFaultyEquipmentDetail(
    /** Kaydın kimliği. */
    @SerializedName("Id") int id,
    /** Ekipman adı. */
    @SerializedName("EquipmentName") String equipmentName,
    /** Arıza açıklaması. */
    @SerializedName("FaultyDescription") String faultyDescription,
    /** Hat adı. */
    @SerializedName("LineName") String lineName,
    /** İstasyon adı. */
    @SerializedName("StationName") String stationName,
    /** Kayıt tarihi (API'nin döndürdüğü biçimde). */
    @SerializedName("Date") String date,
    /** Durum. */
    @SerializedName("Status") String status
) {}
