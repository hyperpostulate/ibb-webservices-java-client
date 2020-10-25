package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.airquality.AirQualityData;
import org.mesutormanli.ibbwsclient.model.airquality.AirQualityStation;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AirQualityServiceTest extends BaseServiceTest {

    private AirQualityService airQualityService;

    @BeforeEach
    void setUp() {
        airQualityService = new AirQualityService();
    }

    @Test
    void getAQIStations() {
        final List<AirQualityStation> airQualityStations = airQualityService.getAQIStations();
        printResult(airQualityStations);
    }

    @Test
    void getAQIByStationId() {
        final List<AirQualityData> airQualityData = airQualityService.getAQIByStationId("cb4cd1c2-b55b-484f-ac7a-505369405d00");
        printResult(airQualityData);
    }
}
