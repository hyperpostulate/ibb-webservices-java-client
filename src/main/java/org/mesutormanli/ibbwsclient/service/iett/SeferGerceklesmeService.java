package org.mesutormanli.ibbwsclient.service.iett;

import org.mesutormanli.ibbwsclient.generated.iett.sefergerceklesme.SeferGerceklesme;

public class SeferGerceklesmeService {

    public String getBozukSatih(int saat) {
        return new SeferGerceklesme().getSeferGerceklesmeSoap().getBozukSatihJson(saat);
    }

    public String getFiloAracKonum() {
        return new SeferGerceklesme().getSeferGerceklesmeSoap().getFiloAracKonumJson();
    }

    public String getKazaLokasyon(String tarih) {
        return new SeferGerceklesme().getSeferGerceklesmeSoap().getKazaLokasyonJson(tarih);
    }
}
