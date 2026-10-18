package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul ile ilgili bir adres bilgisini temsil eder.
 */
public record MetroAddress(
    /** Adresin kimliği. */
    @SerializedName("Id") int id,
    /** Adres adı. */
    @SerializedName("Name") String name,
    /** Açık adres. */
    @SerializedName("Address") String address,
    /** Telefon numarası. */
    @SerializedName("Phone") String phone,
    /** Enlem. */
    @SerializedName("Latitude") String latitude,
    /** Boylam. */
    @SerializedName("Longitude") String longitude
) {}
