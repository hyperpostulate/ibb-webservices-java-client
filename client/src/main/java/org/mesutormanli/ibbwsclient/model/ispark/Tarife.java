package org.mesutormanli.ibbwsclient.model.ispark;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class Tarife extends BaseDataModel {

    @SerializedName("Tarife")
    private String tarife;

    @SerializedName("Fiyat")
    private Double fiyat;

    public String getTarife() {
        return tarife;
    }

    public void setTarife(String tarife) {
        this.tarife = tarife;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarife tarife1 = (Tarife) o;
        return Objects.equals(tarife, tarife1.tarife) &&
                Objects.equals(fiyat, tarife1.fiyat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tarife, fiyat);
    }

    @Override
    public String toString() {
        return "Tarife{" +
                "tarife='" + tarife + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}
