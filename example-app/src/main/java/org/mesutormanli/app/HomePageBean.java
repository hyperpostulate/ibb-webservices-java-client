package org.mesutormanli.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.mesutormanli.ibbwsclient.model.iett.PlanlananSeferSaati;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class HomePageBean implements Serializable {

    @ManagedProperty("#{serviceWrapper}")
    private ServiceWrapper serviceWrapper;
    private String hatKodu;
    private Gson gson;
    private List<PlanlananSeferSaati> planlananSeferSaatiList;


    @PostConstruct
    public void init() {
        gson = new GsonBuilder().create();
    }




    public void search() {
        String planlananSeferSaatiJson = this.serviceWrapper.getPlanlananSeferSaatiService().getPlanlananSeferSaatiJson(this.hatKodu);
        Type parameterized = TypeToken.getParameterized(ArrayList.class, PlanlananSeferSaati.class).getType();
        planlananSeferSaatiList = this.gson.fromJson(planlananSeferSaatiJson, parameterized);
    }

    public ServiceWrapper getServiceWrapper() {
        return serviceWrapper;
    }

    public void setServiceWrapper(ServiceWrapper serviceWrapper) {
        this.serviceWrapper = serviceWrapper;
    }

    public String getHatKodu() {
        return hatKodu;
    }

    public void setHatKodu(String hatKodu) {
        this.hatKodu = hatKodu;
    }

    public void setPlanlananSeferSaatiList(List<PlanlananSeferSaati> planlananSeferSaatiList) {
        this.planlananSeferSaatiList = planlananSeferSaatiList;
    }

    public List<PlanlananSeferSaati> getPlanlananSeferSaatiList() {
        return planlananSeferSaatiList;
    }
}
