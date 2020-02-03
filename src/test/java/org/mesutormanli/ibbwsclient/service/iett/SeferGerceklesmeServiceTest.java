package org.mesutormanli.ibbwsclient.service.iett;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.iett.BozukSatih;
import org.mesutormanli.ibbwsclient.model.iett.FiloAracKonum;
import org.mesutormanli.ibbwsclient.model.iett.KazaLokasyon;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

class SeferGerceklesmeServiceTest extends BaseServiceTest {

    private SeferGerceklesmeService seferGerceklesmeService;

    @BeforeEach
    void setUp() {
        seferGerceklesmeService = new SeferGerceklesmeService();
    }

    @Test
    void getBozukSatih() {
        final List<BozukSatih> bozukSatihlar = seferGerceklesmeService.getBozukSatih(15);
        printResult(bozukSatihlar);
    }

    @Test
    void getFiloAracKonum() {
        final List<FiloAracKonum> filoAracKonumlar = seferGerceklesmeService.getFiloAracKonum();
        printResult(filoAracKonumlar);
    }

    @Test
    void getKazaLokasyon() {
        final List<KazaLokasyon> kazaLokasyonlar = seferGerceklesmeService.getKazaLokasyon("2020-02-02");
        printResult(kazaLokasyonlar);
    }

    @Test
    void getFiloAracKonumWithPlaka() {
        final List<FiloAracKonum> filoAracKonumlar = seferGerceklesmeService.getFiloAracKonum("34 NL 8220");
        printResult(filoAracKonumlar);
    }
}