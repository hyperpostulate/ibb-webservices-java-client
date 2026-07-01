package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroActivity(
    @SerializedName("Id") int id,
    @SerializedName("Name") String name,
    @SerializedName("Description") String description,
    @SerializedName("ImageUrl") String imageUrl,
    @SerializedName("StartDate") String startDate,
    @SerializedName("EndDate") String endDate
) {}
