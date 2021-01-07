package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class ProductTypesServiceResponse extends BaseHalUrunFiyatDataModel {

    @SerializedName("Results")
    private List<ProductType> results;

    public List<ProductType> getResults() {
        return results;
    }

    public void setResults(List<ProductType> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductTypesServiceResponse that = (ProductTypesServiceResponse) o;
        return Objects.equals(results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), results);
    }

    @Override
    public String toString() {
        return "ProductTypesServiceResponse{" +
                "responseStatus=" + responseStatus +
                ", errorGUID='" + errorGUID + '\'' +
                ", message='" + message + '\'' +
                ", results=" + results +
                '}';
    }
}
