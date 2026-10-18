package org.mesutormanli.ibbwsclient.service;

import com.google.gson.reflect.TypeToken;
import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.metro.*;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/**
 * Metro İstanbul Mobil API V2 sarmalayıcısı.
 * <p>
 * Her örnek, izole bir HTTP istemcisine sahiptir ve işi bittiğinde {@link #close()} ile serbest bırakılmalıdır.
 * Örnekler eşzamanlı çağrılar için thread-safe'tir.
 */
public class MetroIstanbulService extends BaseService {

    /**
     * Bir Metro API JSON yanıtını verilen türe ayrıştırır.
     */
    private <T> MetroServiceResponse<T> deserializeMetroResponse(String json, Type type) {
        return JsonUtils.deserializeObject(json, type);
    }

    /**
     * Bir Metro yanıtından veri listesini çıkarır; boş veri yerine boş liste döndürür.
     */
    private <T> List<T> extractDataOrEmpty(MetroServiceResponse<List<T>> response) {
        if (response == null) {
            throw new IbbClientException("Metro API returned null response");
        }
        if (Boolean.FALSE.equals(response.success())) {
            throw new IbbClientException("Metro API returned failure: " + response.error());
        }
        return response.data() != null ? response.data() : Collections.emptyList();
    }

    /**
     * Liste öğeleri için parametreli bir Metro yanıt türü oluşturur.
     */
    private <T> Type createMetroListType(Class<T> elementClass) {
        return TypeToken.getParameterized(MetroServiceResponse.class,
                TypeToken.getParameterized(List.class, elementClass).getType()).getType();
    }

