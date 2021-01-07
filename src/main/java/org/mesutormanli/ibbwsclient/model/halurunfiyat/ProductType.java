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
    private int categoryId;

    @SerializedName("HalTurId")
    private int halTurId;

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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getHalTurId() {
        return halTurId;
    }

    public void setHalTurId(int halTurId) {
        this.halTurId = halTurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductType that = (ProductType) o;
        return categoryId == that.categoryId && halTurId == that.halTurId && Objects.equals(tabelaGId, that.tabelaGId) && Objects.equals(urunAd, that.urunAd);
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
