package org.mesutormanli.ibbwsclient.service;

import kong.unirest.Unirest;
import org.mesutormanli.ibbwsclient.model.yolbakim.YolBakimData;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;

public class YolBakimCalismalariService extends BaseService {

    private static final String YOLBAKIM_SERVICE_BASE_URL = "https://api.ibb.gov.tr/teas/api/open_data";

    public List<YolBakimData> getRoadMaintenanceWorks() {
        final String json = Unirest.get(YOLBAKIM_SERVICE_BASE_URL)
                .asString().getBody();
        return Arrays.asList(gson.fromJson(json, YolBakimData[].class));
    }
}
