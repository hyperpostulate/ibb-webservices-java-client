package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.iett.*;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.util.List;

public class IettService extends BaseService {

    private final String username;
    private final String password;

    private static final String METHOD_DURAK_DETAY = "DurakDetay_GYY";
    private static final String METHOD_DURAK_DETAY_W_YON = "DurakDetay_GYY_wYonAdi";
    private static final String METHOD_HAT_SERVISI = "HatServisi_GYY";
    private static final String METHOD_PLAKA_SERVISI = "IETTPlakaServisi_Json";
    private static final String METHOD_GET_STOP_LINES = "GetStopLines_json";
    private static final String METHOD_GET_HAT = "GetHat_json";
    private static final String METHOD_GET_DURAK = "GetDurak_json";
    private static final String METHOD_GET_GARAJ = "GetGaraj_json";
    private static final String METHOD_ARSIV_GOREV = "GetIettArsivGorev_json";
    private static final String METHOD_YOLCULUK_HAT = "GetIettYolculukHat_json";
    private static final String METHOD_DUYURULAR = "GetDuyurular_json";
    private static final String METHOD_PLANLANAN_SEFER = "GetPlanlananSeferSaati_json";
    private static final String METHOD_PLANLANAN_SEFER_ARA_DURAK = "GetPlanlananSeferSaatiAraDurak_json";
    private static final String METHOD_METROBUS_FREKANS = "GetMetobusFrekans_json";
    private static final String METHOD_METROBUS_ILK_SON_SEFER = "GetMetobusFrekansIlkSonSefer_json";
    private static final String METHOD_FILO_DURUM = "GetFiloDurum_json";
    private static final String METHOD_PLANA_UYUM = "GetPlanaUyum_json";
    private static final String METHOD_KAZA_LOKASYON = "GetKazaLokasyon_json";
    private static final String METHOD_YOLCU_BILGILENDIRME = "GetYolcuBilgilendirme_json";
    private static final String METHOD_FILO_ARAC_KONUM = "GetFiloAracKonum_json";
    private static final String METHOD_HAT_OTO_KONUM = "GetHatOtoKonum_json";
    private static final String METHOD_ARAC_OZELLIKLERI = "GetAracOzellikleriIETT_json";
    private static final String METHOD_AKAR_YAKIT = "GetAkarYakitToplamLitre_json";

    public IettService() {
        this(null, null);
    }

    public IettService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private void requireAuth() {
        if (username == null || password == null) {
            throw new IbbClientException("This IETT endpoint requires authentication. Provide username and password via constructor.");
        }
    }

    public List<IettStopDetail> getStopDetailsByLine(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_IBB, METHOD_DURAK_DETAY, username, password, "hat_kodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettStopDetail[].class);
    }

    public List<IettStopDetail> getStopDetailsByLineWithDirection(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_IBB, METHOD_DURAK_DETAY_W_YON, username, password, "hat_kodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettStopDetail[].class);
    }

    public List<IettLineServiceInfo> getLineServiceInfo(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_IBB, METHOD_HAT_SERVISI, username, password, "hat_kodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettLineServiceInfo[].class);
    }

