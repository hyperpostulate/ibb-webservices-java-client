package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir hattın servis bilgisini temsil eder.
 */
public record IettLineServiceInfo(
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
    /** Hat uzunluğu. */
    @SerializedName("HatUzunlugu") String hatUzunlugu,
    /** Sefer süresi. */
    @SerializedName("SeferSuresi") Integer seferSuresi,
    /** Araç sayısı. */
    @SerializedName("AracSayisi") Integer aracSayisi,
    /** Hat durumu. */
    @SerializedName("HatDurumu") String hatDurumu
) {}
