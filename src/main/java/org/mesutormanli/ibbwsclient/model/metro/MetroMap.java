package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroMap(
    @SerializedName("Id") int id,
    @SerializedName("Name") String name,
    @SerializedName("ImageUrl") String imageUrl,
    @SerializedName("Description") String description
) {}
