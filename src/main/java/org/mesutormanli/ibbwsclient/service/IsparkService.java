package org.mesutormanli.ibbwsclient.service;

import com.google.gson.Gson;
import kong.unirest.Unirest;
import org.mesutormanli.ibbwsclient.model.ispark.Park;
import org.mesutormanli.ibbwsclient.model.ispark.ParkDetay;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;

public class IsparkService extends BaseService {
    private static final String PARK_SERVICE_URL = "https://api.ibb.gov.tr/ispark/Park";
    private static final String PARK_DETAY_SERVICE_URL = "https://api.ibb.gov.tr/ispark/ParkDetay";

    public List<Park> getPark() {
        final String json = Unirest.get(PARK_SERVICE_URL)
                .asString().getBody();
        return Arrays.asList(new Gson().fromJson(json, Park[].class));

    }

    public ParkDetay getParkDetay(String parkId) {
        final String json = Unirest.get(PARK_DETAY_SERVICE_URL)
                .queryString("id", parkId)
                .asString().getBody();

        return new Gson().fromJson(json, ParkDetay.class);

    }
}
