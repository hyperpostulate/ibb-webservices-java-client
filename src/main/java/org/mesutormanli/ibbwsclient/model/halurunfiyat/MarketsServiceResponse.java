package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class MarketsServiceResponse extends BaseHalUrunFiyatDataModel {

    @SerializedName("Results")
    private List<Market> results;

    public List<Market> getResults() {
        return results;
    }

    public void setResults(List<Market> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MarketsServiceResponse that = (MarketsServiceResponse) o;
        return Objects.equals(results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), results);
    }

    @Override
    public String toString() {
        return "MarketsServiceResponse{" +
                "responseStatus=" + responseStatus +
                ", errorGUID='" + errorGUID + '\'' +
                ", message='" + message + '\'' +
                ", results=" + results +
                '}';
    }
}
