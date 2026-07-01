package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

public record ProductPrice(
    @SerializedName("TabelaGId") String tabelaGId,
    @SerializedName("UrunAd") String urunAd,
    @SerializedName("BirimTurId") Integer birimTurId,
    @SerializedName("KategoriId") Integer categoryId,
    @SerializedName("EnDusukFiyat") Double minPrice,
    @SerializedName("EnYuksekFiyat") Double maxPrice,
    @SerializedName("GuneAit") String validFor,
    @SerializedName("HalTurId") Integer halTurId
) {}
