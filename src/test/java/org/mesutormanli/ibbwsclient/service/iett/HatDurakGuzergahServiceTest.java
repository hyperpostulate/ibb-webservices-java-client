package org.mesutormanli.ibbwsclient.service.iett;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.iett.Durak;
import org.mesutormanli.ibbwsclient.model.iett.Garaj;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

class HatDurakGuzergahServiceTest extends BaseServiceTest {

    private HatDurakGuzergahService hatDurakGuzergahService;

    @BeforeEach
    void setUp() {
        hatDurakGuzergahService = new HatDurakGuzergahService();
    }

    @Test
    void getDurak() {
        final List<Durak> duraklar = hatDurakGuzergahService.getDurak("");
        printResult(duraklar);
    }

    @Test
    void getGaraj() {
        final List<Garaj> garajlar = hatDurakGuzergahService.getGaraj();
        printResult(garajlar);
    }
}