package org.mesutormanli.ibbwsclient.service.base;

import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.List;

public abstract class BaseServiceTest {
    protected void printResult(List<? extends BaseDataModel> resultList) {
        resultList.forEach(System.out::println);
    }
}
