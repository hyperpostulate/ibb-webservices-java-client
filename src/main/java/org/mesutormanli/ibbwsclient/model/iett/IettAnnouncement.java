package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public record IettAnnouncement(
    @SerializedName("Baslik") String baslik,
    @SerializedName("Icerik") String icerik,
    @SerializedName("Tarih") String tarih,
    @SerializedName("HatKodu") String hatKodu,
    @SerializedName("HatAdi") String hatAdi
) {}
