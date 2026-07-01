package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroDirection extends BaseDataModel {

    @SerializedName("DirectionId")
    private int directionId;

    @SerializedName("DirectionName")
    private String directionName;

    @SerializedName("DirectionValue")
    private int directionValue;

    @SerializedName("LineId")
    private int lineId;

    @SerializedName("StationId")
    private int stationId;

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

    public int getDirectionValue() {
        return directionValue;
    }

    public void setDirectionValue(int directionValue) {
        this.directionValue = directionValue;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroDirection that = (MetroDirection) o;
        return directionId == that.directionId &&
                directionValue == that.directionValue &&
                lineId == that.lineId &&
                stationId == that.stationId &&
                Objects.equals(directionName, that.directionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directionId, directionName, directionValue, lineId, stationId);
    }

    @Override
    public String toString() {
        return "MetroDirection{" +
                "directionId=" + directionId +
                ", directionName='" + directionName + '\'' +
                ", directionValue=" + directionValue +
                ", lineId=" + lineId +
                ", stationId=" + stationId +
                '}';
    }
}
