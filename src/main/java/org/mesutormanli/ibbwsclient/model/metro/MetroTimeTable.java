package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroTimeTable extends BaseDataModel {

    @SerializedName("LineId")
    private int lineId;

    @SerializedName("LineName")
    private String lineName;

    @SerializedName("DirectionId")
    private int directionId;

    @SerializedName("DirectionName")
    private String directionName;

    @SerializedName("StationId")
    private int stationId;

    @SerializedName("StationName")
    private String stationName;

    @SerializedName("ArrivalTime")
    private String arrivalTime;

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public int getDirectionId() {
        return directionId;
    }

    public void setDirectionId(int directionId) {
        this.directionId = directionId;
    }

    public String getDirectionName() {
        return directionName;
    }

    public void setDirectionName(String directionName) {
        this.directionName = directionName;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroTimeTable that = (MetroTimeTable) o;
        return lineId == that.lineId &&
                directionId == that.directionId &&
                stationId == that.stationId &&
                Objects.equals(lineName, that.lineName) &&
                Objects.equals(directionName, that.directionName) &&
                Objects.equals(stationName, that.stationName) &&
                Objects.equals(arrivalTime, that.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineId, lineName, directionId, directionName, stationId, stationName, arrivalTime);
    }

    @Override
    public String toString() {
        return "MetroTimeTable{" +
                "lineId=" + lineId +
                ", lineName='" + lineName + '\'' +
                ", directionId=" + directionId +
                ", directionName='" + directionName + '\'' +
                ", stationId=" + stationId +
                ", stationName='" + stationName + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                '}';
    }
}
