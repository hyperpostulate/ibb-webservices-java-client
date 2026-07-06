package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettPassengerInfo(
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi,
    @SerializedName("YolcuSayisi") Integer yolcuSayisi,
    @SerializedName("Tarih") String tarih,
    @SerializedName("Saat") String saat,
    @SerializedName("Yon") String yon
) {}
