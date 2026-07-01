package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroServiceResponse<T> extends BaseDataModel {

    @SerializedName("Success")
    private boolean success;

    @SerializedName("Error")
    private Object error;

    @SerializedName("Data")
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroServiceResponse<?> that = (MetroServiceResponse<?>) o;
        return success == that.success &&
                Objects.equals(error, that.error) &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, error, data);
    }

    @Override
    public String toString() {
        return "MetroServiceResponse{" +
                "success=" + success +
                ", error=" + error +
                ", data=" + data +
                '}';
    }
}
