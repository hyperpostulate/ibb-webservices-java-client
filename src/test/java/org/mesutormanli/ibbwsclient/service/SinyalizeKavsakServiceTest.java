package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.sinyalizekavsak.Junction;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

class SinyalizeKavsakServiceTest extends BaseServiceTest {

    private SinyalizeKavsakService sinyalizeKavsakService;

    @BeforeEach
    void setUp() {
        sinyalizeKavsakService = new SinyalizeKavsakService();
    }

    @Test
    void getJunctions() {
        final List<Junction> junctions = sinyalizeKavsakService.getJunctions();
        printResult(junctions);
    }
}
