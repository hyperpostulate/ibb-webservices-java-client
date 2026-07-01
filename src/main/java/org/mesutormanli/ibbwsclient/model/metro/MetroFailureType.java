package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroFailureType(
    @SerializedName("Id") int id,
    @SerializedName("Name") String name
) {}
