package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

/**
 * IBB hal ürün fiyat API'sindeki bir ürün türünü temsil eder.
 */
public record ProductType(
    /**
     * Tabela kimliği.
     */
    @SerializedName("TabelaGId") String tabelaGId,
    /**
     * Ürün adı.
     */
    @SerializedName("UrunAd") String urunAd,
    /**
     * Kategori kimliği.
     */
    @SerializedName("KategoriId") Integer categoryId,
    /**
     * Hal türünün kimliği.
     */
    @SerializedName("HalTurId") Integer halTurId
) {}
