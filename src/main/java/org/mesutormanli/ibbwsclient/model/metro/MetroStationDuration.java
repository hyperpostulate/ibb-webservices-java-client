package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroStationDuration extends BaseDataModel {

    @SerializedName("LineId")
    private int lineId;

    @SerializedName("LineName")
    private String lineName;

    @SerializedName("FromStationId")
    private int fromStationId;

    @SerializedName("FromStationName")
    private String fromStationName;

    @SerializedName("ToStationId")
    private int toStationId;

    @SerializedName("ToStationName")
    private String toStationName;

    @SerializedName("Duration")
    private int duration;

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

    public int getFromStationId() {
        return fromStationId;
    }

    public void setFromStationId(int fromStationId) {
        this.fromStationId = fromStationId;
    }

    public String getFromStationName() {
        return fromStationName;
    }

    public void setFromStationName(String fromStationName) {
        this.fromStationName = fromStationName;
    }

    public int getToStationId() {
        return toStationId;
    }

    public void setToStationId(int toStationId) {
        this.toStationId = toStationId;
    }

    public String getToStationName() {
        return toStationName;
    }

    public void setToStationName(String toStationName) {
        this.toStationName = toStationName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroStationDuration that = (MetroStationDuration) o;
        return lineId == that.lineId &&
                fromStationId == that.fromStationId &&
                toStationId == that.toStationId &&
                duration == that.duration &&
                Objects.equals(lineName, that.lineName) &&
                Objects.equals(fromStationName, that.fromStationName) &&
                Objects.equals(toStationName, that.toStationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineId, lineName, fromStationId, fromStationName, toStationId, toStationName, duration);
    }

    @Override
    public String toString() {
        return "MetroStationDuration{" +
                "lineId=" + lineId +
                ", lineName='" + lineName + '\'' +
                ", fromStationId=" + fromStationId +
                ", fromStationName='" + fromStationName + '\'' +
                ", toStationId=" + toStationId +
                ", toStationName='" + toStationName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
