package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroFaultyEquipmentDetail extends BaseDataModel {

    @SerializedName("Id")
    private int id;

    @SerializedName("EquipmentName")
    private String equipmentName;

    @SerializedName("FaultyDescription")
    private String faultyDescription;

    @SerializedName("LineName")
    private String lineName;

    @SerializedName("StationName")
    private String stationName;

    @SerializedName("Date")
    private String date;

    @SerializedName("Status")
    private String status;

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

    public String getFaultyDescription() {
        return faultyDescription;
    }

    public void setFaultyDescription(String faultyDescription) {
        this.faultyDescription = faultyDescription;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroFaultyEquipmentDetail that = (MetroFaultyEquipmentDetail) o;
        return id == that.id &&
                Objects.equals(equipmentName, that.equipmentName) &&
                Objects.equals(faultyDescription, that.faultyDescription) &&
                Objects.equals(lineName, that.lineName) &&
                Objects.equals(stationName, that.stationName) &&
                Objects.equals(date, that.date) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, equipmentName, faultyDescription, lineName, stationName, date, status);
    }

    @Override
    public String toString() {
        return "MetroFaultyEquipmentDetail{" +
                "id=" + id +
                ", equipmentName='" + equipmentName + '\'' +
                ", faultyDescription='" + faultyDescription + '\'' +
                ", lineName='" + lineName + '\'' +
                ", stationName='" + stationName + '\'' +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
