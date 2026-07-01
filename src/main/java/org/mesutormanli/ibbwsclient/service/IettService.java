package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.iett.*;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.List;

public class IettService extends BaseService {

    private final String username;
    private final String password;

    public IettService() {
        this(null, null);
    }

    public IettService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // ========== ibb.asmx - Stop and Line Info (requires auth) ==========

    public String getStopDetailsByLine(String hatKodu) {
        String json = executeSoapJson(IbbClientConfig.IETT_IBB, "DurakDetay_GYY", username, password,
                "hat_kodu", hatKodu);
        return json;
    }

    public String getStopDetailsByLineWithDirection(String hatKodu) {
        return executeSoapJson(IbbClientConfig.IETT_IBB, "DurakDetay_GYY_wYonAdi", username, password,
                "hat_kodu", hatKodu);
    }

    public String getLineServiceInfo(String hatKodu) {
        return executeSoapJson(IbbClientConfig.IETT_IBB, "HatServisi_GYY", username, password,
                "hat_kodu", hatKodu);
    }

    public String getVehiclePlate(String kapiNo) {
        return executeSoapJson(IbbClientConfig.IETT_IBB, "IETTPlakaServisi_Json", username, password,
                "KapiNo", kapiNo);
    }

    public String getStopLines(String stopCode) {
        return executeSoapJson(IbbClientConfig.IETT_IBB, "GetStopLines_json", username, password,
                "stopCode", stopCode);
    }

    // ========== HatDurakGuzergah.asmx - Line-Stop-Route (requires auth) ==========

    public List<IettLine> getLine(String hatKodu) {
        String json = executeSoapJson(IbbClientConfig.IETT_HAT_DURAK_GUZERGAH, "GetHat_json", username, password,
                "HatKodu", hatKodu);
        return deserializeArray(json, IettLine[].class);
    }

    public List<IettStop> getStop(String durakKodu) {
        String json = executeSoapJson(IbbClientConfig.IETT_HAT_DURAK_GUZERGAH, "GetDurak_json", username, password,
                "DurakKodu", durakKodu);
        return deserializeArray(json, IettStop[].class);
    }

    public List<IettGarage> getGarages() {
        String json = executeSoapJson(IbbClientConfig.IETT_HAT_DURAK_GUZERGAH, "GetGaraj_json", username, password);
        return deserializeArray(json, IettGarage[].class);
    }

    // ========== ibb360.asmx - Journey and Trip Info (no auth needed) ==========

    public String getArchivedTrips(String tarih) {
        return executeSoapJson(IbbClientConfig.IETT_IBB360, "GetIettArsivGorev_json", null, null,
                "Tarih", tarih);
    }

    public String getJourneyByLine(String tarih) {
        return executeSoapJson(IbbClientConfig.IETT_IBB360, "GetIettYolculukHat_json", null, null,
                "Tarih", tarih);
    }

    // ========== Duyurular.asmx - Announcements (no auth needed) ==========

    public List<IettAnnouncement> getAnnouncements() {
        String json = executeSoapJson(IbbClientConfig.IETT_DUYURULAR, "GetDuyurular_json", null, null);
        return deserializeArray(json, IettAnnouncement[].class);
    }

    // ========== PlanlananSeferSaati.asmx - Planned Trip Time (requires auth) ==========

    public List<IettPlannedTrip> getPlannedTripTimes(String hatKodu) {
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, "GetPlanlananSeferSaati_json", username, password,
                "HatKodu", hatKodu);
        return deserializeArray(json, IettPlannedTrip[].class);
    }

    public List<IettPlannedTrip> getPlannedTripTimesByIntermediateStop(String durakKodu) {
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, "GetPlanlananSeferSaatiAraDurak_json", username, password,
                "DurakKodu", durakKodu);
        return deserializeArray(json, IettPlannedTrip[].class);
    }

    public List<IettMetrobusFrequency> getMetrobusFrequency(String hatKodu) {
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, "GetMetobusFrekans_json", username, password,
                "HatKodu", hatKodu);
        return deserializeArray(json, IettMetrobusFrequency[].class);
    }

    public List<IettMetrobusFrequency> getMetrobusFirstLastTrip(String hatKodu) {
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, "GetMetobusFrekansIlkSonSefer_json", username, password,
                "HatKodu", hatKodu);
        return deserializeArray(json, IettMetrobusFrequency[].class);
    }

    // ========== SeferGerceklesme.asmx - Journey Realization (requires auth) ==========

    public List<IettFleetData> getFleetStatus() {
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, "GetFiloDurum_json", username, password);
        return deserializeArray(json, IettFleetData[].class);
    }

    public List<IettFleetData> getPlanCompliance() {
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, "GetPlanaUyum_json", username, password);
        return deserializeArray(json, IettFleetData[].class);
    }

    public String getAccidentsByDate(String tarih) {
        return executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, "GetKazaLokasyon_json", username, password,
                "Tarih", tarih);
    }

    public String getPassengerInformation() {
        return executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, "GetYolcuBilgilendirme_json", username, password);
    }

    public List<IettVehicleLocation> getFleetVehicleLocations() {
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, "GetFiloAracKonum_json", username, password);
        return deserializeArray(json, IettVehicleLocation[].class);
    }

    public List<IettVehicleLocation> getVehicleLocationsByLine(String hatKodu) {
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, "GetHatOtoKonum_json", username, password,
                "HatKodu", hatKodu);
        return deserializeArray(json, IettVehicleLocation[].class);
    }

    // ========== AracOzellik.asmx - Vehicle Features (requires auth) ==========

    public List<IettVehicleFeature> getVehicleFeatures(String kapiNo) {
        String json = executeSoapJson(IbbClientConfig.IETT_ARAC_OZELLIK, "GetAracOzellikleriIETT_json", username, password,
                "KapiNo", kapiNo);
        return deserializeArray(json, IettVehicleFeature[].class);
    }

    public List<IettFuelConsumption> getTotalFuelConsumption(int yil, int ay) {
        String json = executeSoapJson(IbbClientConfig.IETT_ARAC_OZELLIK, "GetAkarYakitToplamLitre_json", username, password,
                "Yil", String.valueOf(yil), "Ay", String.valueOf(ay));
        return deserializeArray(json, IettFuelConsumption[].class);
    }
}
