package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class ProductType extends BaseDataModel {

    @SerializedName("TabelaGId")
    private String tabelaGId;

    @SerializedName("UrunAd")
    private String urunAd;

    @SerializedName("KategoriId")
    private Integer categoryId;

    @SerializedName("HalTurId")
    private Integer halTurId;

    public String getTabelaGId() {
        return tabelaGId;
    }

    public void setTabelaGId(String tabelaGId) {
        this.tabelaGId = tabelaGId;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getHalTurId() {
        return halTurId;
    }

    public void setHalTurId(Integer halTurId) {
        this.halTurId = halTurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductType that = (ProductType) o;
        return Objects.equals(tabelaGId, that.tabelaGId) && Objects.equals(urunAd, that.urunAd) && Objects.equals(categoryId, that.categoryId) && Objects.equals(halTurId, that.halTurId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tabelaGId, urunAd, categoryId, halTurId);
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "tabelaGId='" + tabelaGId + '\'' +
                ", urunAd='" + urunAd + '\'' +
                ", categoryId=" + categoryId +
                ", halTurId=" + halTurId +
                '}';
    }
}
