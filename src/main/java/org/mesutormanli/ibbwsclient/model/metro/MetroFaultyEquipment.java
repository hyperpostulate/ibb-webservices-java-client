package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroFaultyEquipment extends BaseDataModel {

    @SerializedName("Id")
    private int id;

    @SerializedName("EquipmentName")
    private String equipmentName;

    @SerializedName("FaultName")
    private String faultName;

    @SerializedName("LineName")
    private String lineName;

    @SerializedName("TechnicalUnit")
    private String technicalUnit;

    @SerializedName("Date")
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getFaultName() {
        return faultName;
    }

    public void setFaultName(String faultName) {
        this.faultName = faultName;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getTechnicalUnit() {
        return technicalUnit;
    }

    public void setTechnicalUnit(String technicalUnit) {
        this.technicalUnit = technicalUnit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroFaultyEquipment that = (MetroFaultyEquipment) o;
        return id == that.id &&
                Objects.equals(equipmentName, that.equipmentName) &&
                Objects.equals(faultName, that.faultName) &&
                Objects.equals(lineName, that.lineName) &&
                Objects.equals(technicalUnit, that.technicalUnit) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, equipmentName, faultName, lineName, technicalUnit, date);
    }

    @Override
    public String toString() {
        return "MetroFaultyEquipment{" +
                "id=" + id +
                ", equipmentName='" + equipmentName + '\'' +
                ", faultName='" + faultName + '\'' +
                ", lineName='" + lineName + '\'' +
                ", technicalUnit='" + technicalUnit + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
