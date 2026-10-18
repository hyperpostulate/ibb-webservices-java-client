package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir durağın detayını temsil eder.
 */
public record IettStopDetail(
    /** Durak kodu. */
    @SerializedName("DurakKodu") String durakKodu,
    /** Durak adı. */
    @SerializedName("DurakAdi") String durakAdi,
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
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
