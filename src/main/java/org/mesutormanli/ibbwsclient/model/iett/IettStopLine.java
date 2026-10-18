package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir durağa ait hattı temsil eder.
 */
public record IettStopLine(
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
    /** Hat tipi. */
    @SerializedName("HatTipi") String hatTipi,
    /** Hat uzunluğu. */
    @SerializedName("HatUzunlugu") String hatUzunlugu
) {}
