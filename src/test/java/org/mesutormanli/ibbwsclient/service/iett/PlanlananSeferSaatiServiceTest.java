package org.mesutormanli.ibbwsclient.service.iett;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.iett.PlanlananSeferSaati;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlanlananSeferSaatiServiceTest extends BaseServiceTest {

    private PlanlananSeferSaatiService planlananSeferSaatiService;

    @BeforeEach
    void setUp() {
        planlananSeferSaatiService = new PlanlananSeferSaatiService();
    }

    @Test
    void getPlanlananSeferSaati() {
        final List<PlanlananSeferSaati> planlananSeferSaati = planlananSeferSaatiService.getPlanlananSeferSaati("32A");
        printResult(planlananSeferSaati);
    }
}
