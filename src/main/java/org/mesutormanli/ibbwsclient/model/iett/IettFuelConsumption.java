package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir yakıt tüketimi verisini temsil eder.
 */
public record IettFuelConsumption(
    /** Yıl. */
    @SerializedName("Yil") Integer yil,
    /** Ay. */
    @SerializedName("Ay") Integer ay,
    /** Toplam litre. */
    @SerializedName("ToplamLitre") Double toplamLitre,
    /** Yakıt türü. */
    @SerializedName("YakitTuru") String yakitTuru,
    /** Ortalama tüketim. */
    @SerializedName("OrtalamaTuketim") Double ortalamaTuketim,
    /** Araç sayısı. */
    @SerializedName("AracSayisi") Integer aracSayisi
) {}
