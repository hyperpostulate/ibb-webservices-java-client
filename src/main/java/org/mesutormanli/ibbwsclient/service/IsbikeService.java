package org.mesutormanli.ibbwsclient.service;

import kong.unirest.Unirest;
import org.mesutormanli.ibbwsclient.model.isbike.IsbikeServiceResponse;
import org.mesutormanli.ibbwsclient.model.ispark.ParkDetay;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

public class IsbikeService extends BaseService {

    private static final String GET_ALL_STATION_STATUS_URL = "https://kurumsalapi.ispark.istanbul/DebtApi/bike/GetAllStationStatus";
    private static final String GET_STATION_STATUS_URL = "https://kurumsalapi.ispark.istanbul/DebtApi/bike/GetStationStatus";

    public IsbikeServiceResponse getAllStationStatus(){
        final String json = Unirest.post(GET_ALL_STATION_STATUS_URL)
                .asString().getBody();
        return gson.fromJson(json, IsbikeServiceResponse.class);
    }

    public IsbikeServiceResponse getStationStatus(int guid){
        final String json = Unirest.post(GET_STATION_STATUS_URL)
                .header("Content-Type", "application/json")
                .body("{\"guid\":\""+guid+"\"}")
                .asString().getBody();
        return gson.fromJson(json, IsbikeServiceResponse.class);
    }
}
