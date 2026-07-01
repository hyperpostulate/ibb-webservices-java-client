package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.airquality.AirQualityData;
import org.mesutormanli.ibbwsclient.model.airquality.AirQualityStation;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.List;

public class AirQualityService extends BaseService {

    public List<AirQualityStation> getAQIStations() {
        String json = executeGet(IbbClientConfig.AQI_STATIONS);
        return deserializeArray(json, AirQualityStation[].class);
    }

    public List<AirQualityData> getAQIByStationId(String stationId) {
        String json = executeGet(IbbClientConfig.AQI_BY_STATION + "?StationId=" + stationId);
        return deserializeArray(json, AirQualityData[].class);
    }
}