    public List<IettVehiclePlate> getVehiclePlate(String kapiNo) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_IBB, METHOD_PLAKA_SERVISI, username, password, "KapiNo", kapiNo);
        return JsonUtils.deserializeArray(json, IettVehiclePlate[].class);
    }

    public List<IettStopLine> getStopLines(String stopCode) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_IBB, METHOD_GET_STOP_LINES, username, password, "stopCode", stopCode);
        return JsonUtils.deserializeArray(json, IettStopLine[].class);
    }

    public List<IettLine> getLine(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_HAT_DURAK_GUZERGAH, METHOD_GET_HAT, username, password, "HatKodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettLine[].class);
    }

    public List<IettStop> getStop(String durakKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_HAT_DURAK_GUZERGAH, METHOD_GET_DURAK, username, password, "DurakKodu", durakKodu);
        return JsonUtils.deserializeArray(json, IettStop[].class);
    }

    public List<IettGarage> getGarages() {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_HAT_DURAK_GUZERGAH, METHOD_GET_GARAJ, username, password);
        return JsonUtils.deserializeArray(json, IettGarage[].class);
    }

    public List<IettArchivedTrip> getArchivedTrips(String tarih) {
        String json = executeSoapJson(IbbClientConfig.IETT_IBB360, METHOD_ARSIV_GOREV, null, null, "Tarih", tarih);
        return JsonUtils.deserializeArray(json, IettArchivedTrip[].class);
    }

    public List<IettJourney> getJourneyByLine(String tarih) {
        String json = executeSoapJson(IbbClientConfig.IETT_IBB360, METHOD_YOLCULUK_HAT, null, null, "Tarih", tarih);
        return JsonUtils.deserializeArray(json, IettJourney[].class);
    }

    public List<IettAnnouncement> getAnnouncements() {
        String json = executeSoapJson(IbbClientConfig.IETT_DUYURULAR, METHOD_DUYURULAR, null, null);
        return JsonUtils.deserializeArray(json, IettAnnouncement[].class);
    }

    public List<IettPlannedTrip> getPlannedTripTimes(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, METHOD_PLANLANAN_SEFER, username, password, "HatKodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettPlannedTrip[].class);
    }

    public List<IettPlannedTrip> getPlannedTripTimesByIntermediateStop(String durakKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, METHOD_PLANLANAN_SEFER_ARA_DURAK, username, password, "DurakKodu", durakKodu);
        return JsonUtils.deserializeArray(json, IettPlannedTrip[].class);
    }

    public List<IettMetrobusFrequency> getMetrobusFrequency(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, METHOD_METROBUS_FREKANS, username, password, "HatKodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettMetrobusFrequency[].class);
    }

    public List<IettMetrobusFrequency> getMetrobusFirstLastTrip(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, METHOD_METROBUS_ILK_SON_SEFER, username, password, "HatKodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettMetrobusFrequency[].class);
    }

    public List<IettFleetData> getFleetStatus() {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_FILO_DURUM, username, password);
        return JsonUtils.deserializeArray(json, IettFleetData[].class);
    }

    public List<IettFleetData> getPlanCompliance() {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_PLANA_UYUM, username, password);
        return JsonUtils.deserializeArray(json, IettFleetData[].class);
    }

    public List<IettAccidentLocation> getAccidentsByDate(String tarih) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_KAZA_LOKASYON, username, password, "Tarih", tarih);
        return JsonUtils.deserializeArray(json, IettAccidentLocation[].class);
    }

    public List<IettPassengerInfo> getPassengerInformation() {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_YOLCU_BILGILENDIRME, username, password);
        return JsonUtils.deserializeArray(json, IettPassengerInfo[].class);
    }

    public List<IettVehicleLocation> getFleetVehicleLocations() {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_FILO_ARAC_KONUM, username, password);
        return JsonUtils.deserializeArray(json, IettVehicleLocation[].class);
    }

    public List<IettVehicleLocation> getVehicleLocationsByLine(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_HAT_OTO_KONUM, username, password, "HatKodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettVehicleLocation[].class);
    }

    public List<IettVehicleFeature> getVehicleFeatures(String kapiNo) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_ARAC_OZELLIK, METHOD_ARAC_OZELLIKLERI, username, password, "KapiNo", kapiNo);
        return JsonUtils.deserializeArray(json, IettVehicleFeature[].class);
    }

    public List<IettFuelConsumption> getTotalFuelConsumption(int yil, int ay) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_ARAC_OZELLIK, METHOD_AKAR_YAKIT, username, password, "Yil", String.valueOf(yil), "Ay", String.valueOf(ay));
        return JsonUtils.deserializeArray(json, IettFuelConsumption[].class);
    }
}
