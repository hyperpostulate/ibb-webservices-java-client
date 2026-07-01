package org.mesutormanli.ibbwsclient.model.trafik;

import com.google.gson.annotations.SerializedName;

public record TrafficIndexData(
    @SerializedName("TrafficIndex") int trafficIndex,
    @SerializedName("TrafficIndexDate") String trafficIndexDate
) {}
