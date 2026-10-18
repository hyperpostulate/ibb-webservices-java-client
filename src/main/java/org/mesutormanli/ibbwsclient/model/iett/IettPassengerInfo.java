package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir yolcu bilgisini temsil eder.
 */
public record IettPassengerInfo(
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
    /** Yolcu sayısı. */
    @SerializedName("YolcuSayisi") Integer yolcuSayisi,
    /** Tarih (API'nin döndürdüğü biçimde). */
    @SerializedName("Tarih") String tarih,
    /** Saat (API'nin döndürdüğü biçimde). */
    @SerializedName("Saat") String saat,
    /** Yön. */
    @SerializedName("Yon") String yon
) {}
