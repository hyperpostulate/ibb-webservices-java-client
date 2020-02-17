package org.mesutormanli.ibbwsclient.service.base;

import com.google.gson.Gson;

public abstract class BaseService {

    protected Gson gson;

    protected BaseService() {
        this.gson = new Gson();
    }
}
