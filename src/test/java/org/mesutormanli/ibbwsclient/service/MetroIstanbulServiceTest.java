package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.metro.*;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MetroIstanbulServiceTest extends BaseServiceTest {

    private MetroIstanbulService metroIstanbulService;

    @BeforeEach
    void setUp() {
        metroIstanbulService = new MetroIstanbulService();
    }

    @Test
    void getStations() {
        final List<MetroStation> stations = metroIstanbulService.getStations();
        verifyResult(stations);
    }

    @Test
    void getLines() {
        final List<MetroLine> lines = metroIstanbulService.getLines();
        verifyResult(lines);
    }

    @Test
    void getServiceStatuses() {
        final List<MetroServiceStatus> statuses = metroIstanbulService.getServiceStatuses();
        verifyResult(statuses);
    }

    @Test
    void getRailwayGroups() {
        final List<MetroRailwayGroup> groups = metroIstanbulService.getRailwayGroups();
        verifyResult(groups);
    }

    @Test
    void getTicketPrices() {
        final List<MetroTicketPrice> prices = metroIstanbulService.getTicketPrices("TR");
        verifyResult(prices);
    }

    @Test
    void getActivities() {
        final List<MetroActivity> activities = metroIstanbulService.getActivities();
        verifyResult(activities);
    }

    @Test
    void getLineProjects() {
        final List<MetroLineProject> projects = metroIstanbulService.getLineProjects();
        verifyResult(projects);
    }

    @Test
    void getFrequentlyAskedQuestions() {
        final List<MetroFaq> faqs = metroIstanbulService.getFrequentlyAskedQuestions();
        verifyResult(faqs);
    }

    @Test
    void getAnnouncements() {
        final List<MetroAnnouncement> announcements = metroIstanbulService.getAnnouncements("TR");
        verifyResult(announcements);
    }

    @Test
    void getFailureTypes() {
        final List<MetroFailureType> types = metroIstanbulService.getFailureTypes();
        verifyResult(types);
    }

    @Test
    void getTechnicalObjectTypes() {
        final List<MetroTechnicalObjectType> types = metroIstanbulService.getTechnicalObjectTypes();
        verifyResult(types);
    }

    @Test
    void getFaultyEquipments() {
        final List<MetroFaultyEquipment> equipments = metroIstanbulService.getFaultyEquipments();
        verifyResult(equipments);
    }

    @Test
    void getMaps() {
        final List<MetroMap> maps = metroIstanbulService.getMaps();
        verifyResult(maps);
    }

    @Test
    void getAddresses() {
        final List<MetroAddress> addresses = metroIstanbulService.getAddresses("TR");
        verifyResult(addresses);
    }

    @Test
    void getNews() {
        final List<MetroNews> news = metroIstanbulService.getNews("TR");
        verifyResult(news);
    }

    @Test
    void getStationBetweenTime() {
        final List<MetroStationDuration> durations = metroIstanbulService.getStationBetweenTime("{}");
        assertNotNull(durations);
        System.out.println(durations);
    }

    @Test
    void getFaultyEquipmentDetails() {
        final List<MetroFaultyEquipmentDetail> details = metroIstanbulService.getFaultyEquipmentDetails("Yürüyen Merdiven");
        verifyResult(details);
    }

    @Test
    void getFaultTypes() {
        final List<MetroFaultType> types = metroIstanbulService.getFaultTypes();
        assertNotNull(types);
        System.out.println(types);
    }

    @Test
    void getTimeTable() {
        final List<MetroTimeTable> timeTables = metroIstanbulService.getTimeTable("{}");
        assertNotNull(timeTables);
        System.out.println(timeTables);
    }
}
