package org.mesutormanli.ibbwsclient.model.sinyalizekavsak;

import com.google.gson.annotations.SerializedName;

/**
 * IBB sinyalize kavşak API'sindeki bir kavşağı temsil eder.
 */
public record Junction(
    /**
     * Kavşak numarası.
     */
    @SerializedName("JunctionNo") int junctionNo,
    /**
     * Kavşak adı.
     */
    @SerializedName("JunctionName") String junctionName,
    /**
     * Kavşağın X koordinatı.
     */
    @SerializedName("XCoord") String xCoord,
    /**
     * Kavşağın Y koordinatı.
     */
    @SerializedName("YCoord") String yCoord
) {}
