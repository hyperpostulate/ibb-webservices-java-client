package org.mesutormanli.ibbwsclient.service.iett;

import com.google.gson.Gson;
import org.mesutormanli.ibbwsclient.generated.iett.hatdurakguzergah.WebService1;
import org.mesutormanli.ibbwsclient.generated.iett.hatdurakguzergah.WebService1Soap;
import org.mesutormanli.ibbwsclient.model.iett.Durak;
import org.mesutormanli.ibbwsclient.model.iett.Garaj;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;

public class HatDurakGuzergahService extends BaseService {

    private static WebService1Soap soapService = new WebService1().getWebService1Soap();

    public List<Durak> getDurak(String durakKodu) {
        final String json = soapService.getDurakJson(durakKodu);
        return Arrays.asList(new Gson().fromJson(json, Durak[].class));
    }

    public List<Garaj> getGaraj() {
        final String json = soapService.getGarajJson();
        return Arrays.asList(new Gson().fromJson(json, Garaj[].class));
    }
}
