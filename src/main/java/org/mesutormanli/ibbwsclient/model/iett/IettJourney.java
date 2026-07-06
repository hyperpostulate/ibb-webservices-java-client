package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettJourney(
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi,
    @SerializedName("YolcuSayisi") Integer yolcuSayisi,
    @SerializedName("Tarih") String tarih,
    @SerializedName("SeferSayisi") Integer seferSayisi,
    @SerializedName("Yon") String yon
) {}
