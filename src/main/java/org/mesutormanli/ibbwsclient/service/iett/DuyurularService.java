package org.mesutormanli.ibbwsclient.service.iett;

import org.mesutormanli.ibbwsclient.generated.iett.duyurular.Duyurular;

public class DuyurularService {
    public String getDuyurular() {
        return new Duyurular().getDuyurularSoap().getDuyurularJson();
    }
}
