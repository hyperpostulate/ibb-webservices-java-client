package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir yolculuk verisini temsil eder.
 */
public record IettJourney(
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
    /** Yolcu sayısı. */
    @SerializedName("YolcuSayisi") Integer yolcuSayisi,
    /** Tarih (API'nin döndürdüğü biçimde). */
    @SerializedName("Tarih") String tarih,
    /** Sefer sayısı. */
    @SerializedName("SeferSayisi") Integer seferSayisi,
    /** Yön. */
    @SerializedName("Yon") String yon
) {}
