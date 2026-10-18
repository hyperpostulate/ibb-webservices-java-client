package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul Mobil API V2'nin standart zarf yanıtı.
 * <p>
 * Başarı durumu, hata payload'ı ve veri gövdesini birlikte taşıyan genel bir kayıttır.
 */
public record MetroServiceResponse<T>(
    /**
     * Boolean — API yanıtının başarı durumu. null, API'nin Success alanını göndermediği (tolere edilen) anlamına
     * gelir; false açık bir API hatasıdır.
     */
    @SerializedName("Success") Boolean success,
    /**
     * API hata payload'ı (başarısız yanıtlarda).
     */
    @SerializedName("Error") Object error,
    /**
     * Başarılı yanıtın veri gövdesi.
     */
    @SerializedName("Data") T data
) {}
