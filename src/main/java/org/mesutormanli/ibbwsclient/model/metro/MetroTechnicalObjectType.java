package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir teknik nesne türünü temsil eder.
 */
public record MetroTechnicalObjectType(
    /** Türün kimliği. */
    @SerializedName("Id") int id,
    /** Tür adı. */
    @SerializedName("Name") String name,
    /** Tür açıklaması. */
    @SerializedName("Description") String description
) {}
