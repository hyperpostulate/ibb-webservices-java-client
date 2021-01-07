package org.mesutormanli.ibbwsclient.service;

import kong.unirest.Unirest;
import org.mesutormanli.ibbwsclient.model.airquality.AirQualityData;
import org.mesutormanli.ibbwsclient.model.airquality.AirQualityStation;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;

public class AirQualityService extends BaseService {
    private static final String AQI_SERVICE_BASE_URL = "https://api.ibb.gov.tr/havakalitesi/OpenDataPortalHandler";
    private static final String AQI_STATIONS_URL = AQI_SERVICE_BASE_URL + "/GetAQIStations";
    private static final String AQI_BY_STATION_URL = AQI_SERVICE_BASE_URL + "/GetAQIByStationId";

    public List<AirQualityStation> getAQIStations() {
        final String json = Unirest.get(AQI_STATIONS_URL)
                .asString().getBody();
        return Arrays.asList(gson.fromJson(json, AirQualityStation[].class));
    }

    public List<AirQualityData> getAQIByStationId(String stationId) {
        final String json = Unirest.get(AQI_BY_STATION_URL)
                .queryString("StationId", stationId)
                .asString().getBody();

        return Arrays.asList(gson.fromJson(json, AirQualityData[].class));
    }

    public List<AirQualityData> getAQIByStationName(String stationName) {
        final String stationId = getAQIStations()
                .stream()
                .filter(station -> stationName.equals(station.getName()))
                .findFirst().get().getId();

        return getAQIByStationId(stationId);
    }
}
