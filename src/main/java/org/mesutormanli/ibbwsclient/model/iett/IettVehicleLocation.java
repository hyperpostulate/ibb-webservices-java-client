package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettVehicleLocation(
    @SerializedName("Plaka") String plaka,
    @SerializedName("KapiNo") String kapiNo,
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi,
    @SerializedName("Latitude") Double latitude,
    @SerializedName("Longitude") Double longitude,
    @SerializedName("Hiz") Double hiz,
    @SerializedName("Yon") String yon,
    @SerializedName("SonGuncelleme") String sonGuncelleme,
    @SerializedName("DurakKodu") String durakKodu
) {}
