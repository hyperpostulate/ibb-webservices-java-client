package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.iett.*;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.util.List;

/**
 * IETT API'sini (durak, hat, sefer, filo ve duyuru servisleri) saran servis sınıfıdır.
 * <p>
 * Bazı uç noktalar kimlik doğrulaması gerektirir; bu uç noktalar için kullanıcı adı ve
 * şifre yapıcı metotta sağlanmalıdır. Örnekler HTTP istemcisi ve kimlik bilgileri dışında
 * durum tutmaz ve eşzamanlı kullanıma uygundur.
 */
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

    /**
     * Kimlik bilgisi olmadan yeni bir servis oluşturur.
     * <p>
     * Kullanıcı adı ve şifre null olarak kalır; yalnızca kimlik doğrulaması gerektirmeyen
     * uç noktalar kullanılabilir.
     */
    public IettService() {
        this(null, null);
    }

    /**
     * Verilen IETT kimlik bilgileriyle yeni bir servis oluşturur.
     *
     * @param username IETT kullanıcı adı
     * @param password IETT şifresi
     */
    public IettService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private void requireAuth() {
        if (username == null || password == null) {
            throw new IbbClientException("This IETT endpoint requires authentication. Provide username and password via constructor.");
        }
    }

    /**
     * Hat koduna göre durak ayrıntılarını döndürür.
     *
     * @param hatKodu sorgulanacak hat kodu
     * @return durak ayrıntılarının listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettStopDetail> getStopDetailsByLine(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_IBB, METHOD_DURAK_DETAY, username, password, "hat_kodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettStopDetail[].class);
    }

    /**
     * Hat koduna göre yön bilgisiyle birlikte durak ayrıntılarını döndürür.
     *
     * @param hatKodu sorgulanacak hat kodu
     * @return durak ayrıntılarının listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettStopDetail> getStopDetailsByLineWithDirection(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_IBB, METHOD_DURAK_DETAY_W_YON, username, password, "hat_kodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettStopDetail[].class);
    }

    /**
     * Hat koduna göre hat servis bilgilerini döndürür.
     *
     * @param hatKodu sorgulanacak hat kodu
     * @return hat servis bilgilerinin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettLineServiceInfo> getLineServiceInfo(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_IBB, METHOD_HAT_SERVISI, username, password, "hat_kodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettLineServiceInfo[].class);
    }

    /**
     * Kapı numarasına göre araç plakalarını döndürür.
     *
     * @param kapiNo sorgulanacak kapı numarası
     * @return araç plakalarının listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettVehiclePlate> getVehiclePlate(String kapiNo) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_IBB, METHOD_PLAKA_SERVISI, username, password, "KapiNo", kapiNo);
        return JsonUtils.deserializeArray(json, IettVehiclePlate[].class);
    }

    /**
     * Durak koduna göre durağın hatlarını döndürür.
     *
     * @param stopCode sorgulanacak durak kodu
     * @return hatların listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettStopLine> getStopLines(String stopCode) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_IBB, METHOD_GET_STOP_LINES, username, password, "stopCode", stopCode);
        return JsonUtils.deserializeArray(json, IettStopLine[].class);
    }

    /**
     * Hat koduna göre hat bilgilerini döndürür.
     *
     * @param hatKodu sorgulanacak hat kodu
     * @return hat bilgilerinin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettLine> getLine(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_HAT_DURAK_GUZERGAH, METHOD_GET_HAT, username, password, "HatKodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettLine[].class);
    }

    /**
     * Durak koduna göre durak bilgilerini döndürür.
     *
     * @param durakKodu sorgulanacak durak kodu
     * @return durak bilgilerinin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettStop> getStop(String durakKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_HAT_DURAK_GUZERGAH, METHOD_GET_DURAK, username, password, "DurakKodu", durakKodu);
        return JsonUtils.deserializeArray(json, IettStop[].class);
    }

    /**
     * Garaj bilgilerini döndürür.
     *
     * @return garaj bilgilerinin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettGarage> getGarages() {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_HAT_DURAK_GUZERGAH, METHOD_GET_GARAJ, username, password);
        return JsonUtils.deserializeArray(json, IettGarage[].class);
    }

    /**
     * Belirtilen tarihe ait arşivlenmiş görevleri döndürür.
     *
     * @param tarih sorgulanacak tarih
     * @return arşivlenmiş görevlerin listesi
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettArchivedTrip> getArchivedTrips(String tarih) {
        String json = executeSoapJson(IbbClientConfig.IETT_IBB360, METHOD_ARSIV_GOREV, null, null, "Tarih", tarih);
        return JsonUtils.deserializeArray(json, IettArchivedTrip[].class);
    }

    /**
     * Belirtilen tarihe ait hat yolculuklarını döndürür.
     *
     * @param tarih sorgulanacak tarih
     * @return hat yolculuklarının listesi
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettJourney> getJourneyByLine(String tarih) {
        String json = executeSoapJson(IbbClientConfig.IETT_IBB360, METHOD_YOLCULUK_HAT, null, null, "Tarih", tarih);
        return JsonUtils.deserializeArray(json, IettJourney[].class);
    }

    /**
     * Duyuruları döndürür.
     *
     * @return duyuruların listesi
     * @throws IbbClientException ağ hatalarında, hatalı HTTP durum kodlarında veya yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettAnnouncement> getAnnouncements() {
        String json = executeSoapJson(IbbClientConfig.IETT_DUYURULAR, METHOD_DUYURULAR, null, null);
        return JsonUtils.deserializeArray(json, IettAnnouncement[].class);
    }

    /**
     * Hat koduna göre planlanan sefer saatlerini döndürür.
     *
     * @param hatKodu sorgulanacak hat kodu
     * @return planlanan seferlerin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettPlannedTrip> getPlannedTripTimes(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, METHOD_PLANLANAN_SEFER, username, password, "HatKodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettPlannedTrip[].class);
    }

    /**
     * Ara durak koduna göre planlanan sefer saatlerini döndürür.
     *
     * @param durakKodu sorgulanacak durak kodu
     * @return planlanan seferlerin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettPlannedTrip> getPlannedTripTimesByIntermediateStop(String durakKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, METHOD_PLANLANAN_SEFER_ARA_DURAK, username, password, "DurakKodu", durakKodu);
        return JsonUtils.deserializeArray(json, IettPlannedTrip[].class);
    }

    /**
     * Hat koduna göre metrobüs frekans bilgilerini döndürür.
     *
     * @param hatKodu sorgulanacak hat kodu
     * @return metrobüs frekans bilgilerinin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettMetrobusFrequency> getMetrobusFrequency(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, METHOD_METROBUS_FREKANS, username, password, "HatKodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettMetrobusFrequency[].class);
    }

    /**
     * Hat koduna göre metrobüs ilk ve son sefer bilgilerini döndürür.
     *
     * @param hatKodu sorgulanacak hat kodu
     * @return metrobüs frekans bilgilerinin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettMetrobusFrequency> getMetrobusFirstLastTrip(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_PLANLANAN_SEFER_SAATI, METHOD_METROBUS_ILK_SON_SEFER, username, password, "HatKodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettMetrobusFrequency[].class);
    }

    /**
     * Filo durum bilgilerini döndürür.
     *
     * @return filo durum verilerinin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettFleetData> getFleetStatus() {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_FILO_DURUM, username, password);
        return JsonUtils.deserializeArray(json, IettFleetData[].class);
    }

    /**
     * Plana uyum bilgilerini döndürür.
     *
     * @return filo durum verilerinin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettFleetData> getPlanCompliance() {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_PLANA_UYUM, username, password);
        return JsonUtils.deserializeArray(json, IettFleetData[].class);
    }

    /**
     * Belirtilen tarihe ait kaza lokasyonlarını döndürür.
     *
     * @param tarih sorgulanacak tarih
     * @return kaza lokasyonlarının listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettAccidentLocation> getAccidentsByDate(String tarih) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_KAZA_LOKASYON, username, password, "Tarih", tarih);
        return JsonUtils.deserializeArray(json, IettAccidentLocation[].class);
    }

    /**
     * Yolcu bilgilendirme verilerini döndürür.
     *
     * @return yolcu bilgilendirme verilerinin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettPassengerInfo> getPassengerInformation() {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_YOLCU_BILGILENDIRME, username, password);
        return JsonUtils.deserializeArray(json, IettPassengerInfo[].class);
    }

    /**
     * Filo araç konumlarını döndürür.
     *
     * @return araç konumlarının listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettVehicleLocation> getFleetVehicleLocations() {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_FILO_ARAC_KONUM, username, password);
        return JsonUtils.deserializeArray(json, IettVehicleLocation[].class);
    }

    /**
     * Hat koduna göre araç konumlarını döndürür.
     *
     * @param hatKodu sorgulanacak hat kodu
     * @return araç konumlarının listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettVehicleLocation> getVehicleLocationsByLine(String hatKodu) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_SEFER_GERCEKLESME, METHOD_HAT_OTO_KONUM, username, password, "HatKodu", hatKodu);
        return JsonUtils.deserializeArray(json, IettVehicleLocation[].class);
    }

    /**
     * Kapı numarasına göre araç özelliklerini döndürür.
     *
     * @param kapiNo sorgulanacak kapı numarası
     * @return araç özelliklerinin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettVehicleFeature> getVehicleFeatures(String kapiNo) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_ARAC_OZELLIK, METHOD_ARAC_OZELLIKLERI, username, password, "KapiNo", kapiNo);
        return JsonUtils.deserializeArray(json, IettVehicleFeature[].class);
    }

    /**
     * Belirtilen yıl ve aya ait toplam yakıt tüketimini döndürür.
     *
     * @param yil sorgulanacak yıl
     * @param ay sorgulanacak ay
     * @return toplam yakıt tüketimi bilgilerinin listesi
     * @throws IbbClientException kullanıcı adı ve şifre sağlanmadıysa (bu uç nokta kimlik doğrulaması gerektirir) veya ağ hatalarında, hatalı HTTP durum kodlarında ya da yanıt ayrıştırma başarısız olduğunda
     */
    public List<IettFuelConsumption> getTotalFuelConsumption(int yil, int ay) {
        requireAuth();
        String json = executeSoapJson(IbbClientConfig.IETT_ARAC_OZELLIK, METHOD_AKAR_YAKIT, username, password, "Yil", String.valueOf(yil), "Ay", String.valueOf(ay));
        return JsonUtils.deserializeArray(json, IettFuelConsumption[].class);
    }
}
