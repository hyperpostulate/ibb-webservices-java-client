
package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

public class AkaryakitToplamLitre extends BaseDataModel {

    @SerializedName("ToplamAkarYakit")
    private Double toplamAkarYakit;
    @SerializedName("Ay")
    private Integer ay;
    @SerializedName("Yil")
    private Integer yil;

    public Double getToplamAkarYakit() {
        return toplamAkarYakit;
    }

    public void setToplamAkarYakit(Double toplamAkarYakit) {
        this.toplamAkarYakit = toplamAkarYakit;
    }

    public Integer getAy() {
        return ay;
    }

    public void setAy(Integer ay) {
        this.ay = ay;
    }

    public Integer getYil() {
        return yil;
    }

    public void setYil(Integer yil) {
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "AkaryakitToplamLitre{" +
                "toplamAkarYakit=" + toplamAkarYakit + '\'' +
                ", ay=" + ay + '\'' +
                ", yil=" + yil + '\'' +
                '}';
    }
}

