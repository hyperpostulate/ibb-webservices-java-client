package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.trafik.TrafficIndexData;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.util.List;

/**
 * IBB Trafik API'sini saran servis sınıfıdır.
 * <p>
 * Örnekler HTTP istemcisi dışında durum tutmaz ve eşzamanlı kullanıma uygundur.
 */
public class IBBTrafikService extends BaseService {

    /**
     * Belirtilen gün ve döneme ait trafik indeksi geçmişini döndürür.
     *
     * @param day sorgulanacak gün değeri
     * @param period sorgulanacak dönem değeri
     * @return trafik indeksi verilerinin listesi
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public List<TrafficIndexData> getTrafficIndexHistory(int day, String period) {
        String url = IbbClientConfig.TRAFFIC_INDEX_HISTORY + "/" + day + "/" + period;
        String json = executeGet(url);
        return JsonUtils.deserializeArray(json, TrafficIndexData[].class);
    }
}
