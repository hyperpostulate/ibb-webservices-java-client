package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.generated.iett.duyurular.Duyurular;
import org.mesutormanli.ibbwsclient.generated.iett.duyurular.DuyurularSoap;
import org.mesutormanli.ibbwsclient.generated.iett.hatdurakguzergah.WebService1;
import org.mesutormanli.ibbwsclient.generated.iett.hatdurakguzergah.WebService1Soap;
import org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.PlanlananSeferSaatiSoap;
import org.mesutormanli.ibbwsclient.generated.iett.sefergerceklesme.SeferGerceklesme;
import org.mesutormanli.ibbwsclient.generated.iett.sefergerceklesme.SeferGerceklesmeSoap;
import org.mesutormanli.ibbwsclient.model.iett.*;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IettService extends BaseService {

    private DuyurularSoap duyurularSoap;
    private WebService1Soap webService1Soap;
    private PlanlananSeferSaatiSoap planlananSeferSaatiSoap;
    private SeferGerceklesmeSoap seferGerceklesmeSoap;

    public IettService() {
        this.duyurularSoap = new Duyurular().getDuyurularSoap();
        this.webService1Soap = new WebService1().getWebService1Soap();
        this.planlananSeferSaatiSoap = new org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.PlanlananSeferSaati().getPlanlananSeferSaatiSoap();
        this.seferGerceklesmeSoap = new SeferGerceklesme().getSeferGerceklesmeSoap();

    }

    public List<Duyuru> getDuyurular() {
        final String json = duyurularSoap.getDuyurularJson();
        return Arrays.asList(gson.fromJson(json, Duyuru[].class));
    }

    public List<Duyuru> getDuyurularWithHat(String hat) {
        final String json = duyurularSoap.getDuyurularJson();
        final Duyuru[] duyurular = gson.fromJson(json, Duyuru[].class);
        return Arrays.stream(duyurular)
                .filter(duyuru -> hat.equals(duyuru.getHat()))
                .collect(Collectors.toList());
    }

    public List<Durak> getDurak(String durakKodu) {
        final String json = webService1Soap.getDurakJson(durakKodu);
        return Arrays.asList(gson.fromJson(json, Durak[].class));
    }

    public List<Garaj> getGaraj() {
        final String json = webService1Soap.getGarajJson();
        return Arrays.asList(gson.fromJson(json, Garaj[].class));
    }

    public List<PlanlananSeferSaati> getPlanlananSeferSaati(String hatKodu) {
        final String json = planlananSeferSaatiSoap.getPlanlananSeferSaatiJson(hatKodu);
        return Arrays.asList(gson.fromJson(json, PlanlananSeferSaati[].class));
    }


    public List<BozukSatih> getBozukSatih(int saat) {
        final String json = seferGerceklesmeSoap.getBozukSatihJson(saat);
        return Arrays.asList(gson.fromJson(json, BozukSatih[].class));
    }

    public List<FiloAracKonum> getFiloAracKonum() {
        final String json = seferGerceklesmeSoap.getFiloAracKonumJson();
        return Arrays.asList(gson.fromJson(json, FiloAracKonum[].class));
    }

    public List<FiloAracKonum> getFiloAracKonumWithPlaka(String plaka) {
        final String json = seferGerceklesmeSoap.getFiloAracKonumJson();
        return Arrays.stream(gson.fromJson(json, FiloAracKonum[].class))
                .filter(filoAracKonum -> plaka.equals(filoAracKonum.getPlaka()))
                .collect(Collectors.toList());
    }

    public List<KazaLokasyon> getKazaLokasyon(String tarih) {
        final String json = seferGerceklesmeSoap.getKazaLokasyonJson(tarih);
        return Arrays.asList(gson.fromJson(json, KazaLokasyon[].class));
    }

}
