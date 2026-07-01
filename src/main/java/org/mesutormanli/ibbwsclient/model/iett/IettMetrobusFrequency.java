package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class IettMetrobusFrequency extends BaseDataModel {

    @SerializedName("HatKodu")
    private String hatKodu;

    @SerializedName("HatAdi")
    private String hatAdi;

    @SerializedName("Yon")
    private String yon;

    @SerializedName("Frekans")
    private String frekans;

    @SerializedName("BaslangicSaati")
    private String baslangicSaati;

    @SerializedName("BitisSaati")
    private String bitisSaati;

    @SerializedName("Sure")
    private String sure;

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

    public String getYon() {
        return yon;
    }

    public void setYon(String yon) {
        this.yon = yon;
    }

    public String getFrekans() {
        return frekans;
    }

    public void setFrekans(String frekans) {
        this.frekans = frekans;
    }

    public String getBaslangicSaati() {
        return baslangicSaati;
    }

    public void setBaslangicSaati(String baslangicSaati) {
        this.baslangicSaati = baslangicSaati;
    }

    public String getBitisSaati() {
        return bitisSaati;
    }

    public void setBitisSaati(String bitisSaati) {
        this.bitisSaati = bitisSaati;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IettMetrobusFrequency that = (IettMetrobusFrequency) o;
        return Objects.equals(hatKodu, that.hatKodu) &&
                Objects.equals(hatAdi, that.hatAdi) &&
                Objects.equals(yon, that.yon) &&
                Objects.equals(frekans, that.frekans) &&
                Objects.equals(baslangicSaati, that.baslangicSaati) &&
                Objects.equals(bitisSaati, that.bitisSaati) &&
                Objects.equals(sure, that.sure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hatKodu, hatAdi, yon, frekans, baslangicSaati, bitisSaati, sure);
    }

    @Override
    public String toString() {
        return "IettMetrobusFrequency{" +
                "hatKodu='" + hatKodu + '\'' +
                ", hatAdi='" + hatAdi + '\'' +
                ", yon='" + yon + '\'' +
                ", frekans='" + frekans + '\'' +
                ", baslangicSaati='" + baslangicSaati + '\'' +
                ", bitisSaati='" + bitisSaati + '\'' +
                ", sure='" + sure + '\'' +
                '}';
    }
}
