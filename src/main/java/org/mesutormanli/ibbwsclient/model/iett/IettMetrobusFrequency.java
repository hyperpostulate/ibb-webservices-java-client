package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir metrobüs sefer sıklığını temsil eder.
 */
public record IettMetrobusFrequency(
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi,
    /** Yön. */
    @SerializedName("Yon") String yon,
    /** Frekans. */
    @SerializedName("Frekans") String frekans,
    /** Başlangıç saati. */
    @SerializedName("BaslangicSaati") String baslangicSaati,
    /** Bitiş saati. */
    @SerializedName("BitisSaati") String bitisSaati,
    /** Süre. */
    @SerializedName("Sure") String sure
) {}
