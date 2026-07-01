package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.ispark.Park;
import org.mesutormanli.ibbwsclient.model.ispark.ParkDetay;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.List;

public class IsparkService extends BaseService {

    public List<Park> getPark() {
        String json = executeGet(IbbClientConfig.ISPARK_PARK);
        return deserializeArray(json, Park[].class);
    }

    public ParkDetay getParkDetay(Integer parkId) {
        String json = executeGet(IbbClientConfig.ISPARK_PARK_DETAY + "?id=" + parkId);
        return deserializeObject(json, ParkDetay.class);
    }
}
