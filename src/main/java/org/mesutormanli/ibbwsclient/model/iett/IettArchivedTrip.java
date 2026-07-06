package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettArchivedTrip(
    @SerializedName("GorevNo") String gorevNo,
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi,
    @SerializedName("Plaka") String plaka,
    @SerializedName("Tarih") String tarih,
    @SerializedName("BaslangicSaati") String baslangicSaati,
    @SerializedName("BitisSaati") String bitisSaati,
    @SerializedName("Aciklama") String aciklama
) {}
