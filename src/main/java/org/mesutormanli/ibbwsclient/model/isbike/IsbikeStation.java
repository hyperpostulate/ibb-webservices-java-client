package org.mesutormanli.ibbwsclient.model.isbike;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class IsbikeStation extends BaseDataModel {

    @SerializedName("guid")
    private int guid;

    @SerializedName("istasyon_no")
    private String istasyonNo;

    @SerializedName("adi")
    private String istasyonAdi;

    @SerializedName("aktif")
    private int aktif;

    @SerializedName("bos")
    private String bos;

    @SerializedName("dolu")
    private String dolu;

    @SerializedName("lat")
    private String lat;

    @SerializedName("lon")
    private String lon;

    @SerializedName("sonBaglanti")
    private String sonBaglanti;

    public int getGuid() {
        return guid;
    }

    public void setGuid(int guid) {
        this.guid = guid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsbikeStation that = (IsbikeStation) o;
        return guid == that.guid &&
                aktif == that.aktif &&
                Objects.equals(istasyonNo, that.istasyonNo) &&
                Objects.equals(istasyonAdi, that.istasyonAdi) &&
                Objects.equals(bos, that.bos) &&
                Objects.equals(dolu, that.dolu) &&
                Objects.equals(lat, that.lat) &&
                Objects.equals(lon, that.lon) &&
                Objects.equals(sonBaglanti, that.sonBaglanti);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid, istasyonNo, istasyonAdi, aktif, bos, dolu, lat, lon, sonBaglanti);
    }

    @Override
    public String toString() {
        return "IsbikeStation{" +
                "guid=" + guid +
                ", istasyonNo='" + istasyonNo + '\'' +
                ", istasyonAdi='" + istasyonAdi + '\'' +
                ", aktif=" + aktif +
                ", bos='" + bos + '\'' +
                ", dolu='" + dolu + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", sonBaglanti='" + sonBaglanti + '\'' +
                '}';
    }
}
