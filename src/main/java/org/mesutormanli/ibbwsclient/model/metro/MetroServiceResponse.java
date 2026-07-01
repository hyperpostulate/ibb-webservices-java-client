package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroServiceResponse<T>(
    @SerializedName("Success") boolean success,
    @SerializedName("Error") Object error,
    @SerializedName("Data") T data
) {}
