package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
    void getAllGaraj() {
        final List<Garaj> garaj = iettService.getAllGaraj();
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

    @Disabled
    @Test
    void getKazaLokasyon() {
        final List<KazaLokasyon> kazaLokasyon = iettService.getKazaLokasyon("2020-02-02");
        printResult(kazaLokasyon);
    }

    @Test
    void getAkaryakitToplamLitre() {
        List<AkaryakitToplamLitre> akaryakitToplamLitre = iettService.getAkaryakitToplamLitre(2019, 2);
        printResult(akaryakitToplamLitre);
    }
}
