package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettFuelConsumption(
    @SerializedName("Yil") Integer yil,
    @SerializedName("Ay") Integer ay,
    @SerializedName("ToplamLitre") Double toplamLitre,
    @SerializedName("YakitTuru") String yakitTuru,
    @SerializedName("OrtalamaTuketim") Double ortalamaTuketim,
    @SerializedName("AracSayisi") Integer aracSayisi
) {}
