package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

public class BozukSatih extends BaseDataModel {

    @SerializedName("NMESAJID")
    private String mesajId;

    @SerializedName("SKAPINUMARASI")
    private String kapiNumarasi;

    @SerializedName("SSOFORSICILNO")
    private String soforSicilNo;

    @SerializedName("SMESAJMETNI")
    private String mesajMetni;

    @SerializedName("DTKAYITZAMANI")
    private String kayitZamani;

    @SerializedName("NBOYLAM")
    private String boylam;

    @SerializedName("NENLEM")
    private String enlem;

    public String getMesajId() {
        return mesajId;
    }

    public void setMesajId(String mesajId) {
        this.mesajId = mesajId;
    }

    public String getKapiNumarasi() {
        return kapiNumarasi;
    }

    public void setKapiNumarasi(String kapiNumarasi) {
        this.kapiNumarasi = kapiNumarasi;
    }

    public String getSoforSicilNo() {
        return soforSicilNo;
    }

    public void setSoforSicilNo(String soforSicilNo) {
        this.soforSicilNo = soforSicilNo;
    }

    public String getMesajMetni() {
        return mesajMetni;
    }

    public void setMesajMetni(String mesajMetni) {
        this.mesajMetni = mesajMetni;
    }

    public String getKayitZamani() {
        return kayitZamani;
    }

    public void setKayitZamani(String kayitZamani) {
        this.kayitZamani = kayitZamani;
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

    @Override
    public String toString() {
        return "BozukSatih{" +
                "mesajId='" + mesajId + '\'' +
                ", kapiNumarasi='" + kapiNumarasi + '\'' +
                ", soforSicilNo='" + soforSicilNo + '\'' +
                ", mesajMetni='" + mesajMetni + '\'' +
                ", kayitZamani='" + kayitZamani + '\'' +
                ", boylam='" + boylam + '\'' +
                ", enlem='" + enlem + '\'' +
                '}';
    }
}
