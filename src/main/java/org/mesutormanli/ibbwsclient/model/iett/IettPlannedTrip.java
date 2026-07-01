package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettPlannedTrip(
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi,
    @SerializedName("SeferSaati") String seferSaati,
    @SerializedName("Yon") String yon,
    @SerializedName("DurakKodu") String durakKodu,
    @SerializedName("DurakAdi") String durakAdi,
    @SerializedName("HareketSaati") String hareketSaati
) {}
