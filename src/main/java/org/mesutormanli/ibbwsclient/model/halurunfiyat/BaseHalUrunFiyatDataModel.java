package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class BaseHalUrunFiyatDataModel extends BaseDataModel {

    @SerializedName("ResponseStatus")
    protected Boolean responseStatus;

    @SerializedName("ErrorGUID")
    protected String errorGUID;

    @SerializedName("Message")
    protected String message;

    public Boolean getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Boolean responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getErrorGUID() {
        return errorGUID;
    }

    public void setErrorGUID(String errorGUID) {
        this.errorGUID = errorGUID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseHalUrunFiyatDataModel that = (BaseHalUrunFiyatDataModel) o;
        return Objects.equals(responseStatus, that.responseStatus) && Objects.equals(errorGUID, that.errorGUID) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseStatus, errorGUID, message);
    }

    @Override
    public String toString() {
        return "BaseHalUrunFiyatDataModel{" +
                "responseStatus=" + responseStatus +
                ", errorGUID='" + errorGUID + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
