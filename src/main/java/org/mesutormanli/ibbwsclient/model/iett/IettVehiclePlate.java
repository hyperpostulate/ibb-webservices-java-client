package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir aracın plaka bilgisini temsil eder.
 */
public record IettVehiclePlate(
    /** Araç plakası. */
    @SerializedName("Plaka") String plaka,
    /** Kapı numarası. */
    @SerializedName("KapiNo") String kapiNo,
    /** Marka. */
    @SerializedName("Marka") String marka,
    /** Model. */
    @SerializedName("Model") String model,
    /** Yıl. */
    @SerializedName("Yil") Integer yil
) {}
