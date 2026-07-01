package org.mesutormanli.ibbwsclient.service.base;

import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public abstract class BaseServiceTest {

    protected void verifyResult(List<? extends BaseDataModel> resultList) {
        assertNotNull(resultList);
        assertFalse(resultList.isEmpty());
        resultList.forEach(System.out::println);
    }
}
