package org.mesutormanli.ibbwsclient.service.ispark;

import com.google.gson.Gson;
import kong.unirest.Unirest;
import org.mesutormanli.ibbwsclient.model.ispark.Park;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;

public class ParkService extends BaseService {
    private static final String PARK_SERVICE_URL = "https://api.ibb.gov.tr/ispark/Park";

    public List<Park> getPark() {
        final String json = Unirest.get(PARK_SERVICE_URL)
                .asString().getBody();
        return Arrays.asList(new Gson().fromJson(json, Park[].class));

    }
}
