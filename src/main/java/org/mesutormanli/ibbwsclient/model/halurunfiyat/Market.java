package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

/**
 * IBB hal ürün fiyat API'sindeki bir hal/pazar bilgisini temsil eder.
 */
public record Market(
    /**
     * Pazarın kimliği.
     */
    @SerializedName("Id") Integer id,
    /**
     * Pazarın hal bilgisi.
     */
    @SerializedName("Hal") String hal
) {}
