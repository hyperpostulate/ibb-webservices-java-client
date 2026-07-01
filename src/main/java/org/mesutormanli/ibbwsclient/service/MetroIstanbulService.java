package org.mesutormanli.ibbwsclient.service;

import com.google.gson.reflect.TypeToken;
import kong.unirest.Unirest;
import org.mesutormanli.ibbwsclient.model.metro.*;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.lang.reflect.Type;
import java.util.List;

public class MetroIstanbulService extends BaseService {

    private static final String METRO_SERVICE_BASE_URL = "https://api.ibb.gov.tr/MetroIstanbul/api/MetroMobile/V2";

    public List<MetroStation> getStations() {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetStations")
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroStation>>>() {
        }.getType();
        MetroServiceResponse<List<MetroStation>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroLine> getLines() {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetLines")
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroLine>>>() {
        }.getType();
        MetroServiceResponse<List<MetroLine>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroServiceStatus> getServiceStatuses() {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetServiceStatuses")
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroServiceStatus>>>() {
        }.getType();
        MetroServiceResponse<List<MetroServiceStatus>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroRailwayGroup> getRailwayGroups() {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetRailwayGroups")
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroRailwayGroup>>>() {
        }.getType();
        MetroServiceResponse<List<MetroRailwayGroup>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroDirection> getDirectionsByLineId(int lineId) {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetDirectionById/" + lineId)
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroDirection>>>() {
        }.getType();
        MetroServiceResponse<List<MetroDirection>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroDirection> getDirectionsByLineIdAndStationId(int lineId, int stationId) {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetDirectionsByLineIdAndStationId")
                .header("Accept", "application/json")
                .queryString("lineId", lineId)
                .queryString("stationId", stationId)
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroDirection>>>() {
        }.getType();
        MetroServiceResponse<List<MetroDirection>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroStation> getStationsByLineId(int lineId) {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetStationById/" + lineId)
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroStation>>>() {
        }.getType();
        MetroServiceResponse<List<MetroStation>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroTicketPrice> getTicketPrices(String lang) {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetTicketPrice/" + lang)
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroTicketPrice>>>() {
        }.getType();
        MetroServiceResponse<List<MetroTicketPrice>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroActivity> getActivities() {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetActivities")
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroActivity>>>() {
        }.getType();
        MetroServiceResponse<List<MetroActivity>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroLineProject> getLineProjects() {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetLineProjects")
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroLineProject>>>() {
        }.getType();
        MetroServiceResponse<List<MetroLineProject>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroFaq> getFrequentlyAskedQuestions() {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/FrequentlyAskedQuestions")
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroFaq>>>() {
        }.getType();
        MetroServiceResponse<List<MetroFaq>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroAnnouncement> getAnnouncements(String lang) {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetAnnouncements/" + lang)
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroAnnouncement>>>() {
        }.getType();
        MetroServiceResponse<List<MetroAnnouncement>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroFailureType> getFailureTypes() {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetFailureTypes")
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroFailureType>>>() {
        }.getType();
        MetroServiceResponse<List<MetroFailureType>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroTechnicalObjectType> getTechnicalObjectTypes() {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetTechnicalObjectTypes")
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroTechnicalObjectType>>>() {
        }.getType();
        MetroServiceResponse<List<MetroTechnicalObjectType>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroFaultyEquipment> getFaultyEquipments() {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetFaultyEquipments")
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroFaultyEquipment>>>() {
        }.getType();
        MetroServiceResponse<List<MetroFaultyEquipment>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroMap> getMaps() {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetMaps")
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroMap>>>() {
        }.getType();
        MetroServiceResponse<List<MetroMap>> response = gson.fromJson(json, type);
        return response.getData();
    }

    public List<MetroAddress> getAddresses(String lang) {
        final String json = Unirest.get(METRO_SERVICE_BASE_URL + "/GetAddresses/" + lang)
                .header("Accept", "application/json")
                .asString().getBody();
        Type type = new TypeToken<MetroServiceResponse<List<MetroAddress>>>() {
        }.getType();
        MetroServiceResponse<List<MetroAddress>> response = gson.fromJson(json, type);
        return response.getData();
    }
}
