package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class FiloAracKonum extends BaseDataModel {

    @SerializedName("Operator")
    private String operator;

    @SerializedName("Garaj")
    private String garaj;

    @SerializedName("KapiNo")
    private String kapiNo;

    @SerializedName("Saat")
    private String saat;

    @SerializedName("Boylam")
    private String boylam;

    @SerializedName("Enlem")
    private String enlem;

    @SerializedName("Hiz")
    private String hiz;

    @SerializedName("Plaka")
    private String plaka;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getGaraj() {
        return garaj;
    }

    public void setGaraj(String garaj) {
        this.garaj = garaj;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
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

    public String getHiz() {
        return hiz;
    }

    public void setHiz(String hiz) {
        this.hiz = hiz;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiloAracKonum that = (FiloAracKonum) o;
        return Objects.equals(operator, that.operator) &&
                Objects.equals(garaj, that.garaj) &&
                Objects.equals(kapiNo, that.kapiNo) &&
                Objects.equals(saat, that.saat) &&
                Objects.equals(boylam, that.boylam) &&
                Objects.equals(enlem, that.enlem) &&
                Objects.equals(hiz, that.hiz) &&
                Objects.equals(plaka, that.plaka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operator, garaj, kapiNo, saat, boylam, enlem, hiz, plaka);
    }

    @Override
    public String toString() {
        return "FiloAracKonum{" +
                "operator='" + operator + '\'' +
                ", garaj='" + garaj + '\'' +
                ", kapiNo='" + kapiNo + '\'' +
                ", saat='" + saat + '\'' +
                ", boylam='" + boylam + '\'' +
                ", enlem='" + enlem + '\'' +
                ", hiz='" + hiz + '\'' +
                ", plaka='" + plaka + '\'' +
                '}';
    }
}
