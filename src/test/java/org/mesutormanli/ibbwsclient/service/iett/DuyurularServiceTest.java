package org.mesutormanli.ibbwsclient.service.iett;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuyurularServiceTest {

    @Test
    void getDuyurular() {
        DuyurularService duyurularService = new DuyurularService();
        System.out.println(duyurularService.getDuyurular());
    }
}