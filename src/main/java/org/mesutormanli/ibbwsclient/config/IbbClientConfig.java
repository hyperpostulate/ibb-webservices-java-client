package org.mesutormanli.ibbwsclient.config;

/**
 * IBB açık veri API'lerinin tüm uç nokta (URL) adreslerini sabitler halinde merkezileştirir.
 * <p>
 * Yeni bir uç nokta eklenirken adresi burada tanımlanmalıdır; servis sınıflarında
 * satır içi (inline) URL yazılmamalıdır.
 */
public final class IbbClientConfig {

    private IbbClientConfig() {
    }

    // Metro Istanbul
    private static final String METRO_BASE = "https://api.ibb.gov.tr/MetroIstanbul/api/MetroMobile/V2";

    /**
     * Metro İstanbul API'si istasyon listesi uç noktası.
     */
    public static final String METRO_STATIONS = METRO_BASE + "/GetStations";
    /**
     * Metro İstanbul API'si hat listesi uç noktası.
     */
    public static final String METRO_LINES = METRO_BASE + "/GetLines";
    /**
     * Metro İstanbul API'si servis durumları uç noktası.
     */
    public static final String METRO_SERVICE_STATUSES = METRO_BASE + "/GetServiceStatuses";
    /**
     * Metro İstanbul API'si ray hattı grupları uç noktası.
     */
    public static final String METRO_RAILWAY_GROUPS = METRO_BASE + "/GetRailwayGroups";
    /**
     * Metro İstanbul API'si kimliğe göre yön bilgisi uç noktası.
     */
    public static final String METRO_DIRECTION_BY_ID = METRO_BASE + "/GetDirectionById";
    /**
     * Metro İstanbul API'si hat ve istasyona göre yönler uç noktası.
     */
    public static final String METRO_DIRECTIONS_BY_LINE_AND_STATION = METRO_BASE + "/GetDirectionsByLineIdAndStationId";
    /**
     * Metro İstanbul API'si hat kimliğine göre istasyonlar uç noktası.
     */
    public static final String METRO_STATIONS_BY_LINE_ID = METRO_BASE + "/GetStationById";
    /**
     * Metro İstanbul API'si bilet fiyatı uç noktası.
     */
    public static final String METRO_TICKET_PRICE = METRO_BASE + "/GetTicketPrice";
    /**
     * Metro İstanbul API'si etkinlikler uç noktası.
     */
    public static final String METRO_ACTIVITIES = METRO_BASE + "/GetActivities";
    /**
     * Metro İstanbul API'si hat projeleri uç noktası.
     */
    public static final String METRO_LINE_PROJECTS = METRO_BASE + "/GetLineProjects";
    /**
     * Metro İstanbul API'si sıkça sorulan sorular uç noktası.
     */
    public static final String METRO_FAQ = METRO_BASE + "/FrequentlyAskedQuestions";
    /**
     * Metro İstanbul API'si duyurular uç noktası.
     */
    public static final String METRO_ANNOUNCEMENTS = METRO_BASE + "/GetAnnouncements";
    /**
     * Metro İstanbul API'si arıza türleri uç noktası.
     */
    public static final String METRO_FAILURE_TYPES = METRO_BASE + "/GetFailureTypes";
    /**
     * Metro İstanbul API'si teknik nesne türleri uç noktası.
     */
    public static final String METRO_TECHNICAL_OBJECT_TYPES = METRO_BASE + "/GetTechnicalObjectTypes";
    /**
     * Metro İstanbul API'si arızalı ekipmanlar uç noktası.
     */
    public static final String METRO_FAULTY_EQUIPMENTS = METRO_BASE + "/GetFaultyEquipments";
    /**
     * Metro İstanbul API'si haritalar uç noktası.
     */
    public static final String METRO_MAPS = METRO_BASE + "/GetMaps";
    /**
     * Metro İstanbul API'si adresler uç noktası.
     */
    public static final String METRO_ADDRESSES = METRO_BASE + "/GetAddresses";
    /**
     * Metro İstanbul API'si haberler uç noktası.
     */
    public static final String METRO_NEWS = METRO_BASE + "/GetNews";
    /**
     * Metro İstanbul API'si istasyonlar arası süre uç noktası.
     */
    public static final String METRO_STATION_BETWEEN_TIME = METRO_BASE + "/GetStationBetweenTime";
    /**
     * Metro İstanbul API'si arızalı ekipman ayrıntıları uç noktası.
     */
    public static final String METRO_FAULTY_EQUIPMENT_DETAILS = METRO_BASE + "/GetFaultyEquipmentDetails";
    /**
     * Metro İstanbul API'si alternatif arıza türleri uç noktası.
     */
    public static final String METRO_FAILURE_TYPES_ALT = METRO_BASE + "/GetFailuresTypes";
    /**
     * Metro İstanbul API'si zaman çizelgesi uç noktası.
     */
    public static final String METRO_TIME_TABLE = METRO_BASE + "/GetTimeTable";

