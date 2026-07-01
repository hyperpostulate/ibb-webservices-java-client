package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class IettFuelConsumption extends BaseDataModel {

    @SerializedName("Yil")
    private Integer yil;

    @SerializedName("Ay")
    private Integer ay;

    @SerializedName("ToplamLitre")
    private Double toplamLitre;

    @SerializedName("YakitTuru")
    private String yakitTuru;

    @SerializedName("OrtalamaTuketim")
    private Double ortalamaTuketim;

    @SerializedName("AracSayisi")
    private Integer aracSayisi;

    public Integer getYil() {
        return yil;
    }

    public void setYil(Integer yil) {
        this.yil = yil;
    }

    public Integer getAy() {
        return ay;
    }

    public void setAy(Integer ay) {
        this.ay = ay;
    }

    public Double getToplamLitre() {
        return toplamLitre;
    }

    public void setToplamLitre(Double toplamLitre) {
        this.toplamLitre = toplamLitre;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public Double getOrtalamaTuketim() {
        return ortalamaTuketim;
    }

    public void setOrtalamaTuketim(Double ortalamaTuketim) {
        this.ortalamaTuketim = ortalamaTuketim;
    }

    public Integer getAracSayisi() {
        return aracSayisi;
    }

    public void setAracSayisi(Integer aracSayisi) {
        this.aracSayisi = aracSayisi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IettFuelConsumption that = (IettFuelConsumption) o;
        return Objects.equals(yil, that.yil) &&
                Objects.equals(ay, that.ay) &&
                Objects.equals(toplamLitre, that.toplamLitre) &&
                Objects.equals(yakitTuru, that.yakitTuru) &&
                Objects.equals(ortalamaTuketim, that.ortalamaTuketim) &&
                Objects.equals(aracSayisi, that.aracSayisi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yil, ay, toplamLitre, yakitTuru, ortalamaTuketim, aracSayisi);
    }

    @Override
    public String toString() {
        return "IettFuelConsumption{" +
                "yil=" + yil +
                ", ay=" + ay +
                ", toplamLitre=" + toplamLitre +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", ortalamaTuketim=" + ortalamaTuketim +
                ", aracSayisi=" + aracSayisi +
                '}';
    }
}
