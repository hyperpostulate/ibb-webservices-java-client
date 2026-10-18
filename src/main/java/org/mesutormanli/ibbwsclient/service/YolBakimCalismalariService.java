package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.yolbakim.YolBakimData;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.util.List;

/**
 * IBB Yol Bakım Çalışmaları API'sini saran servis sınıfıdır.
 * <p>
 * Örnekler HTTP istemcisi dışında durum tutmaz ve eşzamanlı kullanıma uygundur.
 */
public class YolBakimCalismalariService extends BaseService {

    /**
     * Yol bakım çalışmalarının listesini döndürür.
     *
     * @return yol bakım çalışmalarının listesi
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public List<YolBakimData> getRoadMaintenanceWorks() {
        String json = executeGet(IbbClientConfig.YOL_BAKIM);
        return JsonUtils.deserializeArray(json, YolBakimData[].class);
    }
}
