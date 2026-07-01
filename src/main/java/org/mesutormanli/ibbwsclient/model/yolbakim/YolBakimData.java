package org.mesutormanli.ibbwsclient.model.yolbakim;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class YolBakimData extends BaseDataModel {

    @SerializedName("id")
    private String id;

    @SerializedName("ilce")
    private String ilce;

    @SerializedName("caddeSokak")
    private String caddeSokak;

    @SerializedName("calismaTanimi")
    private String calismaTanimi;

    @SerializedName("calismaBaslangicTarihi")
    private String calismaBaslangicTarihi;

    @SerializedName("calismaBitisTarihi")
    private String calismaBitisTarihi;

    @SerializedName("calismaBaslangicSaati")
    private String calismaBaslangicSaati;

    @SerializedName("calismaBitisSaati")
    private String calismaBitisSaati;

    @SerializedName("lat")
    private String lat;

    @SerializedName("lon")
    private String lon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getCaddeSokak() {
        return caddeSokak;
    }

    public void setCaddeSokak(String caddeSokak) {
        this.caddeSokak = caddeSokak;
    }

    public String getCalismaTanimi() {
        return calismaTanimi;
    }

    public void setCalismaTanimi(String calismaTanimi) {
        this.calismaTanimi = calismaTanimi;
    }

    public String getCalismaBaslangicTarihi() {
        return calismaBaslangicTarihi;
    }

    public void setCalismaBaslangicTarihi(String calismaBaslangicTarihi) {
        this.calismaBaslangicTarihi = calismaBaslangicTarihi;
    }

    public String getCalismaBitisTarihi() {
        return calismaBitisTarihi;
    }

    public void setCalismaBitisTarihi(String calismaBitisTarihi) {
        this.calismaBitisTarihi = calismaBitisTarihi;
    }

    public String getCalismaBaslangicSaati() {
        return calismaBaslangicSaati;
    }

    public void setCalismaBaslangicSaati(String calismaBaslangicSaati) {
        this.calismaBaslangicSaati = calismaBaslangicSaati;
    }

    public String getCalismaBitisSaati() {
        return calismaBitisSaati;
    }

    public void setCalismaBitisSaati(String calismaBitisSaati) {
        this.calismaBitisSaati = calismaBitisSaati;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YolBakimData that = (YolBakimData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ilce, that.ilce) &&
                Objects.equals(caddeSokak, that.caddeSokak) &&
                Objects.equals(calismaTanimi, that.calismaTanimi) &&
                Objects.equals(calismaBaslangicTarihi, that.calismaBaslangicTarihi) &&
                Objects.equals(calismaBitisTarihi, that.calismaBitisTarihi) &&
                Objects.equals(calismaBaslangicSaati, that.calismaBaslangicSaati) &&
                Objects.equals(calismaBitisSaati, that.calismaBitisSaati) &&
                Objects.equals(lat, that.lat) &&
                Objects.equals(lon, that.lon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ilce, caddeSokak, calismaTanimi, calismaBaslangicTarihi, calismaBitisTarihi, calismaBaslangicSaati, calismaBitisSaati, lat, lon);
    }

    @Override
    public String toString() {
        return "YolBakimData{" +
                "id='" + id + '\'' +
                ", ilce='" + ilce + '\'' +
                ", caddeSokak='" + caddeSokak + '\'' +
                ", calismaTanimi='" + calismaTanimi + '\'' +
                ", calismaBaslangicTarihi='" + calismaBaslangicTarihi + '\'' +
                ", calismaBitisTarihi='" + calismaBitisTarihi + '\'' +
                ", calismaBaslangicSaati='" + calismaBaslangicSaati + '\'' +
                ", calismaBitisSaati='" + calismaBitisSaati + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                '}';
    }
}
