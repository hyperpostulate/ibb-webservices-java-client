package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT arşivlenmiş bir seferi temsil eder.
 */
public record IettArchivedTrip(
    /** Görev numarası. */
    @SerializedName("GorevNo") String gorevNo,
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
    /** Araç plakası. */
    @SerializedName("Plaka") String plaka,
    /** Tarih (API'nin döndürdüğü biçimde). */
    @SerializedName("Tarih") String tarih,
    /** Başlangıç saati. */
    @SerializedName("BaslangicSaati") String baslangicSaati,
    /** Bitiş saati. */
    @SerializedName("BitisSaati") String bitisSaati,
    /** Açıklama. */
    @SerializedName("Aciklama") String aciklama
) {}
