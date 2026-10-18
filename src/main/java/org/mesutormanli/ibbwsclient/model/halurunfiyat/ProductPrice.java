package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

/**
 * IBB hal ürün fiyat API'sindeki bir ürün fiyat kaydını temsil eder.
 */
public record ProductPrice(
    /**
     * Tabela kimliği.
     */
    @SerializedName("TabelaGId") String tabelaGId,
    /**
     * Ürün adı.
     */
    @SerializedName("UrunAd") String urunAd,
    /**
     * Birim türünün kimliği.
     */
    @SerializedName("BirimTurId") Integer birimTurId,
    /**
     * Kategori kimliği.
     */
    @SerializedName("KategoriId") Integer categoryId,
    /**
     * En düşük fiyat.
     */
    @SerializedName("EnDusukFiyat") Double minPrice,
    /**
     * En yüksek fiyat.
     */
    @SerializedName("EnYuksekFiyat") Double maxPrice,
    /**
     * Fiyatın ait olduğu gün bilgisi.
     */
    @SerializedName("GuneAit") String validFor,
    /**
     * Hal türünün kimliği.
     */
    @SerializedName("HalTurId") Integer halTurId
) {}
