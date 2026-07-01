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
    public static final String METRO_STATION_BY_ID = METRO_BASE + "/GetStationById";
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
    public static final String JUNCTION = "https://api.ibb.gov.tr/web/api/junction";

    // Yol Bakim
    public static final String YOL_BAKIM = "https://api.ibb.gov.tr/teas/api/open_data";

    // Hal Urun Fiyat
    private static final String HAL_URUN_FIYAT_BASE = "https://halfiyatlaripublicdata.ibb.gov.tr/api/HalManager";

    public static final String HAL_CATEGORIES = HAL_URUN_FIYAT_BASE + "/getCategories";
    public static final String HAL_MARKETS = HAL_URUN_FIYAT_BASE + "/getMarkets";
    public static final String HAL_MEASURE_TYPES = HAL_URUN_FIYAT_BASE + "/getMeasureTypes";
    public static final String HAL_PRODUCT_TYPES = HAL_URUN_FIYAT_BASE + "/getProductTypes";
    public static final String HAL_PRODUCT_PRICE_BY_DAY = HAL_URUN_FIYAT_BASE + "/getProductPricebyDay";
    public static final String HAL_PRODUCT_PRICE_BY_DAY_AND_MARKET = HAL_URUN_FIYAT_BASE + "/getProductPricebyDayAndMarket";
    public static final String HAL_PRODUCT_PRICE_BY_PRODUCT_ID = HAL_URUN_FIYAT_BASE + "/getProductPricebyProductId";
}
