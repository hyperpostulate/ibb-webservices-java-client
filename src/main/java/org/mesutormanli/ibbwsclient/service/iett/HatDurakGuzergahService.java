package org.mesutormanli.ibbwsclient.service.iett;

import com.google.gson.Gson;
import org.mesutormanli.ibbwsclient.generated.iett.hatdurakguzergah.WebService1;
import org.mesutormanli.ibbwsclient.model.iett.Durak;
import org.mesutormanli.ibbwsclient.model.iett.Garaj;

import java.util.Arrays;
import java.util.List;

public class HatDurakGuzergahService {

    public List<Durak> getDurak(String durakKodu) {
        final String json = new WebService1().getWebService1Soap().getDurakJson(durakKodu);
        return Arrays.asList(new Gson().fromJson(json, Durak[].class));
    }

    public List<Garaj> getGaraj() {
        final String json = new WebService1().getWebService1Soap().getGarajJson();
        return Arrays.asList(new Gson().fromJson(json, Garaj[].class));
    }
}
