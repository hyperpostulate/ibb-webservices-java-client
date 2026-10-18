package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir aracın özelliklerini temsil eder.
 */
public record IettVehicleFeature(
    /** Kapı numarası. */
    @SerializedName("KapiNo") String kapiNo,
    /** Araç plakası. */
    @SerializedName("Plaka") String plaka,
    /** Marka. */
    @SerializedName("Marka") String marka,
    /** Model. */
    @SerializedName("Model") String model,
    /** Yıl. */
    @SerializedName("Yil") Integer yil,
    /** Yakıt türü. */
    @SerializedName("YakitTuru") String yakitTuru,
    /** Üretim yılı. */
    @SerializedName("UretimYili") Integer uretimYili,
    /** Durum. */
    @SerializedName("Durumu") String durumu
) {}
