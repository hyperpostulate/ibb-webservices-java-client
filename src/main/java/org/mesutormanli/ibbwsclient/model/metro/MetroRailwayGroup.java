package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir raylı sistem grubunu temsil eder.
 */
public record MetroRailwayGroup(
    /** Grubun kimliği. */
    @SerializedName("Id") int id,
    /** Grup adı. */
    @SerializedName("Name") String name,
    /** Grup açıklaması. */
    @SerializedName("Description") String description
) {}
