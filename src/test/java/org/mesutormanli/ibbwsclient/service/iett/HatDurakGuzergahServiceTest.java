package org.mesutormanli.ibbwsclient.service.iett;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HatDurakGuzergahServiceTest {

    @Test
    void getDurak() {
        HatDurakGuzergahService hatDurakGuzergahService = new HatDurakGuzergahService();
        System.out.println(hatDurakGuzergahService.getDurak(""));
    }

    @Test
    void getGaraj() {
        HatDurakGuzergahService hatDurakGuzergahService = new HatDurakGuzergahService();
        System.out.println(hatDurakGuzergahService.getGaraj());
    }
}