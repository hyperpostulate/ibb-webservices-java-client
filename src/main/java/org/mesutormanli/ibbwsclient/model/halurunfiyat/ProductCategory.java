package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

/**
 * IBB hal ürün fiyat API'sindeki bir ürün kategorisini temsil eder.
 */
public record ProductCategory(
    /**
     * Kategorinin kimliği.
     */
    @SerializedName("Id") Integer id,
    /**
     * Kategorinin ait olduğu halin kimliği.
     */
    @SerializedName("HalId") Integer halId,
    /**
     * Kategori adı.
     */
    @SerializedName("Kategori") String category
) {}
