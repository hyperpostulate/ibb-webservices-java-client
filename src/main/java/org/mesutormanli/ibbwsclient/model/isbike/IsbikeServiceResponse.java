package org.mesutormanli.ibbwsclient.model.isbike;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * IBB İSBİKE API'sinden dönen yanıtı temsil eder.
 */
public record IsbikeServiceResponse(
    /**
     * Servis kodu.
     */
    @SerializedName("serviceCode") int serviceCode,
    /**
     * Servis açıklaması.
     */
    @SerializedName("serviceDesc") String serviceDesc,
    /**
     * İstasyon verilerinin listesi.
     */
    @SerializedName("dataList") List<IsbikeStation> dataList
) {}
