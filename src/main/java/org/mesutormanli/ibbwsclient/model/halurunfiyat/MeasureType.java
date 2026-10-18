package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

/**
 * IBB hal ürün fiyat API'sindeki bir ölçü birimi türünü temsil eder.
 */
public record MeasureType(
    /**
     * Ölçü biriminin kimliği.
     */
    @SerializedName("Id") Integer id,
    /**
     * Ölçü birimi.
     */
    @SerializedName("Birim") String unit
) {}
