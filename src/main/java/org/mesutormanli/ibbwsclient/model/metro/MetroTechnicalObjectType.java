package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroTechnicalObjectType(
    @SerializedName("Id") int id,
    @SerializedName("Name") String name,
    @SerializedName("Description") String description
) {}
