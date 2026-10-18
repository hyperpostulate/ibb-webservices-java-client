package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir arıza tipini temsil eder.
 */
public record MetroFaultType(
    /** Arıza tipinin kimliği. */
    @SerializedName("Id") int id,
    /** Arıza tipinin adı. */
    @SerializedName("Name") String name
) {}
