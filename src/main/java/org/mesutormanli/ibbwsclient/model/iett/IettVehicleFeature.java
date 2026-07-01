package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class IettVehicleFeature extends BaseDataModel {

    @SerializedName("KapiNo")
    private String kapiNo;

    @SerializedName("Plaka")
    private String plaka;

    @SerializedName("Marka")
    private String marka;

    @SerializedName("Model")
    private String model;

    @SerializedName("Yil")
    private Integer yil;

    @SerializedName("YakitTuru")
    private String yakitTuru;

    @SerializedName("UretimYili")
    private Integer uretimYili;

    @SerializedName("Durumu")
    private String durumu;

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYil() {
        return yil;
    }

    public void setYil(Integer yil) {
        this.yil = yil;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public Integer getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(Integer uretimYili) {
        this.uretimYili = uretimYili;
    }

    public String getDurumu() {
        return durumu;
    }

    public void setDurumu(String durumu) {
        this.durumu = durumu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IettVehicleFeature that = (IettVehicleFeature) o;
        return Objects.equals(kapiNo, that.kapiNo) &&
                Objects.equals(plaka, that.plaka) &&
                Objects.equals(marka, that.marka) &&
                Objects.equals(model, that.model) &&
                Objects.equals(yil, that.yil) &&
                Objects.equals(yakitTuru, that.yakitTuru) &&
                Objects.equals(uretimYili, that.uretimYili) &&
                Objects.equals(durumu, that.durumu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kapiNo, plaka, marka, model, yil, yakitTuru, uretimYili, durumu);
    }

    @Override
    public String toString() {
        return "IettVehicleFeature{" +
                "kapiNo='" + kapiNo + '\'' +
                ", plaka='" + plaka + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", uretimYili=" + uretimYili +
                ", durumu='" + durumu + '\'' +
                '}';
    }
}
