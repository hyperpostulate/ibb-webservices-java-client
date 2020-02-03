package org.mesutormanli.ibbwsclient.service.iett;

import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.iett.Durak;
import org.mesutormanli.ibbwsclient.model.iett.Garaj;

import java.util.List;

class HatDurakGuzergahServiceTest {

    @Test
    void getDurak() {
        HatDurakGuzergahService hatDurakGuzergahService = new HatDurakGuzergahService();
        final List<Durak> duraklar = hatDurakGuzergahService.getDurak("");
        duraklar.forEach(System.out::println);
    }

    @Test
    void getGaraj() {
        HatDurakGuzergahService hatDurakGuzergahService = new HatDurakGuzergahService();
        final List<Garaj> garajlar = hatDurakGuzergahService.getGaraj();
        garajlar.forEach(System.out::println);
    }
}