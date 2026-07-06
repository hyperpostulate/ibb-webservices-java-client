package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.trafik.TrafficIndexData;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.util.List;

public class IBBTrafikService extends BaseService {

    public List<TrafficIndexData> getTrafficIndexHistory(int day, String period) {
        String url = IbbClientConfig.TRAFFIC_INDEX_HISTORY + "/" + day + "/" + period;
        String json = executeGet(url);
        return JsonUtils.deserializeArray(json, TrafficIndexData[].class);
    }
}
