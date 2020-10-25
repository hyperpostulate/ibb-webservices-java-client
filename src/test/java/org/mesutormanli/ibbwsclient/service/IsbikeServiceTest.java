package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.isbike.IsbikeServiceResponse;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class IsbikeServiceTest extends BaseServiceTest {

    private IsbikeService isbikeService;

    @BeforeEach
    void setUp() {
        isbikeService = new IsbikeService();
    }

    @Test
    void getAllStationStatus() {
        final IsbikeServiceResponse allStationStatus = isbikeService.getAllStationStatus();
        printResult(Collections.singletonList(allStationStatus));
    }

    @Test
    void getStationStatus() {
        final IsbikeServiceResponse stationStatus = isbikeService.getStationStatus(1);
        printResult(Collections.singletonList(stationStatus));
    }
}
