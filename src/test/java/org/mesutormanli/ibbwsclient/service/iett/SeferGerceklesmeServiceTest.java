package org.mesutormanli.ibbwsclient.service.iett;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeferGerceklesmeServiceTest {

    @Test
    void getBozukSatih() {
        SeferGerceklesmeService seferGerceklesmeService = new SeferGerceklesmeService();
        System.out.println(seferGerceklesmeService.getBozukSatih(15));
    }

    @Test
    void getFiloAracKonum() {
        SeferGerceklesmeService seferGerceklesmeService = new SeferGerceklesmeService();
        System.out.println(seferGerceklesmeService.getFiloAracKonum());
    }

    @Test
    void getKazaLokasyon() {
        SeferGerceklesmeService seferGerceklesmeService = new SeferGerceklesmeService();
        System.out.println(seferGerceklesmeService.getKazaLokasyon(""));
    }
}