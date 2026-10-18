package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * IBB hal ürün fiyat API'sinden dönen genel yanıt zarfını temsil eder.
 */
public record HalServiceResponse<T>(
    /**
     * Yanıtın başarılı olup olmadığını belirten durum bilgisi.
     */
    @SerializedName("ResponseStatus") Boolean responseStatus,
    /**
     * Hata durumunda dönen hata kimliği (GUID).
     */
    @SerializedName("ErrorGUID") String errorGUID,
    /**
     * API tarafından dönen mesaj.
     */
    @SerializedName("Message") String message,
    /**
     * Yanıtın sonuç listesi.
     */
    @SerializedName("Results") List<T> results
) {}
