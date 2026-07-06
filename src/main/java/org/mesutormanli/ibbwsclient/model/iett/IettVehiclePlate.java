package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettVehiclePlate(
    @SerializedName("Plaka") String plaka,
    @SerializedName("KapiNo") String kapiNo,
    @SerializedName("Marka") String marka,
    @SerializedName("Model") String model,
    @SerializedName("Yil") Integer yil
) {}
