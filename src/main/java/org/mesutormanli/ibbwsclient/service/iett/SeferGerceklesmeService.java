package org.mesutormanli.ibbwsclient.service.iett;

import com.google.gson.Gson;
import org.mesutormanli.ibbwsclient.generated.iett.sefergerceklesme.SeferGerceklesme;
import org.mesutormanli.ibbwsclient.generated.iett.sefergerceklesme.SeferGerceklesmeSoap;
import org.mesutormanli.ibbwsclient.model.iett.BozukSatih;
import org.mesutormanli.ibbwsclient.model.iett.FiloAracKonum;
import org.mesutormanli.ibbwsclient.model.iett.KazaLokasyon;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeferGerceklesmeService extends BaseService {

    private static SeferGerceklesmeSoap soapService = new SeferGerceklesme().getSeferGerceklesmeSoap();

    public List<BozukSatih> getBozukSatih(int saat) {
        final String json = soapService.getBozukSatihJson(saat);
        return Arrays.asList(new Gson().fromJson(json, BozukSatih[].class));
    }

    public List<FiloAracKonum> getFiloAracKonum() {
        final String json = soapService.getFiloAracKonumJson();
        return Arrays.asList(new Gson().fromJson(json, FiloAracKonum[].class));
    }

    public List<FiloAracKonum> getFiloAracKonum(String plaka) {
        final String json = soapService.getFiloAracKonumJson();
        return Arrays.stream(new Gson().fromJson(json, FiloAracKonum[].class))
                .filter(filoAracKonum -> plaka.equals(filoAracKonum.getPlaka()))
                .collect(Collectors.toList());
    }

    public List<KazaLokasyon> getKazaLokasyon(String tarih) {
        final String json = soapService.getKazaLokasyonJson(tarih);
        return Arrays.asList(new Gson().fromJson(json, KazaLokasyon[].class));
    }
}
