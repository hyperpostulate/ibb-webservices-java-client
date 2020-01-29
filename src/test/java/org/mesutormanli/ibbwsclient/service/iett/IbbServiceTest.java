package org.mesutormanli.ibbwsclient.service.iett;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IbbServiceTest {

    @Test
    void durakDetay() {
        IbbService ibbService = new IbbService();
        System.out.println(ibbService.durakDetay("32A"));
    }

    @Test
    void hatServisi() {
        IbbService ibbService = new IbbService();
        System.out.println(ibbService.hatServisi("32A"));
    }
}