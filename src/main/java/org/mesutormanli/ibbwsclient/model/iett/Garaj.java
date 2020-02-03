package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class Garaj extends BaseDataModel {

    @SerializedName("ID")
    private String id;

    @SerializedName("GARAJ_ADI")
    private String garajAdi;

    @SerializedName("GARAJ_KODU")
    private String garajKodu;

    @SerializedName("KOORDINAT")
    private String kooridnat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGarajAdi() {
        return garajAdi;
    }

    public void setGarajAdi(String garajAdi) {
        this.garajAdi = garajAdi;
    }

    public String getGarajKodu() {
        return garajKodu;
    }

    public void setGarajKodu(String garajKodu) {
        this.garajKodu = garajKodu;
    }

    public String getKooridnat() {
        return kooridnat;
    }

    public void setKooridnat(String kooridnat) {
        this.kooridnat = kooridnat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garaj garaj = (Garaj) o;
        return Objects.equals(id, garaj.id) &&
                Objects.equals(garajAdi, garaj.garajAdi) &&
                Objects.equals(garajKodu, garaj.garajKodu) &&
                Objects.equals(kooridnat, garaj.kooridnat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, garajAdi, garajKodu, kooridnat);
    }

    @Override
    public String toString() {
        return "Garaj{" +
                "id='" + id + '\'' +
                ", garajAdi='" + garajAdi + '\'' +
                ", garajKodu='" + garajKodu + '\'' +
                ", kooridnat='" + kooridnat + '\'' +
                '}';
    }
}
