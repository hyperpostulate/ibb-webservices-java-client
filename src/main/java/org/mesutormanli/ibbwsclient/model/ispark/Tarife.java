package org.mesutormanli.ibbwsclient.model.ispark;

import com.google.gson.annotations.SerializedName;

public record Tarife(
    @SerializedName("Tarife") String tarife,
    @SerializedName("Fiyat") Double fiyat
) {}
