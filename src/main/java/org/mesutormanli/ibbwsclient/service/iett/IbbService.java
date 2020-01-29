package org.mesutormanli.ibbwsclient.service.iett;

import org.mesutormanli.ibbwsclient.generated.iett.ibb.Ibb;

public class IbbService {
    public String durakDetay(String hatKodu){
        return new Ibb().getIbbSoap().durakDetayGYY(hatKodu).toString();
    }

    public String hatServisi(String hatKodu){
        return new Ibb().getIbbSoap().hatServisiGYY(hatKodu).toString();
    }
}
