package org.mesutormanli.ibbwsclient.model.isbike;

import com.google.gson.annotations.SerializedName;

/**
 * IBB İSBİKE API'sindeki bir bisiklet istasyonunu temsil eder.
 */
public record IsbikeStation(
    /**
     * İstasyonun kimliği (GUID).
     */
    @SerializedName("guid") int guid,
    /**
     * İstasyon numarası.
     */
    @SerializedName("istasyon_no") String istasyonNo,
    /**
     * İstasyon adı.
     */
    @SerializedName("adi") String istasyonAdi,
    /**
     * İstasyonun aktif olup olmadığını belirten değer.
     */
    @SerializedName("aktif") int aktif,
    /**
     * Boş bisiklet yuvası bilgisi.
     */
    @SerializedName("bos") String bos,
    /**
     * Dolu bisiklet yuvası bilgisi.
     */
    @SerializedName("dolu") String dolu,
    /**
     * İstasyonun enlem değeri.
     */
    @SerializedName("lat") String lat,
    /**
     * İstasyonun boylam değeri.
     */
    @SerializedName("lon") String lon,
    /**
     * İstasyonun son bağlantı bilgisi.
     */
    @SerializedName("sonBaglanti") String sonBaglanti
) {}
