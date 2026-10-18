package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir filo verisini temsil eder.
 */
public record IettFleetData(
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
    /** Araç plakası. */
    @SerializedName("Plaka") String plaka,
    /** Kapı numarası. */
    @SerializedName("KapiNo") String kapiNo,
    /** Sefer sayısı. */
    @SerializedName("SeferSayisi") Integer seferSayisi,
    /** Gerçekleşen sefer sayısı. */
    @SerializedName("GerceklesenSefer") Integer gerceklesenSefer,
    /** Planlanan sefer sayısı. */
    @SerializedName("PlanlananSefer") Integer planlananSefer,
    /** Uyum oranı. */
    @SerializedName("UyumOrani") String uyumOrani,
    /** Durum. */
    @SerializedName("Durum") String durum,
    /** Tarih (API'nin döndürdüğü biçimde). */
    @SerializedName("Tarih") String tarih
) {}
