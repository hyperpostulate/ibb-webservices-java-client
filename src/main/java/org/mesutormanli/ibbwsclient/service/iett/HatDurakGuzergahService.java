package org.mesutormanli.ibbwsclient.service.iett;

import org.mesutormanli.ibbwsclient.generated.iett.hatdurakguzergah.WebService1;

public class HatDurakGuzergahService {
    public String getDurak(String durakKodu){
        return new WebService1().getWebService1Soap().getDurakJson(durakKodu);
    }

    public String getGaraj(){
        return new WebService1().getWebService1Soap().getGarajJson();
    }
}
