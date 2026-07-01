package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.metro.*;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

class MetroIstanbulServiceTest extends BaseServiceTest {

    private MetroIstanbulService metroIstanbulService;

    @BeforeEach
    void setUp() {
        metroIstanbulService = new MetroIstanbulService();
    }

    @Test
    void getStations() {
        final List<MetroStation> stations = metroIstanbulService.getStations();
        printResult(stations);
    }

    @Test
    void getLines() {
        final List<MetroLine> lines = metroIstanbulService.getLines();
        printResult(lines);
    }

    @Test
    void getServiceStatuses() {
        final List<MetroServiceStatus> statuses = metroIstanbulService.getServiceStatuses();
        printResult(statuses);
    }

    @Test
    void getRailwayGroups() {
        final List<MetroRailwayGroup> groups = metroIstanbulService.getRailwayGroups();
        printResult(groups);
    }

    @Test
    void getTicketPrices() {
        final List<MetroTicketPrice> prices = metroIstanbulService.getTicketPrices("TR");
        printResult(prices);
    }

    @Test
    void getActivities() {
        final List<MetroActivity> activities = metroIstanbulService.getActivities();
        printResult(activities);
    }

    @Test
    void getLineProjects() {
        final List<MetroLineProject> projects = metroIstanbulService.getLineProjects();
        printResult(projects);
    }

    @Test
    void getFrequentlyAskedQuestions() {
        final List<MetroFaq> faqs = metroIstanbulService.getFrequentlyAskedQuestions();
        printResult(faqs);
    }

    @Test
    void getAnnouncements() {
        final List<MetroAnnouncement> announcements = metroIstanbulService.getAnnouncements("TR");
        printResult(announcements);
    }

    @Test
    void getFailureTypes() {
        final List<MetroFailureType> types = metroIstanbulService.getFailureTypes();
        printResult(types);
    }

    @Test
    void getTechnicalObjectTypes() {
        final List<MetroTechnicalObjectType> types = metroIstanbulService.getTechnicalObjectTypes();
        printResult(types);
    }

    @Test
    void getFaultyEquipments() {
        final List<MetroFaultyEquipment> equipments = metroIstanbulService.getFaultyEquipments();
        printResult(equipments);
    }

    @Test
    void getMaps() {
        final List<MetroMap> maps = metroIstanbulService.getMaps();
        printResult(maps);
    }

    @Test
    void getAddresses() {
        final List<MetroAddress> addresses = metroIstanbulService.getAddresses("TR");
        printResult(addresses);
    }

    @Test
    void getNews() {
        final List<MetroNews> news = metroIstanbulService.getNews("TR");
        printResult(news);
    }

    @Test
    void getStationBetweenTime() {
        final List<MetroStationDuration> durations = metroIstanbulService.getStationBetweenTime("{}");
        printResult(durations);
    }

    @Test
    void getFaultyEquipmentDetails() {
        final List<MetroFaultyEquipmentDetail> details = metroIstanbulService.getFaultyEquipmentDetails("Yürüyen Merdiven");
        printResult(details);
    }

    @Test
    void getFaultTypes() {
        final List<MetroFaultType> types = metroIstanbulService.getFaultTypes();
        printResult(types);
    }

    @Test
    void getTimeTable() {
        final List<MetroTimeTable> timeTables = metroIstanbulService.getTimeTable("{}");
        printResult(timeTables);
    }
}