    // Air Quality
    private static final String AIR_QUALITY_BASE = "https://api.ibb.gov.tr/havakalitesi/OpenDataPortalHandler";

    /**
     * Hava Kalitesi API'si ölçüm istasyonları uç noktası.
     */
    public static final String AQI_STATIONS = AIR_QUALITY_BASE + "/GetAQIStations";
    /**
     * Hava Kalitesi API'si istasyon kimliğine göre ölçüm değerleri uç noktası.
     */
    public static final String AQI_BY_STATION = AIR_QUALITY_BASE + "/GetAQIByStationId";

    // Traffic
    private static final String TRAFIK_BASE = "https://api.ibb.gov.tr/tkmservices/api/TrafficData/v1";

    /**
     * Trafik API'si trafik indeksi geçmişi uç noktası.
     */
    public static final String TRAFFIC_INDEX_HISTORY = TRAFIK_BASE + "/TrafficIndexHistory";

    // ISBIKE
    private static final String ISBIKE_BASE = "https://kurumsalapi.ispark.istanbul/DebtApi/bike";

    /**
     * İSBİKE API'si tüm istasyon durumları uç noktası.
     */
    public static final String ISBIKE_ALL_STATION_STATUS = ISBIKE_BASE + "/GetAllStationStatus";
    /**
     * İSBİKE API'si tek istasyon durumu uç noktası.
     */
    public static final String ISBIKE_STATION_STATUS = ISBIKE_BASE + "/GetStationStatus";

    // ISPARK
    private static final String ISPARK_BASE = "https://api.ibb.gov.tr/ispark";

    /**
     * İSPARK API'si park listesi uç noktası.
     */
    public static final String ISPARK_PARK = ISPARK_BASE + "/Park";
    /**
     * İSPARK API'si park ayrıntısı uç noktası.
     */
    public static final String ISPARK_PARK_DETAY = ISPARK_BASE + "/ParkDetay";

    // Sinyalize Kavsak
    private static final String JUNCTION_BASE = "https://api.ibb.gov.tr/web/api/junction";
    /**
     * Sinyalize Kavşak API'si kavşak listesi uç noktası.
     */
    public static final String JUNCTION = JUNCTION_BASE;

    // Yol Bakim
    private static final String YOL_BAKIM_BASE = "https://api.ibb.gov.tr/teas/api/open_data";
    /**
     * Yol Bakım API'si yol bakım çalışmaları uç noktası.
     */
    public static final String YOL_BAKIM = YOL_BAKIM_BASE;

    // Hal Urun Fiyat
    private static final String HAL_URUN_FIYAT_BASE = "https://halfiyatlaripublicdata.ibb.gov.tr/api/HalManager";

