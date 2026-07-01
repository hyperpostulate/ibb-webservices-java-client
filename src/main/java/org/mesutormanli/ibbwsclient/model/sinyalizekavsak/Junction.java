package org.mesutormanli.ibbwsclient.model.sinyalizekavsak;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class Junction extends BaseDataModel {

    @SerializedName("JunctionNo")
    private int junctionNo;

    @SerializedName("JunctionName")
    private String junctionName;

    @SerializedName("XCoord")
    private String xCoord;

    @SerializedName("YCoord")
    private String yCoord;

    public int getJunctionNo() {
        return junctionNo;
    }

    public void setJunctionNo(int junctionNo) {
        this.junctionNo = junctionNo;
    }

    public String getJunctionName() {
        return junctionName;
    }

    public void setJunctionName(String junctionName) {
        this.junctionName = junctionName;
    }

    public String getXCoord() {
        return xCoord;
    }

    public void setXCoord(String xCoord) {
        this.xCoord = xCoord;
    }

    public String getYCoord() {
        return yCoord;
    }

    public void setYCoord(String yCoord) {
        this.yCoord = yCoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Junction junction = (Junction) o;
        return junctionNo == junction.junctionNo &&
                Objects.equals(junctionName, junction.junctionName) &&
                Objects.equals(xCoord, junction.xCoord) &&
                Objects.equals(yCoord, junction.yCoord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(junctionNo, junctionName, xCoord, yCoord);
    }

    @Override
    public String toString() {
        return "Junction{" +
                "junctionNo=" + junctionNo +
                ", junctionName='" + junctionName + '\'' +
                ", xCoord='" + xCoord + '\'' +
                ", yCoord='" + yCoord + '\'' +
                '}';
    }
}
