package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroMap extends BaseDataModel {

    @SerializedName("Id")
    private int id;

    @SerializedName("Name")
    private String name;

    @SerializedName("ImageUrl")
    private String imageUrl;

    @SerializedName("Description")
    private String description;

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroMap metroMap = (MetroMap) o;
        return id == metroMap.id &&
                Objects.equals(name, metroMap.name) &&
                Objects.equals(imageUrl, metroMap.imageUrl) &&
                Objects.equals(description, metroMap.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, imageUrl, description);
    }

    @Override
    public String toString() {
        return "MetroMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