    /**
     * Hal Ürün Fiyat API'si kategori listesi uç noktası.
     */
    public static final String HAL_CATEGORIES = HAL_URUN_FIYAT_BASE + "/getCategories";
    /**
     * Hal Ürün Fiyat API'si hal/pazar listesi uç noktası.
     */
    public static final String HAL_MARKETS = HAL_URUN_FIYAT_BASE + "/getMarkets";
    /**
     * Hal Ürün Fiyat API'si ölçü birimi listesi uç noktası.
     */
    public static final String HAL_MEASURE_TYPES = HAL_URUN_FIYAT_BASE + "/getMeasureTypes";
    /**
     * Hal Ürün Fiyat API'si ürün türü listesi uç noktası.
     */
    public static final String HAL_PRODUCT_TYPES = HAL_URUN_FIYAT_BASE + "/getProductTypes";
    /**
     * Hal Ürün Fiyat API'si güne göre ürün fiyatları uç noktası.
     */
    public static final String HAL_PRODUCT_PRICE_BY_DAY = HAL_URUN_FIYAT_BASE + "/getProductPricebyDay";
    /**
     * Hal Ürün Fiyat API'si gün ve pazara göre ürün fiyatları uç noktası.
     */
    public static final String HAL_PRODUCT_PRICE_BY_DAY_AND_MARKET = HAL_URUN_FIYAT_BASE + "/getProductPricebyDayAndMarket";
    /**
     * Hal Ürün Fiyat API'si ürün kimliğine göre ürün fiyatları uç noktası.
     */
    public static final String HAL_PRODUCT_PRICE_BY_PRODUCT_ID = HAL_URUN_FIYAT_BASE + "/getProductPricebyProductId";

    // IETT
    private static final String IETT_BASE = "https://api.ibb.gov.tr/iett";

    // IETT Stop and Line Info (ibb.asmx)
    /**
     * IETT durak ve hat bilgisi SOAP servisi uç noktası (ibb.asmx).
     */
    public static final String IETT_IBB = IETT_BASE + "/ibb/ibb.asmx";

    // IETT Line-Stop-Route (HatDurakGuzergah.asmx)
    /**
     * IETT hat-durak-güzergah SOAP servisi uç noktası (HatDurakGuzergah.asmx).
     */
    public static final String IETT_HAT_DURAK_GUZERGAH = IETT_BASE + "/UlasimAnaVeri/HatDurakGuzergah.asmx";

    // IETT Journey and Trip Info (ibb360.asmx)
    /**
     * IETT yolculuk ve sefer bilgisi SOAP servisi uç noktası (ibb360.asmx).
     */
    public static final String IETT_IBB360 = IETT_BASE + "/ibb/ibb360.asmx";

    // IETT Announcements (Duyurular.asmx)
    /**
     * IETT duyuru SOAP servisi uç noktası (Duyurular.asmx).
     */
    public static final String IETT_DUYURULAR = IETT_BASE + "/UlasimDinamikVeri/Duyurular.asmx";

    // IETT Planned Trip Time (PlanlananSeferSaati.asmx)
    /**
     * IETT planlanan sefer saati SOAP servisi uç noktası (PlanlananSeferSaati.asmx).
     */
    public static final String IETT_PLANLANAN_SEFER_SAATI = IETT_BASE + "/UlasimAnaVeri/PlanlananSeferSaati.asmx";

    // IETT Journey Realization (SeferGerceklesme.asmx)
    /**
     * IETT sefer gerçekleşme SOAP servisi uç noktası (SeferGerceklesme.asmx).
     */
    public static final String IETT_SEFER_GERCEKLESME = IETT_BASE + "/FiloDurum/SeferGerceklesme.asmx";

    // IETT Vehicle Features (AracOzellik.asmx)
    /**
     * IETT araç özellikleri SOAP servisi uç noktası (AracOzellik.asmx).
     */
    public static final String IETT_ARAC_OZELLIK = IETT_BASE + "/AracAnaVeri/AracOzellik.asmx";
}
