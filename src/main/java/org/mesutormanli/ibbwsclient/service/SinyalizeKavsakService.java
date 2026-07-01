package org.mesutormanli.ibbwsclient.service;

import kong.unirest.Unirest;
import org.mesutormanli.ibbwsclient.model.sinyalizekavsak.Junction;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;

public class SinyalizeKavsakService extends BaseService {

    private static final String JUNCTION_URL = "https://api.ibb.gov.tr/web/api/junction";

    public List<Junction> getJunctions() {
        final String json = Unirest.get(JUNCTION_URL)
                .asString().getBody();
        return Arrays.asList(gson.fromJson(json, Junction[].class));
    }
}