    /**
     * Tüm metro istasyonlarını döndürür.
     *
     * @return istasyon listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroStation> getStations() {
        String json = executeGet(IbbClientConfig.METRO_STATIONS);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroStation.class)));
    }

    /**
     * Metro hatlarını döndürür.
     *
     * @return hat listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroLine> getLines() {
        String json = executeGet(IbbClientConfig.METRO_LINES);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroLine.class)));
    }

    /**
     * Metro hizmet durumlarını döndürür.
     *
     * @return hizmet durumu listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroServiceStatus> getServiceStatuses() {
        String json = executeGet(IbbClientConfig.METRO_SERVICE_STATUSES);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroServiceStatus.class)));
    }

    /**
     * Metro demiryolu gruplarını döndürür.
     *
     * @return demiryolu grubu listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroRailwayGroup> getRailwayGroups() {
        String json = executeGet(IbbClientConfig.METRO_RAILWAY_GROUPS);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroRailwayGroup.class)));
    }

    /**
     * Verilen hat kimliğine göre yönleri döndürür.
     *
     * @param lineId hat kimliği
     * @return yön listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroDirection> getDirectionsByLineId(int lineId) {
        String json = executeGet(IbbClientConfig.METRO_DIRECTION_BY_ID + "/" + lineId);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroDirection.class)));
    }

    /**
     * Verilen hat ve istasyon kimliklerine göre yönleri döndürür.
     *
     * @param lineId hat kimliği
     * @param stationId istasyon kimliği
     * @return yön listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroDirection> getDirectionsByLineIdAndStationId(int lineId, int stationId) {
        String json = executeGet(IbbClientConfig.METRO_DIRECTIONS_BY_LINE_AND_STATION + "?lineId=" + lineId + "&stationId=" + stationId);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroDirection.class)));
    }

    /**
     * Verilen hat kimliğine göre istasyonları döndürür.
     *
     * @param lineId hat kimliği
     * @return istasyon listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroStation> getStationsByLineId(int lineId) {
        String json = executeGet(IbbClientConfig.METRO_STATIONS_BY_LINE_ID + "/" + lineId);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroStation.class)));
    }

    /**
     * Verilen dil için bilet fiyatlarını döndürür.
     *
     * @param lang yanıt dili
     * @return bilet fiyatı listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroTicketPrice> getTicketPrices(String lang) {
        String json = executeGet(IbbClientConfig.METRO_TICKET_PRICE + "/" + lang);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroTicketPrice.class)));
    }

    /**
     * Metro etkinliklerini döndürür.
     *
     * @return etkinlik listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroActivity> getActivities() {
        String json = executeGet(IbbClientConfig.METRO_ACTIVITIES);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroActivity.class)));
    }

    /**
     * Metro hat projelerini döndürür.
     *
     * @return hat projesi listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroLineProject> getLineProjects() {
        String json = executeGet(IbbClientConfig.METRO_LINE_PROJECTS);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroLineProject.class)));
    }

    /**
     * Sıkça sorulan soruları döndürür.
     *
     * @return SSS listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroFaq> getFrequentlyAskedQuestions() {
        String json = executeGet(IbbClientConfig.METRO_FAQ);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroFaq.class)));
    }

    /**
     * Verilen dil için duyuruları döndürür.
     *
     * @param lang yanıt dili
     * @return duyuru listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroAnnouncement> getAnnouncements(String lang) {
        String json = executeGet(IbbClientConfig.METRO_ANNOUNCEMENTS + "/" + lang);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroAnnouncement.class)));
    }

    /**
     * Metro arıza türlerini döndürür.
     *
     * @return arıza türü listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroFailureType> getFailureTypes() {
        String json = executeGet(IbbClientConfig.METRO_FAILURE_TYPES);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroFailureType.class)));
    }

    /**
     * Metro teknik nesne türlerini döndürür.
     *
     * @return teknik nesne türü listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroTechnicalObjectType> getTechnicalObjectTypes() {
        String json = executeGet(IbbClientConfig.METRO_TECHNICAL_OBJECT_TYPES);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroTechnicalObjectType.class)));
    }

    /**
     * Arızalı ekipmanları döndürür.
     *
     * @return arızalı ekipman listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroFaultyEquipment> getFaultyEquipments() {
        String json = executeGet(IbbClientConfig.METRO_FAULTY_EQUIPMENTS);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroFaultyEquipment.class)));
    }

    /**
     * Metro haritalarını döndürür.
     *
     * @return harita listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroMap> getMaps() {
        String json = executeGet(IbbClientConfig.METRO_MAPS);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroMap.class)));
    }

    /**
     * Verilen dil için adresleri döndürür.
     *
     * @param lang yanıt dili
     * @return adres listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroAddress> getAddresses(String lang) {
        String json = executeGet(IbbClientConfig.METRO_ADDRESSES + "/" + lang);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroAddress.class)));
    }

    /**
     * Verilen dil için haberleri döndürür.
     *
     * @param lang yanıt dili
     * @return haber listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroNews> getNews(String lang) {
        String json = executeGet(IbbClientConfig.METRO_NEWS + "/" + lang);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroNews.class)));
    }

    /**
     * İstasyonlar arası seyahat sürelerini döndürür.
     *
     * @param requestBody istek gövdesi (JSON)
     * @return istasyon süresi listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroStationDuration> getStationBetweenTime(String requestBody) {
        String json = executePost(IbbClientConfig.METRO_STATION_BETWEEN_TIME, requestBody);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroStationDuration.class)));
    }

    /**
     * Verilen ekipman grubu adına göre arızalı ekipman ayrıntılarını döndürür.
     *
     * @param equipmentGroupName ekipman grubu adı
     * @return arızalı ekipman ayrıntısı listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroFaultyEquipmentDetail> getFaultyEquipmentDetails(String equipmentGroupName) {
        String body = JsonUtils.serialize(java.util.Map.of("EquipmentGroupName", equipmentGroupName));
        String json = executePost(IbbClientConfig.METRO_FAULTY_EQUIPMENT_DETAILS, body);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroFaultyEquipmentDetail.class)));
    }

    /**
     * Metro arıza türlerini (alternatif uç nokta) döndürür.
     *
     * @return arıza türü listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroFaultType> getFaultTypes() {
        String json = executeGet(IbbClientConfig.METRO_FAILURE_TYPES_ALT);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroFaultType.class)));
    }

    /**
     * İstasyon zaman çizelgesini döndürür.
     *
     * @param requestBody istek gövdesi (JSON)
     * @return zaman çizelgesi listesi
     * @throws IbbClientException ağ hataları, HTTP hata durumları, parse hataları veya API'nin Success=false
     * döndürmesi durumunda
     */
    public List<MetroTimeTable> getTimeTable(String requestBody) {
        String json = executePost(IbbClientConfig.METRO_TIME_TABLE, requestBody);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroTimeTable.class)));
    }
}
