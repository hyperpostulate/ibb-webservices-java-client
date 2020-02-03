package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

public class Durak {

    @SerializedName("SDURAKKODU")
    private String durakKodu;

    @SerializedName("SDURAKADI")
    private String durakAdi;

    @SerializedName("KOORDINAT")
    private String koordinat;

    @SerializedName("ILCEADI")
    private String ilceAdi;

    @SerializedName("SYON")
    private String yon;

    @SerializedName("AKILLI")
    private String akilli;

    @SerializedName("FIZIKI")
    private String fiziki;

    @SerializedName("DURAK_TIPI")
    private String durakTipi;

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

    public String getKoordinat() {
        return koordinat;
    }

    public void setKoordinat(String koordinat) {
        this.koordinat = koordinat;
    }

    public String getIlceAdi() {
        return ilceAdi;
    }

    public void setIlceAdi(String ilceAdi) {
        this.ilceAdi = ilceAdi;
    }

    public String getYon() {
        return yon;
    }

    public void setYon(String yon) {
        this.yon = yon;
    }

    public String getAkilli() {
        return akilli;
    }

    public void setAkilli(String akilli) {
        this.akilli = akilli;
    }

    public String getFiziki() {
        return fiziki;
    }

    public void setFiziki(String fiziki) {
        this.fiziki = fiziki;
    }

    public String getDurakTipi() {
        return durakTipi;
    }

    public void setDurakTipi(String durakTipi) {
        this.durakTipi = durakTipi;
    }

    @Override
    public String toString() {
        return "Durak{" +
                "durakKodu='" + durakKodu + '\'' +
                ", durakAdi='" + durakAdi + '\'' +
                ", koordinat='" + koordinat + '\'' +
                ", ilceAdi='" + ilceAdi + '\'' +
                ", yon='" + yon + '\'' +
                ", akilli='" + akilli + '\'' +
                ", fiziki='" + fiziki + '\'' +
                ", durakTipi='" + durakTipi + '\'' +
                '}';
    }
}
