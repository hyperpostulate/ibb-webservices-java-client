package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroServiceStatus(
    @SerializedName("LineId") int lineId,
    @SerializedName("Description") String description,
    @SerializedName("IsActive") boolean active,
    @SerializedName("LineName") String lineName,
    @SerializedName("LineColor") LineColor lineColor
) {
    public record LineColor(
        @SerializedName("Color_R") String colorR,
        @SerializedName("Color_G") String colorG,
        @SerializedName("Color_B") String colorB
    ) {}
}
