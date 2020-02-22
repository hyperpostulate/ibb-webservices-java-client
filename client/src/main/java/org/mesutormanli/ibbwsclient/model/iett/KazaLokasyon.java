package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class KazaLokasyon extends BaseDataModel {

    @SerializedName("DTOLAYBASLANGICZAMANI")
    private String olayBaslangicZamani;

    @SerializedName("NBOYLAM")
    private String boylam;

    @SerializedName("NENLEM")
    private String enlem;

    @SerializedName("Tur")
    private String tur;

    public String getOlayBaslangicZamani() {
        return olayBaslangicZamani;
    }

    public void setOlayBaslangicZamani(String olayBaslangicZamani) {
        this.olayBaslangicZamani = olayBaslangicZamani;
    }

    public String getBoylam() {
        return boylam;
    }

    public void setBoylam(String boylam) {
        this.boylam = boylam;
    }

    public String getEnlem() {
        return enlem;
    }

    public void setEnlem(String enlem) {
        this.enlem = enlem;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KazaLokasyon that = (KazaLokasyon) o;
        return Objects.equals(olayBaslangicZamani, that.olayBaslangicZamani) &&
                Objects.equals(boylam, that.boylam) &&
                Objects.equals(enlem, that.enlem) &&
                Objects.equals(tur, that.tur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(olayBaslangicZamani, boylam, enlem, tur);
    }

    @Override
    public String toString() {
        return "KazaLokasyon{" +
                "olayBaslangicZamani='" + olayBaslangicZamani + '\'' +
                ", boylam='" + boylam + '\'' +
                ", enlem='" + enlem + '\'' +
                ", tur='" + tur + '\'' +
                '}';
    }
}
