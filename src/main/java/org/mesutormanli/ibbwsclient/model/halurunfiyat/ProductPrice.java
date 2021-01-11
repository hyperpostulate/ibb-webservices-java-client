package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class ProductPrice extends BaseDataModel {

    @SerializedName("TabelaGId")
    private String tabelaGId;

    @SerializedName("UrunAd")
    private String urunAd;

    @SerializedName("BirimTurId")
    private Integer birimTurId;

    @SerializedName("KategoriId")
    private Integer categoryId;

    @SerializedName("EnDusukFiyat")
    private Double minPrice;

    @SerializedName("EnYuksekFiyat")
    private Double maxPrice;

    @SerializedName("GuneAit")
    private String validFor;

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

    public Integer getBirimTurId() {
        return birimTurId;
    }

    public void setBirimTurId(Integer birimTurId) {
        this.birimTurId = birimTurId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getValidFor() {
        return validFor;
    }

    public void setValidFor(String validFor) {
        this.validFor = validFor;
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
        ProductPrice that = (ProductPrice) o;
        return Objects.equals(tabelaGId, that.tabelaGId) && Objects.equals(urunAd, that.urunAd) && Objects.equals(birimTurId, that.birimTurId) && Objects.equals(categoryId, that.categoryId) && Objects.equals(minPrice, that.minPrice) && Objects.equals(maxPrice, that.maxPrice) && Objects.equals(validFor, that.validFor) && Objects.equals(halTurId, that.halTurId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tabelaGId, urunAd, birimTurId, categoryId, minPrice, maxPrice, validFor, halTurId);
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "tabelaGId='" + tabelaGId + '\'' +
                ", urunAd='" + urunAd + '\'' +
                ", birimTurId=" + birimTurId +
                ", categoryId=" + categoryId +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", validFor='" + validFor + '\'' +
                ", halTurId=" + halTurId +
                '}';
    }
}
