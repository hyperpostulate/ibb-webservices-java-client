package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class IettPlannedTrip extends BaseDataModel {

    @SerializedName("HatKodu")
    private String hatKodu;

    @SerializedName("HatAdi")
    private String hatAdi;

    @SerializedName("SeferSaati")
    private String seferSaati;

    @SerializedName("Yon")
    private String yon;

    @SerializedName("DurakKodu")
    private String durakKodu;

    @SerializedName("DurakAdi")
    private String durakAdi;

    @SerializedName("HareketSaati")
    private String hareketSaati;

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

    public String getSeferSaati() {
        return seferSaati;
    }

    public void setSeferSaati(String seferSaati) {
        this.seferSaati = seferSaati;
    }

    public String getYon() {
        return yon;
    }

    public void setYon(String yon) {
        this.yon = yon;
    }

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

    public String getHareketSaati() {
        return hareketSaati;
    }

    public void setHareketSaati(String hareketSaati) {
        this.hareketSaati = hareketSaati;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IettPlannedTrip that = (IettPlannedTrip) o;
        return Objects.equals(hatKodu, that.hatKodu) &&
                Objects.equals(hatAdi, that.hatAdi) &&
                Objects.equals(seferSaati, that.seferSaati) &&
                Objects.equals(yon, that.yon) &&
                Objects.equals(durakKodu, that.durakKodu) &&
                Objects.equals(durakAdi, that.durakAdi) &&
                Objects.equals(hareketSaati, that.hareketSaati);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hatKodu, hatAdi, seferSaati, yon, durakKodu, durakAdi, hareketSaati);
    }

    @Override
    public String toString() {
        return "IettPlannedTrip{" +
                "hatKodu='" + hatKodu + '\'' +
                ", hatAdi='" + hatAdi + '\'' +
                ", seferSaati='" + seferSaati + '\'' +
                ", yon='" + yon + '\'' +
                ", durakKodu='" + durakKodu + '\'' +
                ", durakAdi='" + durakAdi + '\'' +
                ", hareketSaati='" + hareketSaati + '\'' +
                '}';
    }
}
