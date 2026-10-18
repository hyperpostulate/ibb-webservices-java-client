package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir garajı temsil eder.
 */
public record IettGarage(
    /** Garaj kodu. */
    @SerializedName("GarajKodu") String garajKodu,
    /** Garaj adı. */
    @SerializedName("GarajAdi") String garajAdi,
    /** Enlem. */
    @SerializedName("Latitude") Double latitude,
    /** Boylam. */
    @SerializedName("Longitude") Double longitude,
    /** İlçe. */
    @SerializedName("Ilce") String ilce,
    /** Adres. */
    @SerializedName("Adres") String adres
) {}
