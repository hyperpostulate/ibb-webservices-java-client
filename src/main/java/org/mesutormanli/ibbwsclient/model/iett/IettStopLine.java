package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettStopLine(
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi,
    @SerializedName("HatTipi") String hatTipi,
    @SerializedName("HatUzunlugu") String hatUzunlugu
) {}
