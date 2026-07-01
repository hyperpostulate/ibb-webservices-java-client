package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.isbike.IsbikeServiceResponse;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class IsbikeServiceTest extends BaseServiceTest {

    private IsbikeService isbikeService;

    @BeforeEach
    void setUp() {
        isbikeService = new IsbikeService();
    }

    @Test
    void getAllStationStatus() {
        final IsbikeServiceResponse allStationStatus = isbikeService.getAllStationStatus();
        assertNotNull(allStationStatus);
        assertNotNull(allStationStatus.dataList());
        System.out.println(allStationStatus);
    }

    @Test
    void getStationStatus() {
        final IsbikeServiceResponse stationStatus = isbikeService.getStationStatus(1);
        assertNotNull(stationStatus);
        System.out.println(stationStatus);
    }
}
