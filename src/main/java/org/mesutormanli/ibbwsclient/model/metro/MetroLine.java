package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroLine extends BaseDataModel {

    @SerializedName("Id")
    private int id;

    @SerializedName("Name")
    private String name;

    @SerializedName("Description")
    private String description;

    @SerializedName("LineColor")
    private String lineColor;

    @SerializedName("LineWidth")
    private int lineWidth;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroLine metroLine = (MetroLine) o;
        return id == metroLine.id &&
                lineWidth == metroLine.lineWidth &&
                Objects.equals(name, metroLine.name) &&
                Objects.equals(description, metroLine.description) &&
                Objects.equals(lineColor, metroLine.lineColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, lineColor, lineWidth);
    }

    @Override
    public String toString() {
        return "MetroLine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", lineColor='" + lineColor + '\'' +
                ", lineWidth=" + lineWidth +
                '}';
    }
}
