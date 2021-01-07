package org.mesutormanli.ibbwsclient.service;

import kong.unirest.Unirest;
import org.mesutormanli.ibbwsclient.model.ispark.Park;
import org.mesutormanli.ibbwsclient.model.ispark.ParkDetay;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsparkService extends BaseService {

    private static final String ISPARK_SERVICE_BASE_URL = "https://api.ibb.gov.tr/ispark";
    private static final String PARK_URL = ISPARK_SERVICE_BASE_URL + "/Park";
    private static final String PARK_DETAY_URL = ISPARK_SERVICE_BASE_URL + "/ParkDetay";

    public List<Park> getPark() {
        final String json = Unirest.get(PARK_URL)
                .asString().getBody();
        return Arrays.asList(gson.fromJson(json, Park[].class));

    }

    public ParkDetay getParkDetay(Integer parkId) {
        final String json = Unirest.get(PARK_DETAY_URL)
                .queryString("id", parkId)
                .asString().getBody();

        return gson.fromJson(json, ParkDetay.class);

    }

    public List<ParkDetay> getAvailableParkDetayListWithIlce(String ilce) {
        return getPark()
                .stream()
                .filter(park -> ilce.equals(park.getIlce()))
                .map(Park::getParkId)
                .map(this::getParkDetay)
                .filter(parkDetay -> parkDetay.getBosKapasite() > 0)
                .collect(Collectors.toList());
    }

    public List<ParkDetay> getAvailableParkDetayListWithParkTipi(String parkTipi) {
        return getPark()
                .stream()
                .filter(park -> parkTipi.equals(park.getParkTipi()))
                .map(Park::getParkId)
                .map(this::getParkDetay)
                .filter(parkDetay -> parkDetay.getBosKapasite() > 0)
                .collect(Collectors.toList());
    }

    public List<ParkDetay> getAvailableParkDetayListWithIlceAndParkTipi(String ilce, String parkTipi) {
        return getPark()
                .stream()
                .filter(park -> ilce.equals(park.getIlce()) && parkTipi.equals(park.getParkTipi()))
                .map(Park::getParkId)
                .map(this::getParkDetay)
                .filter(parkDetay -> parkDetay.getBosKapasite() > 0)
                .collect(Collectors.toList());
    }
}
