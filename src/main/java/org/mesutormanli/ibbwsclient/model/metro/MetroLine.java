package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir hattını temsil eder.
 */
public record MetroLine(
    /** Hattın kimliği. */
    @SerializedName("Id") int id,
    /** Hat adı. */
    @SerializedName("Name") String name,
    /** Hat açıklaması. */
    @SerializedName("Description") String description,
    /** Hat rengi. */
    @SerializedName("LineColor") String lineColor,
    /** Hat genişliği. */
    @SerializedName("LineWidth") int lineWidth
) {}
