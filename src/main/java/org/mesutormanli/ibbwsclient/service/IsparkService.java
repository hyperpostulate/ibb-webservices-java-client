package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.ispark.Park;
import org.mesutormanli.ibbwsclient.model.ispark.ParkDetay;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.util.List;

public class IsparkService extends BaseService {

    public List<Park> getPark() {
        String json = executeGet(IbbClientConfig.ISPARK_PARK);
        return JsonUtils.deserializeArray(json, Park[].class);
    }

    public ParkDetay getParkDetay(int parkId) {
        String json = executeGet(IbbClientConfig.ISPARK_PARK_DETAY + "?id=" + parkId);
        return JsonUtils.deserializeObject(json, ParkDetay.class);
    }
}
