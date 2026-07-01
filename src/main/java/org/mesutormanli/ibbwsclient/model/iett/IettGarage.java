package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettGarage(
    @SerializedName("GarajKodu") String garajKodu,
    @SerializedName("GarajAdi") String garajAdi,
    @SerializedName("Latitude") Double latitude,
    @SerializedName("Longitude") Double longitude,
    @SerializedName("Ilce") String ilce,
    @SerializedName("Adres") String adres
) {}
