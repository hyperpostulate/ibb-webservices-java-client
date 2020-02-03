package org.mesutormanli.ibbwsclient.service.iett;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.iett.Duyuru;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

class DuyurularServiceTest extends BaseServiceTest {

    private DuyurularService duyurularService;

    @BeforeEach
    void setUp() {
        duyurularService = new DuyurularService();
    }

    @Test
    void getDuyurular() {
        final List<Duyuru> duyurular = duyurularService.getDuyurular();
        printResult(duyurular);
    }

    @Test
    void getDuyurularWithHat() {
        final List<Duyuru> duyurular = duyurularService.getDuyurular("HT48");
        printResult(duyurular);
    }
}