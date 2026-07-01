package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroLine(
    @SerializedName("Id") int id,
    @SerializedName("Name") String name,
    @SerializedName("Description") String description,
    @SerializedName("LineColor") String lineColor,
    @SerializedName("LineWidth") int lineWidth
) {}
