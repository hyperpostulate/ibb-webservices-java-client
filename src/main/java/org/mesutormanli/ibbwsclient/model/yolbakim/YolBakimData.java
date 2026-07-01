package org.mesutormanli.ibbwsclient.model.yolbakim;

import com.google.gson.annotations.SerializedName;

public record YolBakimData(
    @SerializedName("id") String id,
    @SerializedName("ilce") String ilce,
    @SerializedName("caddeSokak") String caddeSokak,
    @SerializedName("calismaTanimi") String calismaTanimi,
    @SerializedName("calismaBaslangicTarihi") String calismaBaslangicTarihi,
    @SerializedName("calismaBitisTarihi") String calismaBitisTarihi,
    @SerializedName("calismaBaslangicSaati") String calismaBaslangicSaati,
    @SerializedName("calismaBitisSaati") String calismaBitisSaati,
    @SerializedName("lat") String lat,
    @SerializedName("lon") String lon
) {}
