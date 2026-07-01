package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.ispark.Park;
import org.mesutormanli.ibbwsclient.model.ispark.ParkDetay;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Disabled("ISPARK API endpoints are currently unavailable")
class IsparkServiceTest extends BaseServiceTest {

    private IsparkService isparkService;

    @BeforeEach
    void setUp() {
        isparkService = new IsparkService();
    }

    @Test
    void getPark() {
        final List<Park> park = isparkService.getPark();
        verifyResult(park);
    }

    @Test
    void getParkDetay() {
        final ParkDetay parkDetay = isparkService.getParkDetay(395);
        assertNotNull(parkDetay);
        System.out.println(parkDetay);
    }
}
