package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.iett.*;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Disabled("IETT SOAP API endpoints require network access and may need authentication")
class IettServiceTest extends BaseServiceTest {

    private IettService iettService;

    @BeforeEach
    void setUp() {
        String username = System.getenv("IETT_USERNAME");
        String password = System.getenv("IETT_PASSWORD");
        if (username != null && password != null) {
            iettService = new IettService(username, password);
        } else {
            iettService = new IettService();
        }
    }

    @Test
    void getAnnouncements() {
        final List<IettAnnouncement> announcements = iettService.getAnnouncements();
        verifyResult(announcements);
    }

    @Test
    void getLine() {
        final List<IettLine> lines = iettService.getLine("35");
        assertNotNull(lines);
        System.out.println(lines);
    }

    @Test
    void getStop() {
        final List<IettStop> stops = iettService.getStop("123");
        assertNotNull(stops);
        System.out.println(stops);
    }

    @Test
    void getGarages() {
        final List<IettGarage> garages = iettService.getGarages();
        verifyResult(garages);
    }

    @Test
    void getPlannedTripTimes() {
        final List<IettPlannedTrip> trips = iettService.getPlannedTripTimes("35");
        assertNotNull(trips);
        System.out.println(trips);
    }

    @Test
    void getMetrobusFrequency() {
        final List<IettMetrobusFrequency> frequencies = iettService.getMetrobusFrequency("34");
        assertNotNull(frequencies);
        System.out.println(frequencies);
    }

    @Test
    void getFleetVehicleLocations() {
        final List<IettVehicleLocation> locations = iettService.getFleetVehicleLocations();
        assertNotNull(locations);
        System.out.println(locations);
    }

    @Test
    void getVehicleFeatures() {
        final List<IettVehicleFeature> features = iettService.getVehicleFeatures("1");
        assertNotNull(features);
        System.out.println(features);
    }

    @Test
    void getTotalFuelConsumption() {
        final List<IettFuelConsumption> consumption = iettService.getTotalFuelConsumption(2024, 1);
        assertNotNull(consumption);
        System.out.println(consumption);
    }
}
