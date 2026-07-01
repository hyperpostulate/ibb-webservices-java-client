package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettMetrobusFrequency(
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi,
    @SerializedName("Yon") String yon,
    @SerializedName("Frekans") String frekans,
    @SerializedName("BaslangicSaati") String baslangicSaati,
    @SerializedName("BitisSaati") String bitisSaati,
    @SerializedName("Sure") String sure
) {}
