package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettLineServiceInfo(
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi,
    @SerializedName("HatUzunlugu") String hatUzunlugu,
    @SerializedName("SeferSuresi") Integer seferSuresi,
    @SerializedName("AracSayisi") Integer aracSayisi,
    @SerializedName("HatDurumu") String hatDurumu
) {}
