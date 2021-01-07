package org.mesutormanli.ibbwsclient.service;

import kong.unirest.Unirest;
import org.mesutormanli.ibbwsclient.model.isbike.IsbikeServiceResponse;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

public class IsbikeService extends BaseService {

    private static final String ISBIKE_SERVICE_BASE_URL = "https://kurumsalapi.ispark.istanbul/DebtApi/bike";
    private static final String ALL_STATION_STATUS_URL = ISBIKE_SERVICE_BASE_URL + "/GetAllStationStatus";
    private static final String STATION_STATUS_URL = ISBIKE_SERVICE_BASE_URL + "/GetStationStatus";

    public IsbikeServiceResponse getAllStationStatus() {
        final String json = Unirest.post(ALL_STATION_STATUS_URL)
                .asString().getBody();
        return gson.fromJson(json, IsbikeServiceResponse.class);
    }

    public IsbikeServiceResponse getStationStatus(int guid) {
        final String json = Unirest.post(STATION_STATUS_URL)
                .header("Content-Type", "application/json")
                .body("{\"guid\":\"" + guid + "\"}")
                .asString().getBody();
        return gson.fromJson(json, IsbikeServiceResponse.class);
    }
}
