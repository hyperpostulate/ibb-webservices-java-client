package org.mesutormanli.ibbwsclient.model.trafik;

import com.google.gson.annotations.SerializedName;

/**
 * IBB trafik API'sindeki bir trafik indeksi verisini temsil eder.
 */
public record TrafficIndexData(
    /**
     * Trafik indeksi değeri.
     */
    @SerializedName("TrafficIndex") int trafficIndex,
    /**
     * Trafik indeksinin tarihi.
     */
    @SerializedName("TrafficIndexDate") String trafficIndexDate
) {}
