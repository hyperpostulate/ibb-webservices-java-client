package org.mesutormanli.ibbwsclient.model.airquality;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class AirQualityData extends BaseDataModel {

    @SerializedName("ReadTime")
    private String readTime;

    @SerializedName("Concentration")
    private String concentration;

    @SerializedName("AQI")
    private String AQI;

    public String getReadTime() {
        return readTime;
    }

    public void setReadTime(String readTime) {
        this.readTime = readTime;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getAQI() {
        return AQI;
    }

    public void setAQI(String AQI) {
        this.AQI = AQI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirQualityData that = (AirQualityData) o;
        return Objects.equals(readTime, that.readTime) &&
                Objects.equals(concentration, that.concentration) &&
                Objects.equals(AQI, that.AQI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readTime, concentration, AQI);
    }

    @Override
    public String toString() {
        return "AirQualityData{" +
                "readTime='" + readTime + '\'' +
                ", concentration='" + concentration + '\'' +
                ", AQI='" + AQI + '\'' +
                '}';
    }
}
