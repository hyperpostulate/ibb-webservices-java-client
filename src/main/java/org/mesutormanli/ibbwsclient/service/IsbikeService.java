package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.isbike.IsbikeServiceResponse;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

/**
 * IBB İSBİKE API'sini saran servis sınıfıdır.
 * <p>
 * Örnekler HTTP istemcisi dışında durum tutmaz ve eşzamanlı kullanıma uygundur.
 */
public class IsbikeService extends BaseService {

    /**
     * Tüm İSBİKE istasyonlarının durumlarını döndürür.
     *
     * @return istasyon durumlarını içeren servis yanıtı
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public IsbikeServiceResponse getAllStationStatus() {
        String json = executePost(IbbClientConfig.ISBIKE_ALL_STATION_STATUS, "");
        return JsonUtils.deserializeObject(json, IsbikeServiceResponse.class);
    }

    /**
     * Belirtilen istasyona ait durum bilgilerini döndürür.
     *
     * @param guid sorgulanacak istasyon kimliği (GUID)
     * @return istasyon durumunu içeren servis yanıtı
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public IsbikeServiceResponse getStationStatus(int guid) {
        String body = JsonUtils.serialize(java.util.Map.of("guid", String.valueOf(guid)));
        String json = executePost(IbbClientConfig.ISBIKE_STATION_STATUS, body);
        return JsonUtils.deserializeObject(json, IsbikeServiceResponse.class);
    }
}
