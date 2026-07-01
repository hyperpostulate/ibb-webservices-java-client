package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class IettGarage extends BaseDataModel {

    @SerializedName("GarajKodu")
    private String garajKodu;

    @SerializedName("GarajAdi")
    private String garajAdi;

    @SerializedName("Latitude")
    private Double latitude;

    @SerializedName("Longitude")
    private Double longitude;

    @SerializedName("Ilce")
    private String ilce;

    @SerializedName("Adres")
    private String adres;

    public String getGarajKodu() {
        return garajKodu;
    }

    public void setGarajKodu(String garajKodu) {
        this.garajKodu = garajKodu;
    }

    public String getGarajAdi() {
        return garajAdi;
    }

    public void setGarajAdi(String garajAdi) {
        this.garajAdi = garajAdi;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IettGarage that = (IettGarage) o;
        return Objects.equals(garajKodu, that.garajKodu) &&
                Objects.equals(garajAdi, that.garajAdi) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(ilce, that.ilce) &&
                Objects.equals(adres, that.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(garajKodu, garajAdi, latitude, longitude, ilce, adres);
    }

    @Override
    public String toString() {
        return "IettGarage{" +
                "garajKodu='" + garajKodu + '\'' +
                ", garajAdi='" + garajAdi + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", ilce='" + ilce + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
