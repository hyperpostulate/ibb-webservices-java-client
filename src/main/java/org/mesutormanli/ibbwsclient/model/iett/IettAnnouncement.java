package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class IettAnnouncement extends BaseDataModel {

    @SerializedName("Baslik")
    private String baslik;

    @SerializedName("Icerik")
    private String icerik;

    @SerializedName("Tarih")
    private String tarih;

    @SerializedName("HatKodu")
    private String hatKodu;

    @SerializedName("HatAdi")
    private String hatAdi;

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IettAnnouncement that = (IettAnnouncement) o;
        return Objects.equals(baslik, that.baslik) &&
                Objects.equals(icerik, that.icerik) &&
                Objects.equals(tarih, that.tarih) &&
                Objects.equals(hatKodu, that.hatKodu) &&
                Objects.equals(hatAdi, that.hatAdi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baslik, icerik, tarih, hatKodu, hatAdi);
    }

    @Override
    public String toString() {
        return "IettAnnouncement{" +
                "baslik='" + baslik + '\'' +
                ", icerik='" + icerik + '\'' +
                ", tarih='" + tarih + '\'' +
                ", hatKodu='" + hatKodu + '\'' +
                ", hatAdi='" + hatAdi + '\'' +
                '}';
    }
}
