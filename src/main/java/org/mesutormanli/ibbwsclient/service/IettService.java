package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.generated.iett.aracozellik.AracOzellik;
import org.mesutormanli.ibbwsclient.generated.iett.aracozellik.AracOzellikSoap;
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

public class IettService extends BaseService {

    private DuyurularSoap duyurularSoap;
    private WebService1Soap hatDurakGuzergahSoap;
    private PlanlananSeferSaatiSoap planlananSeferSaatiSoap;
    private SeferGerceklesmeSoap seferGerceklesmeSoap;
    private AracOzellikSoap aracOzellikSoap;

    private URL duyurularWsdlURL;
    private URL hatDurakGuzergahWsdlURL;
    private URL planlananSeferSaatiWsdlURL;
    private URL seferGerceklesmerWsdlURL;
    private URL aracOzellikWsdlURL;

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
            this.aracOzellikWsdlURL = new URL("file:src/main/resources/AracOzellik.wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private void configureSoapWebServices() {
        this.duyurularSoap = new Duyurular(this.duyurularWsdlURL).getDuyurularSoap();
        this.hatDurakGuzergahSoap = new WebService1(this.hatDurakGuzergahWsdlURL).getWebService1Soap();
        this.planlananSeferSaatiSoap = new org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.PlanlananSeferSaati(this.planlananSeferSaatiWsdlURL).getPlanlananSeferSaatiSoap();
        this.seferGerceklesmeSoap = new SeferGerceklesme(this.seferGerceklesmerWsdlURL).getSeferGerceklesmeSoap();
        this.aracOzellikSoap = new AracOzellik(this.aracOzellikWsdlURL).getAracOzellikSoap();
    }

    public List<Duyuru> getAllDuyurular() {
        final String json = duyurularSoap.getDuyurularJson();
        return Arrays.asList(gson.fromJson(json, Duyuru[].class));
    }

    public List<Durak> getAllDurak() {
        final String json = hatDurakGuzergahSoap.getDurakJson("");
        return Arrays.asList(gson.fromJson(json, Durak[].class));
    }

    public List<Durak> getDurakWithDurakKodu(String durak) {
        final String json = hatDurakGuzergahSoap.getDurakJson(durak);
        return Arrays.asList(gson.fromJson(json, Durak[].class));
    }

    public List<Garaj> getAllGaraj() {
        final String json = hatDurakGuzergahSoap.getGarajJson();
        return Arrays.asList(gson.fromJson(json, Garaj[].class));
    }

    public List<PlanlananSeferSaati> getPlanlananSeferSaatiWithHat(String hatKodu) {
        final String json = planlananSeferSaatiSoap.getPlanlananSeferSaatiJson(hatKodu);
        return Arrays.asList(gson.fromJson(json, PlanlananSeferSaati[].class));
    }

    public List<FiloAracKonum> getFiloAracKonum() {
        final String json = seferGerceklesmeSoap.getFiloAracKonumJson();
        return Arrays.asList(gson.fromJson(json, FiloAracKonum[].class));
    }

    public List<KazaLokasyon> getKazaLokasyon(String tarih) {
        final String json = seferGerceklesmeSoap.getKazaLokasyonJson(tarih);
        return Arrays.asList(gson.fromJson(json, KazaLokasyon[].class));
    }

    public List<AkaryakitToplamLitre> getAkaryakitToplamLitre(int yil, int ay) {
        final String json = aracOzellikSoap.getAkarYakitToplamLitreJson(yil, ay);
        return Arrays.asList(gson.fromJson(json, AkaryakitToplamLitre[].class));
    }

}
