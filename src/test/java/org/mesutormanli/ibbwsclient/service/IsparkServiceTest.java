package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.ispark.Park;
import org.mesutormanli.ibbwsclient.model.ispark.ParkDetay;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.Collections;
import java.util.List;

@Disabled
class IsparkServiceTest extends BaseServiceTest {

    private IsparkService isparkService;

    @BeforeEach
    void setUp() {
        isparkService = new IsparkService();
    }

    @Test
    void getPark() {
        final List<Park> park = isparkService.getPark();
        printResult(park);
    }

    @Test
    void getParkDetay() {
        final ParkDetay parkDetay = isparkService.getParkDetay(395);
        printResult(Collections.singletonList(parkDetay));
    }

}
