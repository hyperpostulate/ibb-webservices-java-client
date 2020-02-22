package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class Duyuru extends BaseDataModel {

    @SerializedName("HAT")
    private String hat;

    @SerializedName("TIP")
    private String tip;

    @SerializedName("GUNCELLEME_SAATI")
    private String guncellemeSaati;

    @SerializedName("MESAJ")
    private String mesaj;

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getGuncellemeSaati() {
        return guncellemeSaati;
    }

    public void setGuncellemeSaati(String guncellemeSaati) {
        this.guncellemeSaati = guncellemeSaati;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duyuru duyuru = (Duyuru) o;
        return Objects.equals(hat, duyuru.hat) &&
                Objects.equals(tip, duyuru.tip) &&
                Objects.equals(guncellemeSaati, duyuru.guncellemeSaati) &&
                Objects.equals(mesaj, duyuru.mesaj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hat, tip, guncellemeSaati, mesaj);
    }

    @Override
    public String toString() {
        return "Duyuru{" +
                "hat='" + hat + '\'' +
                ", tip='" + tip + '\'' +
                ", guncellemeSaati='" + guncellemeSaati + '\'' +
                ", mesaj='" + mesaj + '\'' +
                '}';
    }
}
