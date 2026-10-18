package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.sinyalizekavsak.Junction;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.util.List;

/**
 * IBB Sinyalize Kavşak API'sini saran servis sınıfıdır.
 * <p>
 * Örnekler HTTP istemcisi dışında durum tutmaz ve eşzamanlı kullanıma uygundur.
 */
public class SinyalizeKavsakService extends BaseService {

    /**
     * Sinyalize kavşakların listesini döndürür.
     *
     * @return kavşakların listesi
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public List<Junction> getJunctions() {
        String json = executeGet(IbbClientConfig.JUNCTION);
        return JsonUtils.deserializeArray(json, Junction[].class);
    }
}
