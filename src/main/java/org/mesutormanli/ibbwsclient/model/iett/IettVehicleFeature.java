package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettVehicleFeature(
    @SerializedName("KapiNo") String kapiNo,
    @SerializedName("Plaka") String plaka,
    @SerializedName("Marka") String marka,
    @SerializedName("Model") String model,
    @SerializedName("Yil") Integer yil,
    @SerializedName("YakitTuru") String yakitTuru,
    @SerializedName("UretimYili") Integer uretimYili,
    @SerializedName("Durumu") String durumu
) {}
