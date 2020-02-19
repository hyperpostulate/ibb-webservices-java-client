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

    public List<Duyuru> getAllDuyurular() {
        final String json = duyurularSoap.getDuyurularJson();
        return Arrays.asList(gson.fromJson(json, Duyuru[].class));
    }

    public List<Duyuru> getDuyurularWithHat(String hat) {
        return getAllDuyurular().stream()
                .filter(duyuru -> hat.equals(duyuru.getHat()))
                .collect(Collectors.toList());
    }

    public List<Durak> getAllDurak() {
        final String json = webService1Soap.getDurakJson("");
        return Arrays.asList(gson.fromJson(json, Durak[].class));
    }

    public List<Durak> getDurakWithDurakKodu(String durak) {
        final String json = webService1Soap.getDurakJson(durak);
        return Arrays.asList(gson.fromJson(json, Durak[].class));
    }

    public List<Durak> getDurakWithIlce(String ilce) {
        return getAllDurak()
                .stream()
                .filter(durak -> ilce.equals(durak.getIlceAdi()))
                .collect(Collectors.toList());
    }

    public List<Durak> getDurakWithYon(String yon) {
        return getAllDurak()
                .stream()
                .filter(durak -> yon.equals(durak.getYon()))
                .collect(Collectors.toList());
    }

    public List<Garaj> getAllGaraj() {
        final String json = webService1Soap.getGarajJson();
        return Arrays.asList(gson.fromJson(json, Garaj[].class));
    }

    public List<Garaj> getGarajWithGarajAdi(String garajAdi) {
        return getAllGaraj().stream()
                .filter(garaj -> garajAdi.equals(garaj.getGarajAdi()))
                .collect(Collectors.toList());
    }

    public List<PlanlananSeferSaati> getPlanlananSeferSaatiWithHat(String hatKodu) {
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
