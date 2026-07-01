package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroServiceStatus extends BaseDataModel {

    @SerializedName("LineId")
    private int lineId;

    @SerializedName("Description")
    private String description;

    @SerializedName("IsActive")
    private boolean isActive;

    @SerializedName("LineName")
    private String lineName;

    @SerializedName("LineColor")
    private LineColor lineColor;

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public LineColor getLineColor() {
        return lineColor;
    }

    public void setLineColor(LineColor lineColor) {
        this.lineColor = lineColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroServiceStatus that = (MetroServiceStatus) o;
        return lineId == that.lineId &&
                isActive == that.isActive &&
                Objects.equals(description, that.description) &&
                Objects.equals(lineName, that.lineName) &&
                Objects.equals(lineColor, that.lineColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineId, description, isActive, lineName, lineColor);
    }

    @Override
    public String toString() {
        return "MetroServiceStatus{" +
                "lineId=" + lineId +
                ", description='" + description + '\'' +
                ", isActive=" + isActive +
                ", lineName='" + lineName + '\'' +
                ", lineColor=" + lineColor +
                '}';
    }

    public static class LineColor {
        @SerializedName("Color_R")
        private String colorR;

        @SerializedName("Color_G")
        private String colorG;

        @SerializedName("Color_B")
        private String colorB;

        public String getColorR() {
            return colorR;
        }

        public void setColorR(String colorR) {
            this.colorR = colorR;
        }

        public String getColorG() {
            return colorG;
        }

        public void setColorG(String colorG) {
            this.colorG = colorG;
        }

        public String getColorB() {
            return colorB;
        }

        public void setColorB(String colorB) {
            this.colorB = colorB;
        }

        @Override
        public String toString() {
            return "LineColor{" +
                    "colorR='" + colorR + '\'' +
                    ", colorG='" + colorG + '\'' +
                    ", colorB='" + colorB + '\'' +
                    '}';
        }
    }
}
