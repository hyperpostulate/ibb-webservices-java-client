package org.mesutormanli.ibbwsclient.model.ispark;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record ParkDetay(
    @SerializedName("ParkID") Integer parkID,
    @SerializedName("ParkAdi") String parkAdi,
    @SerializedName("Latitude") String latitude,
    @SerializedName("Longitude") String longitude,
    @SerializedName("Kapasitesi") Integer kapasitesi,
    @SerializedName("BosKapasite") Integer bosKapasite,
    @SerializedName("ParkTipi") String parkTipi,
    @SerializedName("Ilce") String ilce,
    @SerializedName("GuncellemeTarihi") String guncellemeTarihi,
    @SerializedName("CalismaSaatleri") String calismaSaatleri,
    @SerializedName("UcretsizParklanmaDk") Integer ucretsizParklanmaDk,
    @SerializedName("AylikAbonelikUcreti") Double aylikAbonelikUcreti,
    @SerializedName("Adres") String adres,
    @SerializedName("AreaPolygon") List<List<List<Double>>> areaPolygon,
    @SerializedName("Tarifeler") List<Tarife> tarifeler,
    @SerializedName("LokasyonAdi") String lokasyonAdi
) {}
