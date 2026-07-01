package org.mesutormanli.ibbwsclient.model.sinyalizekavsak;

import com.google.gson.annotations.SerializedName;

public record Junction(
    @SerializedName("JunctionNo") int junctionNo,
    @SerializedName("JunctionName") String junctionName,
    @SerializedName("XCoord") String xCoord,
    @SerializedName("YCoord") String yCoord
) {}
