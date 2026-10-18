package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.ispark.Park;
import org.mesutormanli.ibbwsclient.model.ispark.ParkDetay;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.util.List;

/**
 * IBB İSPARK API'sini saran servis sınıfıdır.
 * <p>
 * Örnekler HTTP istemcisi dışında durum tutmaz ve eşzamanlı kullanıma uygundur.
 */
public class IsparkService extends BaseService {

    /**
     * Tüm İSPARK otoparklarını döndürür.
     *
     * @return otoparkların listesi
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public List<Park> getPark() {
        String json = executeGet(IbbClientConfig.ISPARK_PARK);
        return JsonUtils.deserializeArray(json, Park[].class);
    }

    /**
     * Belirtilen otoparkın ayrıntılı bilgilerini döndürür.
     *
     * @param parkId sorgulanacak otopark kimliği
     * @return otoparkın ayrıntı bilgileri
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public ParkDetay getParkDetay(int parkId) {
        String json = executeGet(IbbClientConfig.ISPARK_PARK_DETAY + "?id=" + parkId);
        return JsonUtils.deserializeObject(json, ParkDetay.class);
    }
}
