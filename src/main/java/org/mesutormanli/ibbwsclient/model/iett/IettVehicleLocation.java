package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class IettVehicleLocation extends BaseDataModel {

    @SerializedName("Plaka")
    private String plaka;

    @SerializedName("KapiNo")
    private String kapiNo;

    @SerializedName("HatKodu")
    private String hatKodu;

    @SerializedName("HatAdi")
    private String hatAdi;

    @SerializedName("Latitude")
    private Double latitude;

    @SerializedName("Longitude")
    private Double longitude;

    @SerializedName("Hiz")
    private Double hiz;

    @SerializedName("Yon")
    private String yon;

    @SerializedName("SonGuncelleme")
    private String sonGuncelleme;

    @SerializedName("DurakKodu")
    private String durakKodu;

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public String getHatKodu() {
        return hatKodu;
    }

    public void setHatKodu(String hatKodu) {
        this.hatKodu = hatKodu;
    }

    public String getHatAdi() {
        return hatAdi;
    }

    public void setHatAdi(String hatAdi) {
        this.hatAdi = hatAdi;
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

    public Double getHiz() {
        return hiz;
    }

    public void setHiz(Double hiz) {
        this.hiz = hiz;
    }

    public String getYon() {
        return yon;
    }

    public void setYon(String yon) {
        this.yon = yon;
    }

    public String getSonGuncelleme() {
        return sonGuncelleme;
    }

    public void setSonGuncelleme(String sonGuncelleme) {
        this.sonGuncelleme = sonGuncelleme;
    }

    public String getDurakKodu() {
        return durakKodu;
    }

    public void setDurakKodu(String durakKodu) {
        this.durakKodu = durakKodu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IettVehicleLocation that = (IettVehicleLocation) o;
        return Objects.equals(plaka, that.plaka) &&
                Objects.equals(kapiNo, that.kapiNo) &&
                Objects.equals(hatKodu, that.hatKodu) &&
                Objects.equals(hatAdi, that.hatAdi) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(hiz, that.hiz) &&
                Objects.equals(yon, that.yon) &&
                Objects.equals(sonGuncelleme, that.sonGuncelleme) &&
                Objects.equals(durakKodu, that.durakKodu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plaka, kapiNo, hatKodu, hatAdi, latitude, longitude, hiz, yon, sonGuncelleme, durakKodu);
    }

    @Override
    public String toString() {
        return "IettVehicleLocation{" +
                "plaka='" + plaka + '\'' +
                ", kapiNo='" + kapiNo + '\'' +
                ", hatKodu='" + hatKodu + '\'' +
                ", hatAdi='" + hatAdi + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", hiz=" + hiz +
                ", yon='" + yon + '\'' +
                ", sonGuncelleme='" + sonGuncelleme + '\'' +
                ", durakKodu='" + durakKodu + '\'' +
                '}';
    }
}
