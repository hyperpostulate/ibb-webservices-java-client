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
    void getAllDuyurular() {
        final List<Duyuru> duyurular = iettService.getAllDuyurular();
        printResult(duyurular);
    }

    @Test
    void getDuyurularWithHat() {
        final List<Duyuru> duyurularWithHat = iettService.getDuyurularWithHat("32A");
        printResult(duyurularWithHat);
    }

    @Test
    void getAllDurak() {
        final List<Durak> durak = iettService.getAllDurak();
        printResult(durak);
    }

    @Test
    void getDurakWithDurakKodu() {
        final List<Durak> durak = iettService.getDurakWithDurakKodu("202471");
        printResult(durak);
    }

    @Test
    void getDurakWithIlce() {
        final List<Durak> durak = iettService.getDurakWithIlce("Esenler");
        printResult(durak);
    }

    @Test
    void getDurakWithYon() {
        final List<Durak> durak = iettService.getDurakWithYon("FENERTEPE");
        printResult(durak);
    }

    @Test
    void getAllGaraj() {
        final List<Garaj> garaj = iettService.getAllGaraj();
        printResult(garaj);
    }

    @Test
    void getGarajWithGarajAdi() {
        final List<Garaj> garaj = iettService.getGarajWithGarajAdi("AVCILARGARAJI");
        printResult(garaj);
    }

    @Test
    void getPlanlananSeferSaatiWithHat() {
        final List<PlanlananSeferSaati> planlananSeferSaati = iettService.getPlanlananSeferSaatiWithHat("32A");
        printResult(planlananSeferSaati);
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
