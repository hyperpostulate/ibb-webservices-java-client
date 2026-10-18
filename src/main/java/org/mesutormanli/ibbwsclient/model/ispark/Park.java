package org.mesutormanli.ibbwsclient.model.ispark;

import com.google.gson.annotations.SerializedName;

/**
 * IBB İSPARK API'sindeki bir otopark bilgisini temsil eder.
 */
public record Park(
    /**
     * Otoparkın kimliği.
     */
    @SerializedName("ParkID") Integer parkId,
    /**
     * Otoparkın adı.
     */
    @SerializedName("ParkAdi") String parkAdi,
    /**
     * Otoparkın enlem değeri.
     */
    @SerializedName("Latitude") String latitude,
    /**
     * Otoparkın boylam değeri.
     */
    @SerializedName("Longitude") String longitude,
    /**
     * Otoparkın kapasitesi.
     */
    @SerializedName("Kapasitesi") Integer kapasite,
    /**
     * Otoparkın boş kapasitesi.
     */
    @SerializedName("BosKapasite") Integer bosKapasite,
    /**
     * Otoparkın tipi.
     */
    @SerializedName("ParkTipi") String parkTipi,
    /**
     * Otoparkın bulunduğu ilçe.
     */
    @SerializedName("Ilce") String ilce,
    /**
     * Otoparkın mesafesi.
     */
    @SerializedName("Distance") Double distance,
    /**
     * Ücretsiz parklanma süresi (dakika).
     */
    @SerializedName("UcretsizParklanmaDk") Integer ucretsizParklanmaDk
) {}
