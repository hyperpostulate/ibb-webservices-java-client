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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IettService extends BaseService {

    private DuyurularSoap duyurularSoap;
    private WebService1Soap hatDurakGuzergahSoap;
    private PlanlananSeferSaatiSoap planlananSeferSaatiSoap;
    private SeferGerceklesmeSoap seferGerceklesmeSoap;
    private URL duyurularWsdlURL;
    private URL hatDurakGuzergahWsdlURL;
    private URL planlananSeferSaatiWsdlURL;
    private URL seferGerceklesmerWsdlURL;

    public IettService() {
        configureWsdlURLs();
        configureSoapWebServices();
    }

    private void configureWsdlURLs() {
        try {
            this.duyurularWsdlURL = new URL("file:src/main/resources/Duyurular.wsdl");
            this.hatDurakGuzergahWsdlURL = new URL("file:src/main/resources/HatDurakGuzergah.wsdl");
            this.planlananSeferSaatiWsdlURL = new URL("file:src/main/resources/PlanlananSeferSaati.wsdl");
            this.seferGerceklesmerWsdlURL = new URL("file:src/main/resources/SeferGerceklesme.wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private void configureSoapWebServices() {
        this.duyurularSoap = new Duyurular(this.duyurularWsdlURL).getDuyurularSoap();
        this.hatDurakGuzergahSoap = new WebService1(this.hatDurakGuzergahWsdlURL).getWebService1Soap();
        this.planlananSeferSaatiSoap = new org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.PlanlananSeferSaati(this.planlananSeferSaatiWsdlURL).getPlanlananSeferSaatiSoap();
        this.seferGerceklesmeSoap = new SeferGerceklesme(this.seferGerceklesmerWsdlURL).getSeferGerceklesmeSoap();
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
        final String json = hatDurakGuzergahSoap.getDurakJson("");
        return Arrays.asList(gson.fromJson(json, Durak[].class));
    }

    public List<Durak> getDurakWithDurakKodu(String durak) {
        final String json = hatDurakGuzergahSoap.getDurakJson(durak);
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
        final String json = hatDurakGuzergahSoap.getGarajJson();
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

    public List<FiloAracKonum> getFiloAracKonum() {
        final String json = seferGerceklesmeSoap.getFiloAracKonumJson();
        return Arrays.asList(gson.fromJson(json, FiloAracKonum[].class));
    }

    public List<FiloAracKonum> getFiloAracKonumWithPlaka(String plaka) {
        return getFiloAracKonum().stream()
                .filter(filoAracKonum -> plaka.equals(filoAracKonum.getPlaka()))
                .collect(Collectors.toList());
    }

    public List<KazaLokasyon> getKazaLokasyon(String tarih) {
        final String json = seferGerceklesmeSoap.getKazaLokasyonJson(tarih);
        return Arrays.asList(gson.fromJson(json, KazaLokasyon[].class));
    }

}
