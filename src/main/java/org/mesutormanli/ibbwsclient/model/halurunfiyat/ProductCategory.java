package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class ProductCategory extends BaseDataModel {

    @SerializedName("Id")
    private Integer id;

    @SerializedName("HalId")
    private Integer halId;

    @SerializedName("Kategori")
    private String category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHalId() {
        return halId;
    }

    public void setHalId(Integer halId) {
        this.halId = halId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategory that = (ProductCategory) o;
        return Objects.equals(id, that.id) && Objects.equals(halId, that.halId) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, halId, category);
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "id=" + id +
                ", halId=" + halId +
                ", category='" + category + '\'' +
                '}';
    }
}
