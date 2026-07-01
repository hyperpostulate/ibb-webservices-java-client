package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettStop(
    @SerializedName("DurakKodu") String durakKodu,
    @SerializedName("DurakAdi") String durakAdi,
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("Yon") String yon,
    @SerializedName("Latitude") Double latitude,
    @SerializedName("Longitude") Double longitude,
    @SerializedName("Ilce") String ilce,
    @SerializedName("SiraNo") Integer siraNo
) {}
