package org.mesutormanli.ibbwsclient.service.iett;

import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.iett.BozukSatih;
import org.mesutormanli.ibbwsclient.model.iett.FiloAracKonum;
import org.mesutormanli.ibbwsclient.model.iett.KazaLokasyon;

import java.util.List;

class SeferGerceklesmeServiceTest {

    @Test
    void getBozukSatih() {
        SeferGerceklesmeService seferGerceklesmeService = new SeferGerceklesmeService();
        final List<BozukSatih> bozukSatihlar = seferGerceklesmeService.getBozukSatih(15);
        bozukSatihlar.forEach(System.out::println);
    }

    @Test
    void getFiloAracKonum() {
        SeferGerceklesmeService seferGerceklesmeService = new SeferGerceklesmeService();
        final List<FiloAracKonum> filoAracKonumlar = seferGerceklesmeService.getFiloAracKonum();
        filoAracKonumlar.forEach(System.out::println);
    }

    @Test
    void getKazaLokasyon() {
        SeferGerceklesmeService seferGerceklesmeService = new SeferGerceklesmeService();
        final List<KazaLokasyon> kazaLokasyonlar = seferGerceklesmeService.getKazaLokasyon("2020-02-02");

        kazaLokasyonlar.forEach(System.out::println);
    }

    @Test
    void getFiloAracKonumWithPlaka() {
        SeferGerceklesmeService seferGerceklesmeService = new SeferGerceklesmeService();
        final List<FiloAracKonum> filoAracKonumlar = seferGerceklesmeService.getFiloAracKonum("34 NL 8220");
        filoAracKonumlar.forEach(System.out::println);
    }
}