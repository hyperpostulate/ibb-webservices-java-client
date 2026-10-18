package org.mesutormanli.ibbwsclient.model.ispark;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * IBB İSPARK API'sindeki bir otoparkın ayrıntılı bilgilerini temsil eder.
 */
public record ParkDetay(
    /**
     * Otoparkın kimliği.
     */
    @SerializedName("ParkID") Integer parkID,
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
    @SerializedName("Kapasitesi") Integer kapasitesi,
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
     * Bilgilerin güncellenme tarihi.
     */
    @SerializedName("GuncellemeTarihi") String guncellemeTarihi,
    /**
     * Otoparkın çalışma saatleri.
     */
    @SerializedName("CalismaSaatleri") String calismaSaatleri,
    /**
     * Ücretsiz parklanma süresi (dakika).
     */
    @SerializedName("UcretsizParklanmaDk") Integer ucretsizParklanmaDk,
    /**
     * Aylık abonelik ücreti.
     */
    @SerializedName("AylikAbonelikUcreti") Double aylikAbonelikUcreti,
    /**
     * Otoparkın adresi.
     */
    @SerializedName("Adres") String adres,
    /**
     * Otopark alanını tanımlayan poligon koordinatları.
     */
    @SerializedName("AreaPolygon") List<List<List<Double>>> areaPolygon,
    /**
     * Otoparkın tarifelerinin listesi.
     */
    @SerializedName("Tarifeler") List<Tarife> tarifeler,
    /**
     * Otoparkın lokasyon adı.
     */
    @SerializedName("LokasyonAdi") String lokasyonAdi
) {}
