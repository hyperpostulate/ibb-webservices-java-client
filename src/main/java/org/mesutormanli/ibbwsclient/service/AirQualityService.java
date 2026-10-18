package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.airquality.AirQualityData;
import org.mesutormanli.ibbwsclient.model.airquality.AirQualityStation;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.util.List;

/**
 * IBB Hava Kalitesi API'sini saran servis sınıfıdır.
 * <p>
 * Örnekler HTTP istemcisi dışında durum tutmaz ve eşzamanlı kullanıma uygundur.
 */
public class AirQualityService extends BaseService {

    /**
     * Tüm hava kalitesi ölçüm istasyonlarını döndürür.
     *
     * @return hava kalitesi ölçüm istasyonlarının listesi
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public List<AirQualityStation> getAQIStations() {
        String json = executeGet(IbbClientConfig.AQI_STATIONS);
        return JsonUtils.deserializeArray(json, AirQualityStation[].class);
    }

    /**
     * Belirtilen istasyon kimliğine ait hava kalitesi ölçüm verilerini döndürür.
     *
     * @param stationId sorgulanacak istasyon kimliği
     * @return istasyonun hava kalitesi ölçüm verilerinin listesi
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public List<AirQualityData> getAQIByStationId(String stationId) {
        String json = executeGet(IbbClientConfig.AQI_BY_STATION + "?StationId=" + stationId);
        return JsonUtils.deserializeArray(json, AirQualityData[].class);
    }
}
