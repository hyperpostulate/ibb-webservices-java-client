package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class Market extends BaseDataModel {

    @SerializedName("Id")
    private Integer id;

    @SerializedName("Hal")
    private String hal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHal() {
        return hal;
    }

    public void setHal(String hal) {
        this.hal = hal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Market market = (Market) o;
        return Objects.equals(id, market.id) && Objects.equals(hal, market.hal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hal);
    }

    @Override
    public String toString() {
        return "Market{" +
                "id=" + id +
                ", hal='" + hal + '\'' +
                '}';
    }
}
