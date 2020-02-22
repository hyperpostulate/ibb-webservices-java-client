package org.mesutormanli.app;

import org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.PlanlananSeferSaati;
import org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati.PlanlananSeferSaatiSoap;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

@ManagedBean(name = "serviceWrapper")
@RequestScoped
public class ServiceWrapper  implements Serializable {


    public PlanlananSeferSaatiSoap getPlanlananSeferSaatiService() {
        URL url = null;
        try {
            url = new URL("https://api.ibb.gov.tr/iett/UlasimAnaVeri/PlanlananSeferSaati.asmx?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        PlanlananSeferSaati planlananSeferSaati = new PlanlananSeferSaati(url);
        return  planlananSeferSaati.getPlanlananSeferSaatiSoap();
    }

}
