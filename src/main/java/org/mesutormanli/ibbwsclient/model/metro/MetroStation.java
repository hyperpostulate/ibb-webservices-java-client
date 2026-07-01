package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroStation extends BaseDataModel {

    @SerializedName("Id")
    private int id;

    @SerializedName("Name")
    private String name;

    @SerializedName("LineId")
    private int lineId;

    @SerializedName("LineName")
    private String lineName;

    @SerializedName("Description")
    private String description;

    @SerializedName("Order")
    private int order;

    @SerializedName("FunctionalCode")
    private String functionalCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getFunctionalCode() {
        return functionalCode;
    }

    public void setFunctionalCode(String functionalCode) {
        this.functionalCode = functionalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroStation that = (MetroStation) o;
        return id == that.id &&
                lineId == that.lineId &&
                order == that.order &&
                Objects.equals(name, that.name) &&
                Objects.equals(lineName, that.lineName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(functionalCode, that.functionalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lineId, lineName, description, order, functionalCode);
    }

    @Override
    public String toString() {
        return "MetroStation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lineId=" + lineId +
                ", lineName='" + lineName + '\'' +
                ", description='" + description + '\'' +
                ", order=" + order +
                ", functionalCode='" + functionalCode + '\'' +
                '}';
    }
}
