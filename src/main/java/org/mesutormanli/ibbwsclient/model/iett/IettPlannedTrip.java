package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT planlanan bir seferi temsil eder.
 */
public record IettPlannedTrip(
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
    /** Sefer saati. */
    @SerializedName("SeferSaati") String seferSaati,
    /** Yön. */
    @SerializedName("Yon") String yon,
    /** Durak kodu. */
    @SerializedName("DurakKodu") String durakKodu,
    /** Durak adı. */
    @SerializedName("DurakAdi") String durakAdi,
    /** Hareket saati. */
    @SerializedName("HareketSaati") String hareketSaati
) {}
