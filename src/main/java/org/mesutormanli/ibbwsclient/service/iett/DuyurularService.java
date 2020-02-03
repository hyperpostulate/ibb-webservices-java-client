package org.mesutormanli.ibbwsclient.service.iett;

import com.google.gson.Gson;
import org.mesutormanli.ibbwsclient.generated.iett.duyurular.Duyurular;
import org.mesutormanli.ibbwsclient.generated.iett.duyurular.DuyurularSoap;
import org.mesutormanli.ibbwsclient.model.iett.Duyuru;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuyurularService extends BaseService {

    private static DuyurularSoap soapService = new Duyurular().getDuyurularSoap();

    public List<Duyuru> getDuyurular() {
        final String json = soapService.getDuyurularJson();
        return Arrays.asList(new Gson().fromJson(json, Duyuru[].class));
    }

    public List<Duyuru> getDuyurular(String hat) {
        final String json = soapService.getDuyurularJson();
        final Duyuru[] duyurular = new Gson().fromJson(json, Duyuru[].class);
        return Arrays.stream(duyurular)
                .filter(duyuru -> hat.equals(duyuru.getHat()))
                .collect(Collectors.toList());
    }
}
