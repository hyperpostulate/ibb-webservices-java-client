package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

public record Market(
    @SerializedName("Id") Integer id,
    @SerializedName("Hal") String hal
) {}
