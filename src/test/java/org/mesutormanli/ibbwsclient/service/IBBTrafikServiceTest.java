package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.trafik.TrafficIndexData;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

class IBBTrafikServiceTest extends BaseServiceTest {

    private IBBTrafikService ibbTrafikService;

    @BeforeEach
    void setUp() {
        ibbTrafikService = new IBBTrafikService();
    }

    @Test
    void getTrafficIndexHistory() {
        final List<TrafficIndexData> trafficData = ibbTrafikService.getTrafficIndexHistory(1, "5M");
        verifyResult(trafficData);
    }
}
