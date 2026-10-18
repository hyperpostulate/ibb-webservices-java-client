package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir harita bilgisini temsil eder.
 */
public record MetroMap(
    /** Haritanın kimliği. */
    @SerializedName("Id") int id,
    /** Harita adı. */
    @SerializedName("Name") String name,
    /** Harita görselinin adresi. */
    @SerializedName("ImageUrl") String imageUrl,
    /** Harita açıklaması. */
    @SerializedName("Description") String description
) {}
