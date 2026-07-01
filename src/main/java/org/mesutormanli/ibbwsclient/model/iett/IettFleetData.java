package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettFleetData(
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi,
    @SerializedName("Plaka") String plaka,
    @SerializedName("KapiNo") String kapiNo,
    @SerializedName("SeferSayisi") Integer seferSayisi,
    @SerializedName("GerceklesenSefer") Integer gerceklesenSefer,
    @SerializedName("PlanlananSefer") Integer planlananSefer,
    @SerializedName("UyumOrani") String uyumOrani,
    @SerializedName("Durum") String durum,
    @SerializedName("Tarih") String tarih
) {}
