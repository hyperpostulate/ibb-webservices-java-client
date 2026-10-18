package org.mesutormanli.ibbwsclient.model.yolbakim;

import com.google.gson.annotations.SerializedName;

/**
 * IBB yol bakım API'sindeki bir yol bakım çalışmasını temsil eder.
 */
public record YolBakimData(
    /**
     * Çalışmanın kimliği.
     */
    @SerializedName("id") String id,
    /**
     * Çalışmanın yapıldığı ilçe.
     */
    @SerializedName("ilce") String ilce,
    /**
     * Çalışmanın yapıldığı cadde/sokak.
     */
    @SerializedName("caddeSokak") String caddeSokak,
    /**
     * Çalışma tanımı.
     */
    @SerializedName("calismaTanimi") String calismaTanimi,
    /**
     * Çalışmanın başlangıç tarihi.
     */
    @SerializedName("calismaBaslangicTarihi") String calismaBaslangicTarihi,
    /**
     * Çalışmanın bitiş tarihi.
     */
    @SerializedName("calismaBitisTarihi") String calismaBitisTarihi,
    /**
     * Çalışmanın başlangıç saati.
     */
    @SerializedName("calismaBaslangicSaati") String calismaBaslangicSaati,
    /**
     * Çalışmanın bitiş saati.
     */
    @SerializedName("calismaBitisSaati") String calismaBitisSaati,
    /**
     * Çalışma konumunun enlem değeri.
     */
    @SerializedName("lat") String lat,
    /**
     * Çalışma konumunun boylam değeri.
     */
    @SerializedName("lon") String lon
) {}
