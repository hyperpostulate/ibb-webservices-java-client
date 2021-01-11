package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class ProductPriceServiceResponse extends BaseHalUrunFiyatDataModel {

    @SerializedName("Results")
    private List<ProductPrice> results;

    public List<ProductPrice> getResults() {
        return results;
    }

    public void setResults(List<ProductPrice> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductPriceServiceResponse that = (ProductPriceServiceResponse) o;
        return Objects.equals(results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), results);
    }

    @Override
    public String toString() {
        return "ProductPriceServiceResponse{" +
                "responseStatus=" + responseStatus +
                ", errorGUID='" + errorGUID + '\'' +
                ", message='" + message + '\'' +
                ", results=" + results +
                '}';
    }
}
