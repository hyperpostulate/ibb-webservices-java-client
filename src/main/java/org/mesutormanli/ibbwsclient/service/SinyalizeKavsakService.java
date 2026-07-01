package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.sinyalizekavsak.Junction;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.List;

public class SinyalizeKavsakService extends BaseService {

    public List<Junction> getJunctions() {
        String json = executeGet(IbbClientConfig.JUNCTION);
        return deserializeArray(json, Junction[].class);
    }
}
