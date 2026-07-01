package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class IettLine extends BaseDataModel {

    @SerializedName("HatKodu")
    private String hatKodu;

    @SerializedName("HatAdi")
    private String hatAdi;

    @SerializedName("HatUzunlugu")
    private String hatUzunlugu;

    @SerializedName("HatTipi")
    private String hatTipi;

    @SerializedName("AracSayisi")
    private Integer aracSayisi;

    @SerializedName("SeferSuresi")
    private Integer seferSuresi;

    @SerializedName("HatDurumu")
    private String hatDurumu;

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

    public String getHatUzunlugu() {
        return hatUzunlugu;
    }

    public void setHatUzunlugu(String hatUzunlugu) {
        this.hatUzunlugu = hatUzunlugu;
    }

    public String getHatTipi() {
        return hatTipi;
    }

    public void setHatTipi(String hatTipi) {
        this.hatTipi = hatTipi;
    }

    public Integer getAracSayisi() {
        return aracSayisi;
    }

    public void setAracSayisi(Integer aracSayisi) {
        this.aracSayisi = aracSayisi;
    }

    public Integer getSeferSuresi() {
        return seferSuresi;
    }

    public void setSeferSuresi(Integer seferSuresi) {
        this.seferSuresi = seferSuresi;
    }

    public String getHatDurumu() {
        return hatDurumu;
    }

    public void setHatDurumu(String hatDurumu) {
        this.hatDurumu = hatDurumu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IettLine that = (IettLine) o;
        return Objects.equals(hatKodu, that.hatKodu) &&
                Objects.equals(hatAdi, that.hatAdi) &&
                Objects.equals(hatUzunlugu, that.hatUzunlugu) &&
                Objects.equals(hatTipi, that.hatTipi) &&
                Objects.equals(aracSayisi, that.aracSayisi) &&
                Objects.equals(seferSuresi, that.seferSuresi) &&
                Objects.equals(hatDurumu, that.hatDurumu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hatKodu, hatAdi, hatUzunlugu, hatTipi, aracSayisi, seferSuresi, hatDurumu);
    }

    @Override
    public String toString() {
        return "IettLine{" +
                "hatKodu='" + hatKodu + '\'' +
                ", hatAdi='" + hatAdi + '\'' +
                ", hatUzunlugu='" + hatUzunlugu + '\'' +
                ", hatTipi='" + hatTipi + '\'' +
                ", aracSayisi=" + aracSayisi +
                ", seferSuresi=" + seferSuresi +
                ", hatDurumu='" + hatDurumu + '\'' +
                '}';
    }
}
