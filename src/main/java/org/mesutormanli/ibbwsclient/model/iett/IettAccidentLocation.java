package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettAccidentLocation(
    @SerializedName("KazaNo") String kazaNo,
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi,
    @SerializedName("Plaka") String plaka,
    @SerializedName("Latitude") Double latitude,
    @SerializedName("Longitude") Double longitude,
    @SerializedName("Tarih") String tarih,
    @SerializedName("Saat") String saat,
    @SerializedName("Aciklama") String aciklama
) {}
