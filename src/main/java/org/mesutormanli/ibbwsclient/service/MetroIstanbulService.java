package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.metro.*;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.List;

public class MetroIstanbulService extends BaseService {

    public List<MetroStation> getStations() {
        String json = executeGet(IbbClientConfig.METRO_STATIONS);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroStation.class)));
    }

    public List<MetroLine> getLines() {
        String json = executeGet(IbbClientConfig.METRO_LINES);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroLine.class)));
    }

    public List<MetroServiceStatus> getServiceStatuses() {
        String json = executeGet(IbbClientConfig.METRO_SERVICE_STATUSES);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroServiceStatus.class)));
    }

    public List<MetroRailwayGroup> getRailwayGroups() {
        String json = executeGet(IbbClientConfig.METRO_RAILWAY_GROUPS);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroRailwayGroup.class)));
    }

    public List<MetroDirection> getDirectionsByLineId(int lineId) {
        String json = executeGet(IbbClientConfig.METRO_DIRECTION_BY_ID + "/" + lineId);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroDirection.class)));
    }

    public List<MetroDirection> getDirectionsByLineIdAndStationId(int lineId, int stationId) {
        String json = executeGet(IbbClientConfig.METRO_DIRECTIONS_BY_LINE_AND_STATION + "?lineId=" + lineId + "&stationId=" + stationId);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroDirection.class)));
    }

    public List<MetroStation> getStationsByLineId(int lineId) {
        String json = executeGet(IbbClientConfig.METRO_STATION_BY_ID + "/" + lineId);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroStation.class)));
    }

    public List<MetroTicketPrice> getTicketPrices(String lang) {
        String json = executeGet(IbbClientConfig.METRO_TICKET_PRICE + "/" + lang);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroTicketPrice.class)));
    }

    public List<MetroActivity> getActivities() {
        String json = executeGet(IbbClientConfig.METRO_ACTIVITIES);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroActivity.class)));
    }

    public List<MetroLineProject> getLineProjects() {
        String json = executeGet(IbbClientConfig.METRO_LINE_PROJECTS);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroLineProject.class)));
    }

    public List<MetroFaq> getFrequentlyAskedQuestions() {
        String json = executeGet(IbbClientConfig.METRO_FAQ);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroFaq.class)));
    }

    public List<MetroAnnouncement> getAnnouncements(String lang) {
        String json = executeGet(IbbClientConfig.METRO_ANNOUNCEMENTS + "/" + lang);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroAnnouncement.class)));
    }

    public List<MetroFailureType> getFailureTypes() {
        String json = executeGet(IbbClientConfig.METRO_FAILURE_TYPES);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroFailureType.class)));
    }

    public List<MetroTechnicalObjectType> getTechnicalObjectTypes() {
        String json = executeGet(IbbClientConfig.METRO_TECHNICAL_OBJECT_TYPES);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroTechnicalObjectType.class)));
    }

    public List<MetroFaultyEquipment> getFaultyEquipments() {
        String json = executeGet(IbbClientConfig.METRO_FAULTY_EQUIPMENTS);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroFaultyEquipment.class)));
    }

    public List<MetroMap> getMaps() {
        String json = executeGet(IbbClientConfig.METRO_MAPS);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroMap.class)));
    }

    public List<MetroAddress> getAddresses(String lang) {
        String json = executeGet(IbbClientConfig.METRO_ADDRESSES + "/" + lang);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroAddress.class)));
    }

    public List<MetroNews> getNews(String lang) {
        String json = executeGet(IbbClientConfig.METRO_NEWS + "/" + lang);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroNews.class)));
    }

    public List<MetroStationDuration> getStationBetweenTime(String requestBody) {
        String json = executePost(IbbClientConfig.METRO_STATION_BETWEEN_TIME, requestBody);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroStationDuration.class)));
    }

    public List<MetroFaultyEquipmentDetail> getFaultyEquipmentDetails(String equipmentGroupName) {
        String body = gson.toJson(java.util.Map.of("EquipmentGroupName", equipmentGroupName));
        String json = executePost(IbbClientConfig.METRO_FAULTY_EQUIPMENT_DETAILS, body);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroFaultyEquipmentDetail.class)));
    }

    public List<MetroFaultType> getFaultTypes() {
        String json = executeGet(IbbClientConfig.METRO_FAILURE_TYPES_ALT);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroFaultType.class)));
    }

    public List<MetroTimeTable> getTimeTable(String requestBody) {
        String json = executePost(IbbClientConfig.METRO_TIME_TABLE, requestBody);
        return extractDataOrEmpty(deserializeMetroResponse(json, createMetroListType(MetroTimeTable.class)));
    }
}
