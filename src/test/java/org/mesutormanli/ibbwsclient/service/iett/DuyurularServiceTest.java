package org.mesutormanli.ibbwsclient.service.iett;

import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.iett.Duyuru;

import java.util.List;

class DuyurularServiceTest {

    @Test
    void getDuyurular() {
        DuyurularService duyurularService = new DuyurularService();
        final List<Duyuru> duyurular = duyurularService.getDuyurular();

        duyurular.forEach(System.out::println);

    }
}