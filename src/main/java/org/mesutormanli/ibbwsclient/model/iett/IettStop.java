package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class IettStop extends BaseDataModel {

    @SerializedName("DurakKodu")
    private String durakKodu;

    @SerializedName("DurakAdi")
    private String durakAdi;

    @SerializedName("HatKodu")
    private String hatKodu;

    @SerializedName("Yon")
    private String yon;

    @SerializedName("Latitude")
    private Double latitude;

    @SerializedName("Longitude")
    private Double longitude;

    @SerializedName("Ilce")
    private String ilce;

    @SerializedName("SiraNo")
    private Integer siraNo;

    public String getDurakKodu() {
        return durakKodu;
    }

    public void setDurakKodu(String durakKodu) {
        this.durakKodu = durakKodu;
    }

    public String getDurakAdi() {
        return durakAdi;
    }

    public void setDurakAdi(String durakAdi) {
        this.durakAdi = durakAdi;
    }

    public String getHatKodu() {
        return hatKodu;
    }

    public void setHatKodu(String hatKodu) {
        this.hatKodu = hatKodu;
    }

    public String getYon() {
        return yon;
    }

    public void setYon(String yon) {
        this.yon = yon;
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

    public Integer getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(Integer siraNo) {
        this.siraNo = siraNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IettStop that = (IettStop) o;
        return Objects.equals(durakKodu, that.durakKodu) &&
                Objects.equals(durakAdi, that.durakAdi) &&
                Objects.equals(hatKodu, that.hatKodu) &&
                Objects.equals(yon, that.yon) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(ilce, that.ilce) &&
                Objects.equals(siraNo, that.siraNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(durakKodu, durakAdi, hatKodu, yon, latitude, longitude, ilce, siraNo);
    }

    @Override
    public String toString() {
        return "IettStop{" +
                "durakKodu='" + durakKodu + '\'' +
                ", durakAdi='" + durakAdi + '\'' +
                ", hatKodu='" + hatKodu + '\'' +
                ", yon='" + yon + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", ilce='" + ilce + '\'' +
                ", siraNo=" + siraNo +
                '}';
    }
}
