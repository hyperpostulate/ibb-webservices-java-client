package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class IettFleetData extends BaseDataModel {

    @SerializedName("HatKodu")
    private String hatKodu;

    @SerializedName("HatAdi")
    private String hatAdi;

    @SerializedName("Plaka")
    private String plaka;

    @SerializedName("KapiNo")
    private String kapiNo;

    @SerializedName("SeferSayisi")
    private Integer seferSayisi;

    @SerializedName("GerceklesenSefer")
    private Integer gerceklesenSefer;

    @SerializedName("PlanlananSefer")
    private Integer planlananSefer;

    @SerializedName("UyumOrani")
    private String uyumOrani;

    @SerializedName("Durum")
    private String durum;

    @SerializedName("Tarih")
    private String tarih;

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

    public Integer getSeferSayisi() {
        return seferSayisi;
    }

    public void setSeferSayisi(Integer seferSayisi) {
        this.seferSayisi = seferSayisi;
    }

    public Integer getGerceklesenSefer() {
        return gerceklesenSefer;
    }

    public void setGerceklesenSefer(Integer gerceklesenSefer) {
        this.gerceklesenSefer = gerceklesenSefer;
    }

    public Integer getPlanlananSefer() {
        return planlananSefer;
    }

    public void setPlanlananSefer(Integer planlananSefer) {
        this.planlananSefer = planlananSefer;
    }

    public String getUyumOrani() {
        return uyumOrani;
    }

    public void setUyumOrani(String uyumOrani) {
        this.uyumOrani = uyumOrani;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IettFleetData that = (IettFleetData) o;
        return Objects.equals(hatKodu, that.hatKodu) &&
                Objects.equals(hatAdi, that.hatAdi) &&
                Objects.equals(plaka, that.plaka) &&
                Objects.equals(kapiNo, that.kapiNo) &&
                Objects.equals(seferSayisi, that.seferSayisi) &&
                Objects.equals(gerceklesenSefer, that.gerceklesenSefer) &&
                Objects.equals(planlananSefer, that.planlananSefer) &&
                Objects.equals(uyumOrani, that.uyumOrani) &&
                Objects.equals(durum, that.durum) &&
                Objects.equals(tarih, that.tarih);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hatKodu, hatAdi, plaka, kapiNo, seferSayisi, gerceklesenSefer, planlananSefer, uyumOrani, durum, tarih);
    }

    @Override
    public String toString() {
        return "IettFleetData{" +
                "hatKodu='" + hatKodu + '\'' +
                ", hatAdi='" + hatAdi + '\'' +
                ", plaka='" + plaka + '\'' +
                ", kapiNo='" + kapiNo + '\'' +
                ", seferSayisi=" + seferSayisi +
                ", gerceklesenSefer=" + gerceklesenSefer +
                ", planlananSefer=" + planlananSefer +
                ", uyumOrani='" + uyumOrani + '\'' +
                ", durum='" + durum + '\'' +
                ", tarih='" + tarih + '\'' +
                '}';
    }
}
