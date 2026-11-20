# ibb-webservices-java-client

[![Java CI](https://github.com/hyperpostulate/ibb-webservices-java-client/actions/workflows/maven.yml/badge.svg)](https://github.com/hyperpostulate/ibb-webservices-java-client/actions/workflows/maven.yml)
[![License: Apache-2.0](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Java client library for Istanbul Metropolitan Municipality (IBB) open data APIs. No main class — consumed as a dependency.

**Türkçe sürüm: [README-TR.md](README-TR.md)**

---

## Table of Contents

- [Requirements](#requirements)
- [Installation](#installation)
- [Build & Test](#build--test)
- [CI/CD](#cicd)
- [Architecture](#architecture)
- [Services](#services)
- [Usage Examples](#usage-examples)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Error Handling](#error-handling)
- [License](#license)
- [Developer](#developer)
- [Contributing](#contributing)

---

## Requirements

| Requirement | Version |
|-------------|---------|
| Java | 25+ |
| Maven | 3.8+ |

---

## Installation

### Maven

```xml
<dependency>
    <groupId>org.mesutormanli</groupId>
    <artifactId>ibbwsclient</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

### Manual Build

```bash
git clone https://github.com/hyperpostulate/ibb-webservices-java-client.git
cd ibb-webservices-java-client
mvn clean install
```

---

## Build & Test

```bash
mvn clean test                    # Full build + tests
mvn clean package                 # Build + tests + package
mvn test -Dtest=MetroIstanbulServiceTest  # Single test class
mvn test -Dtest=IettServiceTest          # Single test class
```

---

## CI/CD

GitHub Actions workflow (`.github/workflows/maven.yml`):

- **Trigger**: Runs on every push
- **Environment**: Ubuntu-latest
- **JDK**: Amazon Corretto 25
- **Command**: `mvn -B package`

Disabled tests are skipped automatically since they use `@Disabled` — CI passes without them.

---

## Architecture

```
org.mesutormanli.ibbwsclient
├── config/
│   └── IbbClientConfig.java          # API URL definitions
├── exception/
│   └── IbbClientException.java       # Custom exception class
├── model/
│   ├── airquality/                   # Air quality models
│   ├── halurunfiyat/                 # Wholesale market price models
│   ├── iett/                         # IETT models
│   ├── isbike/                       # ISBIKE models
│   ├── ispark/                       # ISPARK models
│   ├── metro/                        # Metro models
│   ├── sinyalizekavsak/              # Signalized junction models
│   ├── trafik/                       # Traffic models
│   └── yolbakim/                     # Road maintenance models
├── service/
│   ├── base/
│   │   └── BaseService.java          # Base HTTP operations
│   ├── AirQualityService.java
│   ├── HalUrunFiyatService.java
│   ├── IBBTrafikService.java
│   ├── IettService.java
│   ├── IsbikeService.java
│   ├── IsparkService.java
│   ├── MetroIstanbulService.java
│   ├── SinyalizeKavsakService.java
│   └── YolBakimCalismalariService.java
└── util/
    ├── JsonUtils.java                # JSON serialization/deserialization with Gson
    └── SoapUtils.java                # SOAP envelope builder
```

### Core Components

| Component | Description |
|-----------|-------------|
| `BaseService` | Base class for all services. Provides `executeGet`, `executePost`, `executeSoapJson` methods |
| `IbbClientConfig` | Defines all API URLs as constants |
| `JsonUtils` | Gson-based JSON array/object serialization and deserialization |
| `SoapUtils` | SOAP 1.1 envelope builder and JSON extraction from XML response |
| `IbbClientException` | Custom runtime exception for library-wide error handling |

### Dependencies

| Dependency | Version | Purpose |
|------------|---------|---------|
| Unirest | 3.14.5 | HTTP client |
| Gson | 2.10.1 | JSON processing |
| SLF4J API | 2.0.13 | Logging interface |
| SLF4J Simple | 2.0.13 | Test environment logging |
| JUnit Jupiter | 5.11.0 | Test framework |

---

## Services

### MetroIstanbulService

Provides access to all metro-related data.

| Method | Description | HTTP |
|--------|-------------|------|
| `getStations()` | All stations | GET |
| `getLines()` | All lines | GET |
| `getServiceStatuses()` | Service statuses | GET |
| `getRailwayGroups()` | Railway groups | GET |
| `getDirectionsByLineId(int)` | Line directions | GET |
| `getStationsByLineId(int)` | Stations by line | GET |
| `getTicketPrices(String)` | Ticket prices | GET |
| `getActivities()` | Activities | GET |
| `getLineProjects()` | Line projects | GET |
| `getFrequentlyAskedQuestions()` | FAQ | GET |
| `getAnnouncements(String)` | Announcements | GET |
| `getFailureTypes()` | Failure types | GET |
| `getFaultyEquipments()` | Faulty equipments | GET |
| `getMaps()` | Maps | GET |
| `getAddresses(String)` | Addresses | GET |
| `getNews(String)` | News | GET |
| `getStationBetweenTime(String)` | Travel time between stations | POST |
| `getFaultyEquipmentDetails(String)` | Faulty equipment details | POST |
| `getTimeTable(String)` | Timetable | POST |

### IettService

IETT bus services. Some endpoints require authentication.

```java
// Without authentication
IettService service = new IettService();

// With authentication
IettService service = new IettService("username", "password");
```

| Method | Description | Auth |
|--------|-------------|------|
| `getStopDetailsByLine(String)` | Stop details by line | Yes |
| `getLineServiceInfo(String)` | Line service info | Yes |
| `getVehiclePlate(String)` | Vehicle plate query | Yes |
| `getStopLines(String)` | Lines at stop | Yes |
| `getLine(String)` | Line details | Yes |
| `getStop(String)` | Stop details | Yes |
| `getGarages()` | Garages | Yes |
| `getArchivedTrips(String)` | Archived trips | No |
| `getJourneyByLine(String)` | Journey info | No |
| `getAnnouncements()` | Announcements | No |
| `getPlannedTripTimes(String)` | Planned trip times | Yes |
| `getMetrobusFrequency(String)` | Metrobus frequency | Yes |
| `getFleetStatus()` | Fleet status | Yes |
| `getPlanCompliance()` | Plan compliance | Yes |
| `getAccidentsByDate(String)` | Accident locations | Yes |
| `getPassengerInformation()` | Passenger info | Yes |
| `getFleetVehicleLocations()` | Vehicle locations | Yes |
| `getVehicleFeatures(String)` | Vehicle features | Yes |
| `getTotalFuelConsumption(int, int)` | Fuel consumption | Yes |

### AirQualityService

Air quality station data.

| Method | Description |
|--------|-------------|
| `getAQIStations()` | Air quality stations |
| `getAQIByStationId(String)` | Air quality by station |

### IBBTrafikService

Traffic data.

| Method | Description |
|--------|-------------|
| `getTrafficIndexHistory(int, String)` | Traffic index history |

### IsbikeService

ISBIKE bike rental station data.

| Method | Description |
|--------|-------------|
| `getAllStationStatus()` | All station statuses |
| `getStationStatus(int)` | Single station status |

### IsparkService

ISPARK parking data.

| Method | Description |
|--------|-------------|
| `getPark()` | All parking lots |
| `getParkDetay(int)` | Parking lot details |

### HalUrunFiyatService

Wholesale market product price data.

| Method | Description |
|--------|-------------|
| `getCategories()` | Product categories |
| `getMarkets()` | Markets |
| `getMeasureTypes()` | Measure types |
| `getProductTypes()` | Product types |
| `getProductPriceByDay(LocalDate)` | Daily prices |
| `getProductPriceByDayAndMarket(LocalDate, Integer)` | Prices by market and day |
| `getProductPriceByProductId(String)` | Prices by product |

### SinyalizeKavsakService

Signalized junction data.

| Method | Description |
|--------|-------------|
| `getJunctions()` | All junctions |

### YolBakimCalismalariService

Road maintenance data.

| Method | Description |
|--------|-------------|
| `getRoadMaintenanceWorks()` | Road maintenance works |

---

## Usage Examples

### Fetching Metro Data

```java
import org.mesutormanli.ibbwsclient.service.MetroIstanbulService;

MetroIstanbulService metro = new MetroIstanbulService();

// List stations
List<MetroStation> stations = metro.getStations();
stations.forEach(s -> System.out.println(s));

// List lines
List<MetroLine> lines = metro.getLines();

// Ticket prices (Turkish)
List<MetroTicketPrice> prices = metro.getTicketPrices("tr");
```

### Fetching IETT Data (Authenticated)

```java
import org.mesutormanli.ibbwsclient.service.IettService;

IettService iett = new IettService("username", "password");

// Line details
List<IettLine> lineDetails = iett.getLine("146");

// Stop details
List<IettStop> stopDetails = iett.getStop("12345");

// Metrobus frequency
List<IettMetrobusFrequency> frequency = iett.getMetrobusFrequency("34");
```

### Querying Air Quality

```java
import org.mesutormanli.ibbwsclient.service.AirQualityService;

AirQualityService airQuality = new AirQualityService();

// List stations
List<AirQualityStation> stations = airQuality.getAQIStations();

// Air quality for specific station
List<AirQualityData> data = airQuality.getAQIByStationId("IST-1");
```

### Wholesale Market Prices

```java
import org.mesutormanli.ibbwsclient.service.HalUrunFiyatService;
import java.time.LocalDate;

HalUrunFiyatService halService = new HalUrunFiyatService();

// Categories
HalServiceResponse<ProductCategory> categories = halService.getCategories();

// Daily prices
HalServiceResponse<ProductPrice> prices = halService.getProductPriceByDay(LocalDate.now());
```

### Releasing Resources

Each service instance owns an isolated HTTP client. Release it with `close()`, e.g. via try-with-resources:

```java
import org.mesutormanli.ibbwsclient.service.MetroIstanbulService;

try (MetroIstanbulService metro = new MetroIstanbulService()) {
    List<MetroStation> stations = metro.getStations();
}
```

`BaseService.shutdown()` is deprecated: it shuts down the process-global Unirest client and may disrupt other Unirest users in the same JVM. Closing one service instance never affects other instances.

---

## API Endpoints

All URLs are defined in `config/IbbClientConfig.java`.

| Service | Base Domain |
|---------|-------------|
| Metro | `api.ibb.gov.tr/MetroIstanbul/api/MetroMobile/V2` |
| IETT (SOAP) | `api.ibb.gov.tr/iett` |
| Air Quality | `api.ibb.gov.tr/havakalitesi/OpenDataPortalHandler` |
| Traffic | `api.ibb.gov.tr/tkmservices/api/TrafficData/v1` |
| ISBIKE | `kurumsalapi.ispark.istanbul/DebtApi/bike` |
| ISPARK | `api.ibb.gov.tr/ispark` |
| Signalized Junction | `api.ibb.gov.tr/web/api/junction` |
| Road Maintenance | `api.ibb.gov.tr/teas/api/open_data` |
| Wholesale Prices | `halfiyatlaripublicdata.ibb.gov.tr/api/HalManager` |

---

## Testing

Most tests are **integration tests** that make real HTTP calls to live IBB APIs. In addition, offline unit tests (`SoapUtilsTest`, `JsonUtilsTest`, `BaseServiceHttpHandlingTest`) run against a local HTTP server and require no external network.

### Passing Tests

- `MetroIstanbulServiceTest`
- `IBBTrafikServiceTest`
- `HalUrunFiyatServiceTest`
- `SinyalizeKavsakServiceTest`

### Disabled Tests

| Test Class | Reason |
|------------|--------|
| `AirQualityServiceTest` | Live API currently unavailable |
| `IsparkServiceTest` | Live API currently unavailable |
| `IettServiceTest` | Requires auth credentials + API unavailable |
| `YolBakimCalismalariServiceTest.getRoadMaintenanceWorks()` | Blocked by WAF |
| `IsbikeServiceTest` | API host unreachable from CI runners |
| `MetroIstanbulServiceTest.getStationBetweenTime()` | Upstream returns `Success:false` (server-side error) |
| `MetroIstanbulServiceTest.getFaultTypes()` | Upstream `GetFailuresTypes` endpoint broken server-side; use `getFailureTypes()` |
| `MetroIstanbulServiceTest.getTimeTable()` | Upstream returns `Success:false` (server-side error) |

### Running Tests

```bash
# All tests
mvn test

# Single test class
mvn test -Dtest=MetroIstanbulServiceTest

# Single test method
mvn test -Dtest=MetroIstanbulServiceTest#getStations
```

### Test Helpers

`BaseServiceTest` provides helper methods for tests:

```java
protected void verifyResult(List<?> resultList) {
    assertNotNull(resultList);
    assertFalse(resultList.isEmpty());
    resultList.forEach(System.out::println);
}
```

---

## Error Handling

All HTTP, network, and parse errors throw `IbbClientException`. Typed subclasses let you branch on the failure kind:

- `IbbHttpException` — HTTP error status (4xx/5xx); exposes `getStatus()`, `getStatusText()`, `getBody()`, `getUrl()`
- `IbbNetworkException` — connection/timeout failures
- `IbbParseException` — response body could not be parsed as the expected type

```java
try {
    List<MetroStation> stations = service.getStations();
} catch (IbbHttpException e) {
    System.err.println("HTTP " + e.getStatus() + " from " + e.getUrl() + ": " + e.getBody());
} catch (IbbClientException e) {
    System.err.println("Error: " + e.getMessage());
}
```

---

## License

This project is licensed under the Apache License 2.0. See [LICENSE](LICENSE) for details.

---

## Developer

**Mesut ORMANLI**
- Email: mesutormanli@gmail.com
- GitHub: [@hyperpostulate](https://github.com/hyperpostulate)

---

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

---
