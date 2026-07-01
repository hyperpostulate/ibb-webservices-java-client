package org.mesutormanli.ibbwsclient.service;

import kong.unirest.Unirest;
import org.mesutormanli.ibbwsclient.model.trafik.TrafficIndexData;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;

public class IBBTrafikService extends BaseService {

    private static final String TRAFIK_SERVICE_BASE_URL = "https://api.ibb.gov.tr/tkmservices/api/TrafficData/v1";
    private static final String TRAFFIC_INDEX_HISTORY_URL = TRAFIK_SERVICE_BASE_URL + "/TrafficIndexHistory";

    public List<TrafficIndexData> getTrafficIndexHistory(int day, String period) {
        final String url = TRAFFIC_INDEX_HISTORY_URL + "/" + day + "/" + period;
        final String json = Unirest.get(url)
                .header("Accept", "application/json")
                .asString().getBody();
        return Arrays.asList(gson.fromJson(json, TrafficIndexData[].class));
    }
}
