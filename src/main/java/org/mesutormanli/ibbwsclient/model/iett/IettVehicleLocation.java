package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir aracın konumunu temsil eder.
 */
public record IettVehicleLocation(
    /** Araç plakası. */
    @SerializedName("Plaka") String plaka,
    /** Kapı numarası. */
    @SerializedName("KapiNo") String kapiNo,
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
    /** Enlem. */
    @SerializedName("Latitude") Double latitude,
    /** Boylam. */
    @SerializedName("Longitude") Double longitude,
    /** Hız. */
    @SerializedName("Hiz") Double hiz,
    /** Yön. */
    @SerializedName("Yon") String yon,
    /** Son güncelleme (API'nin döndürdüğü biçimde). */
    @SerializedName("SonGuncelleme") String sonGuncelleme,
    /** Durak kodu. */
    @SerializedName("DurakKodu") String durakKodu
) {}
