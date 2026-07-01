package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroNews extends BaseDataModel {

    @SerializedName("Id")
    private int id;

    @SerializedName("Title")
    private String title;

    @SerializedName("Content")
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroNews metroNews = (MetroNews) o;
        return id == metroNews.id &&
                Objects.equals(title, metroNews.title) &&
                Objects.equals(content, metroNews.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content);
    }

    @Override
    public String toString() {
        return "MetroNews{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
