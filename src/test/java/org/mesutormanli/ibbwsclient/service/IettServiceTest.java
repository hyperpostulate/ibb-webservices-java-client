package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.iett.*;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

class IettServiceTest extends BaseServiceTest {

    private IettService iettService;

    @BeforeEach
    void setUp() {
        iettService = new IettService();
    }

    @Test
    void getDuyurular() {
        final List<Duyuru> duyurular = iettService.getDuyurular();
        printResult(duyurular);
    }

    @Test
    void getDuyurularWithHat() {
        final List<Duyuru> duyurularWithHat = iettService.getDuyurularWithHat("32A");
        printResult(duyurularWithHat);
    }

    @Test
    void getDurak() {
        final List<Durak> durak = iettService.getDurak("");
        printResult(durak);
    }

    @Test
    void getGaraj() {
        final List<Garaj> garaj = iettService.getGaraj();
        printResult(garaj);
    }

    @Test
    void getPlanlananSeferSaati() {
        final List<PlanlananSeferSaati> planlananSeferSaati = iettService.getPlanlananSeferSaati("32A");
        printResult(planlananSeferSaati);
    }

    @Test
    void getBozukSatih() {
        final List<BozukSatih> bozukSatih = iettService.getBozukSatih(15);
        printResult(bozukSatih);
    }

    @Test
    void getFiloAracKonum() {
        final List<FiloAracKonum> filoAracKonum = iettService.getFiloAracKonum();
        printResult(filoAracKonum);
    }

    @Test
    void getFiloAracKonumWithPlaka() {
        final List<FiloAracKonum> filoAracKonumWithPlaka = iettService.getFiloAracKonumWithPlaka("34 NL 8220");
        printResult(filoAracKonumWithPlaka);
    }

    @Test
    void getKazaLokasyon() {
        final List<KazaLokasyon> kazaLokasyon = iettService.getKazaLokasyon("2020-02-02");
        printResult(kazaLokasyon);
    }
}
