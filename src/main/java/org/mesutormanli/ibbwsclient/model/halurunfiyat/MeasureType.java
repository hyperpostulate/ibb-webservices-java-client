package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

public record MeasureType(
    @SerializedName("Id") Integer id,
    @SerializedName("Birim") String unit
) {}
