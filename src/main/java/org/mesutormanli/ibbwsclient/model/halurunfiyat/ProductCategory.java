package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

public record ProductCategory(
    @SerializedName("Id") Integer id,
    @SerializedName("HalId") Integer halId,
    @SerializedName("Kategori") String category
) {}
