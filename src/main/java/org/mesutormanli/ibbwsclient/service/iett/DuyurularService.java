package org.mesutormanli.ibbwsclient.service.iett;

import com.google.gson.Gson;
import org.mesutormanli.ibbwsclient.generated.iett.duyurular.Duyurular;
import org.mesutormanli.ibbwsclient.model.iett.Duyuru;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuyurularService {

    public List<Duyuru> getDuyurular() {
        final String json = new Duyurular().getDuyurularSoap().getDuyurularJson();
        return Arrays.asList(new Gson().fromJson(json, Duyuru[].class));
    }

    public List<Duyuru> getDuyurular(String hat) {
        final String json = new Duyurular().getDuyurularSoap().getDuyurularJson();
        final Duyuru[] duyurular = new Gson().fromJson(json, Duyuru[].class);
        return Arrays.stream(duyurular)
                .filter(duyuru -> hat.equals(duyuru.getHat()))
                .collect(Collectors.toList());
    }
}
