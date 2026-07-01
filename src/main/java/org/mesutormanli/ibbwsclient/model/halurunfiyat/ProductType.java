package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;

public record ProductType(
    @SerializedName("TabelaGId") String tabelaGId,
    @SerializedName("UrunAd") String urunAd,
    @SerializedName("KategoriId") Integer categoryId,
    @SerializedName("HalTurId") Integer halTurId
) {}
