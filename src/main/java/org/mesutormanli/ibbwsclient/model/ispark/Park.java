package org.mesutormanli.ibbwsclient.model.ispark;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class Park extends BaseDataModel {

    @SerializedName("ParkID")
    private Integer parkId;

    @SerializedName("ParkAdi")
    private String parkAdi;

    @SerializedName("Latitude")
    private String latitude;

    @SerializedName("Longitude")
    private String longitude;

    @SerializedName("Kapasitesi")
    private Integer kapasite;

    @SerializedName("BosKapasite")
    private Integer bosKapasite;

    @SerializedName("ParkTipi")
    private String parkTipi;

    @SerializedName("Ilce")
    private String ilce;

    @SerializedName("Distance")
    private Double distance;

    @SerializedName("UcretsizParklanmaDk")
    private Integer ucretsizParklanmaDk;

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
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

    public Integer getKapasite() {
        return kapasite;
    }

    public void setKapasite(Integer kapasite) {
        this.kapasite = kapasite;
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

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getUcretsizParklanmaDk() {
        return ucretsizParklanmaDk;
    }

    public void setUcretsizParklanmaDk(Integer ucretsizParklanmaDk) {
        this.ucretsizParklanmaDk = ucretsizParklanmaDk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Park park = (Park) o;
        return Objects.equals(parkId, park.parkId) &&
                Objects.equals(parkAdi, park.parkAdi) &&
                Objects.equals(latitude, park.latitude) &&
                Objects.equals(longitude, park.longitude) &&
                Objects.equals(kapasite, park.kapasite) &&
                Objects.equals(bosKapasite, park.bosKapasite) &&
                Objects.equals(parkTipi, park.parkTipi) &&
                Objects.equals(ilce, park.ilce) &&
                Objects.equals(distance, park.distance) &&
                Objects.equals(ucretsizParklanmaDk, park.ucretsizParklanmaDk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkId, parkAdi, latitude, longitude, kapasite, bosKapasite, parkTipi, ilce, distance, ucretsizParklanmaDk);
    }

    @Override
    public String toString() {
        return "Park{" +
                "parkId=" + parkId +
                ", parkAdi='" + parkAdi + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", kapasite=" + kapasite +
                ", bosKapasite=" + bosKapasite +
                ", parkTipi='" + parkTipi + '\'' +
                ", ilce='" + ilce + '\'' +
                ", distance=" + distance +
                ", ucretsizParklanmaDk=" + ucretsizParklanmaDk +
                '}';
    }
}
