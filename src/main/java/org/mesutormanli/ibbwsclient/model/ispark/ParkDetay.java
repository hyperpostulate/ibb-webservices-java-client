package org.mesutormanli.ibbwsclient.model.ispark;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.List;
import java.util.Objects;

public class ParkDetay extends BaseDataModel {

    @SerializedName("ParkID")
    private Integer parkID;

    @SerializedName("ParkAdi")
    private String parkAdi;

    @SerializedName("Latitude")
    private String latitude;

    @SerializedName("Longitude")
    private String longitude;

    @SerializedName("Kapasitesi")
    private Integer kapasitesi;

    @SerializedName("BosKapasite")
    private Integer bosKapasite;

    @SerializedName("ParkTipi")
    private String parkTipi;

    @SerializedName("Ilce")
    private String ilce;

    @SerializedName("GuncellemeTarihi")
    private String guncellemeTarihi;

    @SerializedName("CalismaSaatleri")
    private String calismaSaatleri;

    @SerializedName("UcretsizParklanmaDk")
    private Integer ucretsizParklanmaDk;

    @SerializedName("AylikAbonelikUcreti")
    private Double aylikAbonelikUcreti;

    @SerializedName("Adres")
    private String adres;

    @SerializedName("AreaPolygon")
    private List<List<List<Double>>> areaPolygon;

    @SerializedName("Tarifeler")
    private List<Tarife> tarifeler;

    @SerializedName("LokasyonAdi")
    private String lokasyonAdi;

    public Integer getParkID() {
        return parkID;
    }

    public void setParkID(Integer parkID) {
        this.parkID = parkID;
    }

    public String getParkAdi() {
        return parkAdi;
    }

    public void setParkAdi(String parkAdi) {
        this.parkAdi = parkAdi;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Integer getKapasitesi() {
        return kapasitesi;
    }

    public void setKapasitesi(Integer kapasitesi) {
        this.kapasitesi = kapasitesi;
    }

    public Integer getBosKapasite() {
        return bosKapasite;
    }

    public void setBosKapasite(Integer bosKapasite) {
        this.bosKapasite = bosKapasite;
    }

    public String getParkTipi() {
        return parkTipi;
    }

    public void setParkTipi(String parkTipi) {
        this.parkTipi = parkTipi;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getGuncellemeTarihi() {
        return guncellemeTarihi;
    }

    public void setGuncellemeTarihi(String guncellemeTarihi) {
        this.guncellemeTarihi = guncellemeTarihi;
    }

    public String getCalismaSaatleri() {
        return calismaSaatleri;
    }

    public void setCalismaSaatleri(String calismaSaatleri) {
        this.calismaSaatleri = calismaSaatleri;
    }

    public Integer getUcretsizParklanmaDk() {
        return ucretsizParklanmaDk;
    }

    public void setUcretsizParklanmaDk(Integer ucretsizParklanmaDk) {
        this.ucretsizParklanmaDk = ucretsizParklanmaDk;
    }

    public Double getAylikAbonelikUcreti() {
        return aylikAbonelikUcreti;
    }

    public void setAylikAbonelikUcreti(Double aylikAbonelikUcreti) {
        this.aylikAbonelikUcreti = aylikAbonelikUcreti;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<List<List<Double>>> getAreaPolygon() {
        return areaPolygon;
    }

    public void setAreaPolygon(List<List<List<Double>>> areaPolygon) {
        this.areaPolygon = areaPolygon;
    }

    public List<Tarife> getTarifeler() {
        return tarifeler;
    }

    public void setTarifeler(List<Tarife> tarifeler) {
        this.tarifeler = tarifeler;
    }

    public String getLokasyonAdi() {
        return lokasyonAdi;
    }

    public void setLokasyonAdi(String lokasyonAdi) {
        this.lokasyonAdi = lokasyonAdi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkDetay parkDetay = (ParkDetay) o;
        return Objects.equals(parkID, parkDetay.parkID) &&
                Objects.equals(parkAdi, parkDetay.parkAdi) &&
                Objects.equals(latitude, parkDetay.latitude) &&
                Objects.equals(longitude, parkDetay.longitude) &&
                Objects.equals(kapasitesi, parkDetay.kapasitesi) &&
                Objects.equals(bosKapasite, parkDetay.bosKapasite) &&
                Objects.equals(parkTipi, parkDetay.parkTipi) &&
                Objects.equals(ilce, parkDetay.ilce) &&
                Objects.equals(guncellemeTarihi, parkDetay.guncellemeTarihi) &&
                Objects.equals(calismaSaatleri, parkDetay.calismaSaatleri) &&
                Objects.equals(ucretsizParklanmaDk, parkDetay.ucretsizParklanmaDk) &&
                Objects.equals(aylikAbonelikUcreti, parkDetay.aylikAbonelikUcreti) &&
                Objects.equals(adres, parkDetay.adres) &&
                Objects.equals(areaPolygon, parkDetay.areaPolygon) &&
                Objects.equals(tarifeler, parkDetay.tarifeler) &&
                Objects.equals(lokasyonAdi, parkDetay.lokasyonAdi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkID, parkAdi, latitude, longitude, kapasitesi, bosKapasite, parkTipi, ilce, guncellemeTarihi, calismaSaatleri, ucretsizParklanmaDk, aylikAbonelikUcreti, adres, areaPolygon, tarifeler, lokasyonAdi);
    }

    @Override
    public String toString() {
        return "ParkDetay{" +
                "parkID=" + parkID +
                ", parkAdi='" + parkAdi + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", kapasitesi=" + kapasitesi +
                ", bosKapasite=" + bosKapasite +
                ", parkTipi='" + parkTipi + '\'' +
                ", ilce='" + ilce + '\'' +
                ", guncellemeTarihi='" + guncellemeTarihi + '\'' +
                ", calismaSaatleri='" + calismaSaatleri + '\'' +
                ", ucretsizParklanmaDk=" + ucretsizParklanmaDk +
                ", aylikAbonelikUcreti=" + aylikAbonelikUcreti +
                ", adres='" + adres + '\'' +
                ", areaPolygon=" + areaPolygon +
                ", tarifeler=" + tarifeler +
                ", lokasyonAdi='" + lokasyonAdi + '\'' +
                '}';
    }
}
