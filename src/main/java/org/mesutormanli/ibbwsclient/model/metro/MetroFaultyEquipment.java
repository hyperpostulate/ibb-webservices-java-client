package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir arızalı ekipman kaydını temsil eder.
 */
public record MetroFaultyEquipment(
    /** Kaydın kimliği. */
    @SerializedName("Id") int id,
    /** Ekipman adı. */
    @SerializedName("EquipmentName") String equipmentName,
    /** Arıza adı. */
    @SerializedName("FaultName") String faultName,
    /** Hat adı. */
    @SerializedName("LineName") String lineName,
    /** Teknik birim. */
    @SerializedName("TechnicalUnit") String technicalUnit,
    /** Kayıt tarihi (API'nin döndürdüğü biçimde). */
    @SerializedName("Date") String date
) {}
