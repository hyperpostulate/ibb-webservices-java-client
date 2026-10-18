package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir durağı temsil eder.
 */
public record IettStop(
    /** Durak kodu. */
    @SerializedName("DurakKodu") String durakKodu,
    /** Durak adı. */
    @SerializedName("DurakAdi") String durakAdi,
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Yön. */
    @SerializedName("Yon") String yon,
    /** Enlem. */
    @SerializedName("Latitude") Double latitude,
    /** Boylam. */
    @SerializedName("Longitude") Double longitude,
    /** İlçe. */
    @SerializedName("Ilce") String ilce,
    /** Sıra numarası. */
    @SerializedName("SiraNo") Integer siraNo
) {}
