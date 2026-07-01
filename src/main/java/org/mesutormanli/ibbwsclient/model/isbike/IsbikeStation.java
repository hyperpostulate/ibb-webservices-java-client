package org.mesutormanli.ibbwsclient.model.isbike;

import com.google.gson.annotations.SerializedName;

public record IsbikeStation(
    @SerializedName("guid") int guid,
    @SerializedName("istasyon_no") String istasyonNo,
    @SerializedName("adi") String istasyonAdi,
    @SerializedName("aktif") int aktif,
    @SerializedName("bos") String bos,
    @SerializedName("dolu") String dolu,
    @SerializedName("lat") String lat,
    @SerializedName("lon") String lon,
    @SerializedName("sonBaglanti") String sonBaglanti
) {}
