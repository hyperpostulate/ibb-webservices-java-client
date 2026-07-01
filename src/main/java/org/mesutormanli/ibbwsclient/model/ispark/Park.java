package org.mesutormanli.ibbwsclient.model.ispark;

import com.google.gson.annotations.SerializedName;

public record Park(
    @SerializedName("ParkID") Integer parkId,
    @SerializedName("ParkAdi") String parkAdi,
    @SerializedName("Latitude") String latitude,
    @SerializedName("Longitude") String longitude,
    @SerializedName("Kapasitesi") Integer kapasite,
    @SerializedName("BosKapasite") Integer bosKapasite,
    @SerializedName("ParkTipi") String parkTipi,
    @SerializedName("Ilce") String ilce,
    @SerializedName("Distance") Double distance,
    @SerializedName("UcretsizParklanmaDk") Integer ucretsizParklanmaDk
) {}
