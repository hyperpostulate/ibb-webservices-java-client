package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir istasyonunu temsil eder.
 */
public record MetroStation(
    /** İstasyonun kimliği. */
    @SerializedName("Id") int id,
    /** İstasyon adı. */
    @SerializedName("Name") String name,
    /** Hat kimliği. */
    @SerializedName("LineId") int lineId,
    /** Hat adı. */
    @SerializedName("LineName") String lineName,
    /** İstasyon açıklaması. */
    @SerializedName("Description") String description,
    /** İstasyonun hat üzerindeki sırası. */
    @SerializedName("Order") int order,
    /** İstasyonun işlevsel kodu. */
    @SerializedName("FunctionalCode") String functionalCode
) {}
