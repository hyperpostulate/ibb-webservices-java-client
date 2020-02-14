package org.mesutormanli.ibbwsclient.service.ispark;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.ispark.Park;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParkServiceTest extends BaseServiceTest {

    private ParkService parkService;

    @BeforeEach
    void setUp() {
        parkService = new ParkService();
    }

    @Test
    void getPark() {
        final List<Park> parklar = parkService.getPark();
        printResult(parklar);

    }
}
