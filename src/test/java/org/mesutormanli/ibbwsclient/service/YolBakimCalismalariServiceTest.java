package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.yolbakim.YolBakimData;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

class YolBakimCalismalariServiceTest extends BaseServiceTest {

    private YolBakimCalismalariService yolBakimCalismalariService;

    @BeforeEach
    void setUp() {
        yolBakimCalismalariService = new YolBakimCalismalariService();
    }

    @Disabled("API endpoint is blocked by WAF")
    @Test
    void getRoadMaintenanceWorks() {
        final List<YolBakimData> works = yolBakimCalismalariService.getRoadMaintenanceWorks();
        verifyResult(works);
    }
}
