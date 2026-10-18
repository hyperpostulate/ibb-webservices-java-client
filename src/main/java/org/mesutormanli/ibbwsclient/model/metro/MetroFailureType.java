package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir arıza türünü temsil eder.
 */
public record MetroFailureType(
    /** Arıza türünün kimliği. */
    @SerializedName("Id") int id,
    /** Arıza türünün adı. */
    @SerializedName("Name") String name
) {}
