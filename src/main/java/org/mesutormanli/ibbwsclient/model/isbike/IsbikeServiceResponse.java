package org.mesutormanli.ibbwsclient.model.isbike;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.List;
import java.util.Objects;

public class IsbikeServiceResponse extends BaseDataModel {

    @SerializedName("serviceCode")
    private int serviceCode;

    @SerializedName("serviceDesc")
    private String serviceDesc;

    @SerializedName("dataList")
    private List<IsbikeStation> dataList;

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsbikeServiceResponse that = (IsbikeServiceResponse) o;
        return serviceCode == that.serviceCode &&
                Objects.equals(serviceDesc, that.serviceDesc) &&
                Objects.equals(dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceCode, serviceDesc, dataList);
    }

    @Override
    public String toString() {
        return "IsbikeServiceResponse{" +
                "serviceCode=" + serviceCode +
                ", serviceDesc='" + serviceDesc + '\'' +
                ", dataList=" + dataList +
                '}';
    }
}
