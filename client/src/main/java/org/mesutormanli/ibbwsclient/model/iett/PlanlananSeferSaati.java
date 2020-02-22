package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class PlanlananSeferSaati extends BaseDataModel {

    @SerializedName("SHATKODU")
    private String hatKodu;

    @SerializedName("HATADI")
    private String hatAdi;

    @SerializedName("SGUZERAH")
    private String guzergah;

    @SerializedName("SYON")
    private String yon;

    @SerializedName("SGUNTIPI")
    private String gunTipi;

    @SerializedName("GUZERGAH_ISARETI")
    private String  guzergahIsareti;

    @SerializedName("SSERVISTIPI")
    private String servisTipi;

    @SerializedName("DT")
    private String saat;

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

    public String getGuzergah() {
        return guzergah;
    }

    public void setGuzergah(String guzergah) {
        this.guzergah = guzergah;
    }

    public String getYon() {
        return yon;
    }

    public void setYon(String yon) {
        this.yon = yon;
    }

    public String getGunTipi() {
        return gunTipi;
    }

    public void setGunTipi(String gunTipi) {
        this.gunTipi = gunTipi;
    }

    public String getGuzergahIsareti() {
        return guzergahIsareti;
    }

    public void setGuzergahIsareti(String guzergahIsareti) {
        this.guzergahIsareti = guzergahIsareti;
    }

    public String getServisTipi() {
        return servisTipi;
    }

    public void setServisTipi(String servisTipi) {
        this.servisTipi = servisTipi;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanlananSeferSaati that = (PlanlananSeferSaati) o;
        return Objects.equals(hatKodu, that.hatKodu) &&
                Objects.equals(hatAdi, that.hatAdi) &&
                Objects.equals(guzergah, that.guzergah) &&
                Objects.equals(yon, that.yon) &&
                Objects.equals(gunTipi, that.gunTipi) &&
                Objects.equals(guzergahIsareti, that.guzergahIsareti) &&
                Objects.equals(servisTipi, that.servisTipi) &&
                Objects.equals(saat, that.saat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hatKodu, hatAdi, guzergah, yon, gunTipi, guzergahIsareti, servisTipi, saat);
    }

    @Override
    public String toString() {
        return "PlanlananSeferSaati{" +
                "hatKodu='" + hatKodu + '\'' +
                ", hatAdi='" + hatAdi + '\'' +
                ", guzergah='" + guzergah + '\'' +
                ", yon='" + yon + '\'' +
                ", gunTipi='" + gunTipi + '\'' +
                ", guzergahIsareti='" + guzergahIsareti + '\'' +
                ", servisTipi='" + servisTipi + '\'' +
                ", saat='" + saat + '\'' +
                '}';
    }
}
