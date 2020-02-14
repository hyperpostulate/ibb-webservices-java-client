package org.mesutormanli.ibbwsclient.service.iett;

import com.google.gson.Gson;
import org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.PlanlananSeferSaatiSoap;
import org.mesutormanli.ibbwsclient.model.iett.PlanlananSeferSaati;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;

public class PlanlananSeferSaatiService extends BaseService {

    private static PlanlananSeferSaatiSoap soapService = new org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.PlanlananSeferSaati().getPlanlananSeferSaatiSoap();


    public List<PlanlananSeferSaati> getPlanlananSeferSaati(String hatKodu){
        final String json = soapService.getPlanlananSeferSaatiJson(hatKodu);
        return Arrays.asList(new Gson().fromJson(json, PlanlananSeferSaati[].class));
    }
}
