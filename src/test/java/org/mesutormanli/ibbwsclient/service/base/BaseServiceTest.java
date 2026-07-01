package org.mesutormanli.ibbwsclient.service.base;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public abstract class BaseServiceTest {

    protected void verifyResult(List<?> resultList) {
        assertNotNull(resultList);
        assertFalse(resultList.isEmpty());
        resultList.forEach(System.out::println);
    }
}
