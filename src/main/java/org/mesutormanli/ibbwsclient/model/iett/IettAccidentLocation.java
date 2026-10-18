package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir kaza konumunu temsil eder.
 */
public record IettAccidentLocation(
    /** Kaza numarası. */
    @SerializedName("KazaNo") String kazaNo,
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
    /** Araç plakası. */
    @SerializedName("Plaka") String plaka,
    /** Enlem. */
    @SerializedName("Latitude") Double latitude,
    /** Boylam. */
    @SerializedName("Longitude") Double longitude,
    /** Tarih (API'nin döndürdüğü biçimde). */
    @SerializedName("Tarih") String tarih,
    /** Saat (API'nin döndürdüğü biçimde). */
    @SerializedName("Saat") String saat,
    /** Açıklama. */
    @SerializedName("Aciklama") String aciklama
) {}
