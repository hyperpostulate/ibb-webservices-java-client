package org.mesutormanli.ibbwsclient.model.ispark;

import com.google.gson.annotations.SerializedName;

/**
 * IBB İSPARK API'sindeki bir otopark tarifesini temsil eder.
 */
public record Tarife(
    /**
     * Tarife adı.
     */
    @SerializedName("Tarife") String tarife,
    /**
     * Tarife fiyatı.
     */
    @SerializedName("Fiyat") Double fiyat
) {}
