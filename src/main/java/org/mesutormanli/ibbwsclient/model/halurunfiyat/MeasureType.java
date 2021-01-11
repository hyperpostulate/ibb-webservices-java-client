package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MeasureType extends BaseDataModel {

    @SerializedName("Id")
    private Integer id;

    @SerializedName("Birim")
    private String unit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasureType that = (MeasureType) o;
        return Objects.equals(id, that.id) && Objects.equals(unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, unit);
    }

    @Override
    public String toString() {
        return "MeasureType{" +
                "id=" + id +
                ", unit='" + unit + '\'' +
                '}';
    }
}
