package org.mesutormanli.ibbwsclient.model.trafik;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class TrafficIndexData extends BaseDataModel {

    @SerializedName("TrafficIndex")
    private int trafficIndex;

    @SerializedName("TrafficIndexDate")
    private String trafficIndexDate;

    public int getTrafficIndex() {
        return trafficIndex;
    }

    public void setTrafficIndex(int trafficIndex) {
        this.trafficIndex = trafficIndex;
    }

    public String getTrafficIndexDate() {
        return trafficIndexDate;
    }

    public void setTrafficIndexDate(String trafficIndexDate) {
        this.trafficIndexDate = trafficIndexDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrafficIndexData that = (TrafficIndexData) o;
        return trafficIndex == that.trafficIndex &&
                Objects.equals(trafficIndexDate, that.trafficIndexDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficIndex, trafficIndexDate);
    }

    @Override
    public String toString() {
        return "TrafficIndexData{" +
                "trafficIndex=" + trafficIndex +
                ", trafficIndexDate='" + trafficIndexDate + '\'' +
                '}';
    }
}
