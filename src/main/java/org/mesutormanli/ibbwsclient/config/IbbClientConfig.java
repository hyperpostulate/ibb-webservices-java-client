package org.mesutormanli.ibbwsclient.config;

public final class IbbClientConfig {

    private IbbClientConfig() {
    }

    // Metro Istanbul
    private static final String METRO_BASE = "https://api.ibb.gov.tr/MetroIstanbul/api/MetroMobile/V2";

    public static final String METRO_STATIONS = METRO_BASE + "/GetStations";
    public static final String METRO_LINES = METRO_BASE + "/GetLines";
    public static final String METRO_SERVICE_STATUSES = METRO_BASE + "/GetServiceStatuses";
    public static final String METRO_RAILWAY_GROUPS = METRO_BASE + "/GetRailwayGroups";
    public static final String METRO_DIRECTION_BY_ID = METRO_BASE + "/GetDirectionById";
    public static final String METRO_DIRECTIONS_BY_LINE_AND_STATION = METRO_BASE + "/GetDirectionsByLineIdAndStationId";
    public static final String METRO_STATIONS_BY_LINE_ID = METRO_BASE + "/GetStationById";
    public static final String METRO_TICKET_PRICE = METRO_BASE + "/GetTicketPrice";
    public static final String METRO_ACTIVITIES = METRO_BASE + "/GetActivities";
    public static final String METRO_LINE_PROJECTS = METRO_BASE + "/GetLineProjects";
    public static final String METRO_FAQ = METRO_BASE + "/FrequentlyAskedQuestions";
    public static final String METRO_ANNOUNCEMENTS = METRO_BASE + "/GetAnnouncements";
    public static final String METRO_FAILURE_TYPES = METRO_BASE + "/GetFailureTypes";
    public static final String METRO_TECHNICAL_OBJECT_TYPES = METRO_BASE + "/GetTechnicalObjectTypes";
    public static final String METRO_FAULTY_EQUIPMENTS = METRO_BASE + "/GetFaultyEquipments";
    public static final String METRO_MAPS = METRO_BASE + "/GetMaps";
    public static final String METRO_ADDRESSES = METRO_BASE + "/GetAddresses";
    public static final String METRO_NEWS = METRO_BASE + "/GetNews";
    public static final String METRO_STATION_BETWEEN_TIME = METRO_BASE + "/GetStationBetweenTime";
    public static final String METRO_FAULTY_EQUIPMENT_DETAILS = METRO_BASE + "/GetFaultyEquipmentDetails";
    public static final String METRO_FAILURE_TYPES_ALT = METRO_BASE + "/GetFailuresTypes";
    public static final String METRO_TIME_TABLE = METRO_BASE + "/GetTimeTable";

    // Air Quality
    private static final String AIR_QUALITY_BASE = "https://api.ibb.gov.tr/havakalitesi/OpenDataPortalHandler";

    public static final String AQI_STATIONS = AIR_QUALITY_BASE + "/GetAQIStations";
    public static final String AQI_BY_STATION = AIR_QUALITY_BASE + "/GetAQIByStationId";

    // Traffic
    private static final String TRAFIK_BASE = "https://api.ibb.gov.tr/tkmservices/api/TrafficData/v1";

    public static final String TRAFFIC_INDEX_HISTORY = TRAFIK_BASE + "/TrafficIndexHistory";

    // ISBIKE
    private static final String ISBIKE_BASE = "https://kurumsalapi.ispark.istanbul/DebtApi/bike";

    public static final String ISBIKE_ALL_STATION_STATUS = ISBIKE_BASE + "/GetAllStationStatus";
    public static final String ISBIKE_STATION_STATUS = ISBIKE_BASE + "/GetStationStatus";

    // ISPARK
    private static final String ISPARK_BASE = "https://api.ibb.gov.tr/ispark";

    public static final String ISPARK_PARK = ISPARK_BASE + "/Park";
    public static final String ISPARK_PARK_DETAY = ISPARK_BASE + "/ParkDetay";

    // Sinyalize Kavsak
    private static final String JUNCTION_BASE = "https://api.ibb.gov.tr/web/api/junction";
    public static final String JUNCTION = JUNCTION_BASE;

    // Yol Bakim
    private static final String YOL_BAKIM_BASE = "https://api.ibb.gov.tr/teas/api/open_data";
    public static final String YOL_BAKIM = YOL_BAKIM_BASE;

    // Hal Urun Fiyat
    private static final String HAL_URUN_FIYAT_BASE = "https://halfiyatlaripublicdata.ibb.gov.tr/api/HalManager";

    public static final String HAL_CATEGORIES = HAL_URUN_FIYAT_BASE + "/getCategories";
    public static final String HAL_MARKETS = HAL_URUN_FIYAT_BASE + "/getMarkets";
    public static final String HAL_MEASURE_TYPES = HAL_URUN_FIYAT_BASE + "/getMeasureTypes";
    public static final String HAL_PRODUCT_TYPES = HAL_URUN_FIYAT_BASE + "/getProductTypes";
    public static final String HAL_PRODUCT_PRICE_BY_DAY = HAL_URUN_FIYAT_BASE + "/getProductPricebyDay";
    public static final String HAL_PRODUCT_PRICE_BY_DAY_AND_MARKET = HAL_URUN_FIYAT_BASE + "/getProductPricebyDayAndMarket";
    public static final String HAL_PRODUCT_PRICE_BY_PRODUCT_ID = HAL_URUN_FIYAT_BASE + "/getProductPricebyProductId";

    // IETT
    private static final String IETT_BASE = "https://api.ibb.gov.tr/iett";

    // IETT Stop and Line Info (ibb.asmx)
    public static final String IETT_IBB = IETT_BASE + "/ibb/ibb.asmx";

    // IETT Line-Stop-Route (HatDurakGuzergah.asmx)
    public static final String IETT_HAT_DURAK_GUZERGAH = IETT_BASE + "/UlasimAnaVeri/HatDurakGuzergah.asmx";

    // IETT Journey and Trip Info (ibb360.asmx)
    public static final String IETT_IBB360 = IETT_BASE + "/ibb/ibb360.asmx";

    // IETT Announcements (Duyurular.asmx)
    public static final String IETT_DUYURULAR = IETT_BASE + "/UlasimDinamikVeri/Duyurular.asmx";

    // IETT Planned Trip Time (PlanlananSeferSaati.asmx)
    public static final String IETT_PLANLANAN_SEFER_SAATI = IETT_BASE + "/UlasimAnaVeri/PlanlananSeferSaati.asmx";

    // IETT Journey Realization (SeferGerceklesme.asmx)
    public static final String IETT_SEFER_GERCEKLESME = IETT_BASE + "/FiloDurum/SeferGerceklesme.asmx";

    // IETT Vehicle Features (AracOzellik.asmx)
    public static final String IETT_ARAC_OZELLIK = IETT_BASE + "/AracAnaVeri/AracOzellik.asmx";
}
