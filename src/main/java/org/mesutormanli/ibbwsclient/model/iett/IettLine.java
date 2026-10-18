package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir hattı temsil eder.
 */
public record IettLine(
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
    /** Hat uzunluğu. */
    @SerializedName("HatUzunlugu") String hatUzunlugu,
    /** Hat tipi. */
    @SerializedName("HatTipi") String hatTipi,
    /** Araç sayısı. */
    @SerializedName("AracSayisi") Integer aracSayisi,
    /** Sefer süresi. */
    @SerializedName("SeferSuresi") Integer seferSuresi,
    /** Hat durumu. */
    @SerializedName("HatDurumu") String hatDurumu
) {}
