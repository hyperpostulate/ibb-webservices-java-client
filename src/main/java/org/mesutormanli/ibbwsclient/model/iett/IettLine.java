package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettLine(
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi,
    @SerializedName("HatUzunlugu") String hatUzunlugu,
    @SerializedName("HatTipi") String hatTipi,
    @SerializedName("AracSayisi") Integer aracSayisi,
    @SerializedName("SeferSuresi") Integer seferSuresi,
    @SerializedName("HatDurumu") String hatDurumu
) {}
