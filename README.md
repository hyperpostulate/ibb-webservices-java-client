# ibb-webservices-java-client

[![Java CI](https://github.com/hyperpostulate/ibb-webservices-java-client/actions/workflows/maven.yml/badge.svg)](https://github.com/hyperpostulate/ibb-webservices-java-client/actions/workflows/maven.yml)
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

Java client library for Istanbul Metropolitan Municipality (IBB) open data APIs. No main class — consumed as a dependency.

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

```java
import org.mesutormanli.ibbwsclient.service.base.BaseService;

// Release Unirest resources on application shutdown
BaseService.shutdown();
```

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

All tests are **integration tests** that make real HTTP calls to live IBB APIs. No mocking is used.

### Passing Tests

- `MetroIstanbulServiceTest`
- `IsbikeServiceTest`
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

### Running Tests

```bash
# All tests
mvn test

# Single test class
mvn test -Dtest=MetroIstanbulServiceTest

# Single test method
mvn test -Dtest=MetroIstanbulServiceTest#testGetStations
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

All HTTP and parse errors throw `IbbClientException`:

```java
try {
    List<MetroStation> stations = service.getStations();
} catch (IbbClientException e) {
    System.err.println("Error: " + e.getMessage());
}
```

---

## License

This project is licensed under the GNU General Public License v3.0. See [LICENSE](LICENSE) for details.

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

---
---

# ibb-webservices-java-client

[![Java CI](https://github.com/hyperpostulate/ibb-webservices-java-client/actions/workflows/maven.yml/badge.svg)](https://github.com/hyperpostulate/ibb-webservices-java-client/actions/workflows/maven.yml)
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

İstanbul Büyükşehir Belediyesi (İBB) açık veri API'leri için Java istemci kütüphanesi. Ana sınıf içermez — bağımlılık olarak tüketilir.

---

## İçindekiler

- [Gereksinimler](#gereksinimler)
- [Kurulum](#kurulum)
- [Derleme ve Test](#derleme-ve-test)
- [CI/CD](#cicd)
- [Mimari](#mimari)
- [Servisler](#servisler)
- [Kullanım Örnekleri](#kullanım-örnekleri)
- [API Uç Noktaları](#api-uç-noktaları)
- [Testler](#testler)
- [Hata Yönetimi](#hata-yönetimi)
- [Lisans](#lisans)
- [Geliştirici](#geliştirici)
- [Katkıda Bulunma](#katkıda-bulunma)

---

## Gereksinimler

| Gereksinim | Sürüm |
|------------|-------|
| Java | 25+ |
| Maven | 3.8+ |

---

## Kurulum

### Maven

```xml
<dependency>
    <groupId>org.mesutormanli</groupId>
    <artifactId>ibbwsclient</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

### Manuel Derleme

```bash
git clone https://github.com/hyperpostulate/ibb-webservices-java-client.git
cd ibb-webservices-java-client
mvn clean install
```

---

## Derleme ve Test

```bash
mvn clean test                    # Tam derleme + testler
mvn clean package                 # Derleme + test + paketleme
mvn test -Dtest=MetroIstanbulServiceTest  # Tek test sınıfı
mvn test -Dtest=IettServiceTest          # Tek test sınıfı
```

---

## CI/CD

GitHub Actions iş akışı (`.github/workflows/maven.yml`):

- **Tetikleme**: Her push'ta çalışır
- **Ortam**: Ubuntu-latest
- **JDK**: Amazon Corretto 25
- **Komut**: `mvn -B package`

Devre dışı bırakılan testler `@Disabled` kullanıldığı için otomatik olarak atlanır — CI onlarsız geçer.

---

## Mimari

```
org.mesutormanli.ibbwsclient
├── config/
│   └── IbbClientConfig.java          # API URL tanımları
├── exception/
│   └── IbbClientException.java       # Özel hata sınıfı
├── model/
│   ├── airquality/                   # Hava kalitesi modelleri
│   ├── halurunfiyat/                 # Hal ürün fiyat modelleri
│   ├── iett/                         # İETT modelleri
│   ├── isbike/                       # İSBİKE modelleri
│   ├── ispark/                       # İSPARK modelleri
│   ├── metro/                        # Metro modelleri
│   ├── sinyalizekavsak/              # Sinyalize kavşak modelleri
│   ├── trafik/                       # Trafik modelleri
│   └── yolbakim/                     # Yol bakım modelleri
├── service/
│   ├── base/
│   │   └── BaseService.java          # Temel HTTP işlemleri
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
    ├── JsonUtils.java                # Gson ile JSON işleme
    └── SoapUtils.java                # SOAP zarfı oluşturma
```

### Temel Bileşenler

| Bileşen | Açıklama |
|---------|----------|
| `BaseService` | Tüm servislerin atası. `executeGet`, `executePost`, `executeSoapJson` yöntemleri sağlar |
| `IbbClientConfig` | Tüm API URL'lerini sabit olarak tanımlar |
| `JsonUtils` | Gson tabanlı JSON dizi/nesne serileştirme ve çözümleme |
| `SoapUtils` | SOAP 1.1 zarfı oluşturma ve XML yanıtından JSON çıkarma |
| `IbbClientException` | Kütüphane içi hata yönetimi için özel runtime exception |

### Bağımlılıklar

| Bağımlılık | Sürüm | Amaç |
|------------|-------|------|
| Unirest | 3.14.5 | HTTP istemcisi |
| Gson | 2.10.1 | JSON işleme |
| SLF4J API | 2.0.13 | Loglama arayüzü |
| SLF4J Simple | 2.0.13 | Test ortamı loglaması |
| JUnit Jupiter | 5.11.0 | Test framework |

---

## Servisler

### MetroIstanbulService

Metro ile ilgili tüm verilere erişim sağlar.

| Metot | Açıklama | HTTP |
|-------|----------|------|
| `getStations()` | Tüm istasyonlar | GET |
| `getLines()` | Tüm hatlar | GET |
| `getServiceStatuses()` | Servis durumları | GET |
| `getRailwayGroups()` | Demiryolu grupları | GET |
| `getDirectionsByLineId(int)` | Hat yönleri | GET |
| `getStationsByLineId(int)` | Hattaki istasyonlar | GET |
| `getTicketPrices(String)` | Bilet fiyatları | GET |
| `getActivities()` | Etkinlikler | GET |
| `getLineProjects()` | Hat projeleri | GET |
| `getFrequentlyAskedQuestions()` | SSS | GET |
| `getAnnouncements(String)` | Duyurular | GET |
| `getFailureTypes()` | Arıza türleri | GET |
| `getFaultyEquipments()` | Arızalı ekipmanlar | GET |
| `getMaps()` | Haritalar | GET |
| `getAddresses(String)` | Adresler | GET |
| `getNews(String)` | Haberler | GET |
| `getStationBetweenTime(String)` | İstasyonlar arası süre | POST |
| `getFaultyEquipmentDetails(String)` | Arızalı ekipman detayları | POST |
| `getTimeTable(String)` | Sefer saatleri | POST |

### IettService

İETT otobüs hizmetleri. Bazı uç noktalar kimlik doğrulaması gerektirir.

```java
// Kimlik doğrulamasız
IettService service = new IettService();

// Kimlik doğrulamalı
IettService service = new IettService("kullanici", "sifre");
```

| Metot | Açıklama | Auth |
|-------|----------|------|
| `getStopDetailsByLine(String)` | Hat durak detayları | Evet |
| `getLineServiceInfo(String)` | Hat servis bilgisi | Evet |
| `getVehiclePlate(String)` | Araç plaka sorgulama | Evet |
| `getStopLines(String)` | Duraktaki hatlar | Evet |
| `getLine(String)` | Hat detayı | Evet |
| `getStop(String)` | Durak detayı | Evet |
| `getGarages()` | Garajlar | Evet |
| `getArchivedTrips(String)` | Arşiv görevleri | Hayır |
| `getJourneyByLine(String)` | Yolculuk bilgisi | Hayır |
| `getAnnouncements()` | Duyurular | Hayır |
| `getPlannedTripTimes(String)` | Planlanan sefer saatleri | Evet |
| `getMetrobusFrequency(String)` | Metrobüs sıklığı | Evet |
| `getFleetStatus()` | Filo durumu | Evet |
| `getPlanCompliance()` | Plana uyum | Evet |
| `getAccidentsByDate(String)` | Kaza lokasyonları | Evet |
| `getPassengerInformation()` | Yolcu bilgilendirme | Evet |
| `getFleetVehicleLocations()` | Araç konumları | Evet |
| `getVehicleFeatures(String)` | Araç özellikleri | Evet |
| `getTotalFuelConsumption(int, int)` | Yakıt tüketimi | Evet |

### AirQualityService

Hava kalitesi istasyonları ve verileri.

| Metot | Açıklama |
|-------|----------|
| `getAQIStations()` | Hava kalitesi istasyonları |
| `getAQIByStationId(String)` | İstasyona göre hava kalitesi |

### IBBTrafikService

Trafik verileri.

| Metot | Açıklama |
|-------|----------|
| `getTrafficIndexHistory(int, String)` | Trafik indeksi geçmişi |

### IsbikeService

İSBAKİS bisiklet kiralama istasyonları.

| Metot | Açıklama |
|-------|----------|
| `getAllStationStatus()` | Tüm istasyon durumları |
| `getStationStatus(int)` | Tek istasyon durumu |

### IsparkService

İSPARK otopark verileri.

| Metot | Açıklama |
|-------|----------|
| `getPark()` | Tüm otoparklar |
| `getParkDetay(int)` | Otopark detayı |

### HalUrunFiyatService

Hal ürün fiyat verileri.

| Metot | Açıklama |
|-------|----------|
| `getCategories()` | Ürün kategorileri |
| `getMarkets()` | Pazarlar |
| `getMeasureTypes()` | Ölçü birimleri |
| `getProductTypes()` | Ürün türleri |
| `getProductPriceByDay(LocalDate)` | Günlük fiyatlar |
| `getProductPriceByDayAndMarket(LocalDate, Integer)` | Pazar ve günlü fiyatlar |
| `getProductPriceByProductId(String)` | Ürüne göre fiyatlar |

### SinyalizeKavsakService

Sinyalize kavşak verileri.

| Metot | Açıklama |
|-------|----------|
| `getJunctions()` | Tüm kavşaklar |

### YolBakimCalismalariService

Yol bakım çalışma verileri.

| Metot | Açıklama |
|-------|----------|
| `getRoadMaintenanceWorks()` | Yol bakım çalışmaları |

---

## Kullanım Örnekleri

### Metro Verisi Çekme

```java
import org.mesutormanli.ibbwsclient.service.MetroIstanbulService;

MetroIstanbulService metro = new MetroIstanbulService();

// İstasyonları listele
List<MetroStation> stations = metro.getStations();
stations.forEach(s -> System.out.println(s));

// Hatları listele
List<MetroLine> lines = metro.getLines();

// Bilet fiyatları (Türkçe)
List<MetroTicketPrice> prices = metro.getTicketPrices("tr");
```

### İETT Verisi Çekme (Kimlik Doğrulamalı)

```java
import org.mesutormanli.ibbwsclient.service.IettService;

IettService iett = new IettService("kullanici_adi", "sifre");

// Hat detayı
List<IettLine> hatDetay = iett.getLine("146");

// Durak detayı
List<IettStop> durakDetay = iett.getStop("12345");

// Metrobüs sıklığı
List<IettMetrobusFrequency> frekans = iett.getMetrobusFrequency("34");
```

### Hava Kalitesi Sorgulama

```java
import org.mesutormanli.ibbwsclient.service.AirQualityService;

AirQualityService havaKalitesi = new AirQualityService();

// İstasyonları listele
List<AirQualityStation> istasyonlar = havaKalitesi.getAQIStations();

// Belirli bir istasyonun hava kalitesi
List<AirQualityData> veri = havaKalitesi.getAQIByStationId("IST-1");
```

### Hal Ürün Fiyatları

```java
import org.mesutormanli.ibbwsclient.service.HalUrunFiyatService;
import java.time.LocalDate;

HalUrunFiyatService halService = new HalUrunFiyatService();

// Kategoriler
HalServiceResponse<ProductCategory> kategoriler = halService.getCategories();

// Günlük fiyatlar
HalServiceResponse<ProductPrice> fiyatlar = halService.getProductPriceByDay(LocalDate.now());
```

### Kaynak Serbest Bırakma

```java
import org.mesutormanli.ibbwsclient.service.base.BaseService;

// Uygulama kapatılırken Unirest kaynaklarını serbest bırakın
BaseService.shutdown();
```

---

## API Uç Noktaları

Tüm URL'ler `config/IbbClientConfig.java` dosyasında tanımlıdır.

| Servis | Temel Alan Adı |
|--------|----------------|
| Metro | `api.ibb.gov.tr/MetroIstanbul/api/MetroMobile/V2` |
| İETT (SOAP) | `api.ibb.gov.tr/iett` |
| Hava Kalitesi | `api.ibb.gov.tr/havakalitesi/OpenDataPortalHandler` |
| Trafik | `api.ibb.gov.tr/tkmservices/api/TrafficData/v1` |
| İSBAKİS | `kurumsalapi.ispark.istanbul/DebtApi/bike` |
| İSPARK | `api.ibb.gov.tr/ispark` |
| Sinyalize Kavşak | `api.ibb.gov.tr/web/api/junction` |
| Yol Bakım | `api.ibb.gov.tr/teas/api/open_data` |
| Hal Ürün Fiyat | `halfiyatlaripublicdata.ibb.gov.tr/api/HalManager` |

---

## Testler

Tüm testler **entegrasyon testleridir** ve canlı İBB API'lerine gerçek HTTP çağrıları yapar. Mock kullanılmaz.

### Çalışan Testler

- `MetroIstanbulServiceTest`
- `IsbikeServiceTest`
- `IBBTrafikServiceTest`
- `HalUrunFiyatServiceTest`
- `SinyalizeKavsakServiceTest`

### Devre Dışı Bırakılmış Testler

| Test Sınıfı | Sebep |
|-------------|-------|
| `AirQualityServiceTest` | Canlı API şu anda kullanılamıyor |
| `IsparkServiceTest` | Canlı API şu anda kullanılamıyor |
| `IettServiceTest` | Kimlik bilgileri gerektirir + API kullanılamıyor |
| `YolBakimCalismalariServiceTest.getRoadMaintenanceWorks()` | WAF tarafından engellenir |

### Test Çalıştırma

```bash
# Tüm testler
mvn test

# Tek test sınıfı
mvn test -Dtest=MetroIstanbulServiceTest

# Tek test metodu
mvn test -Dtest=MetroIstanbulServiceTest#testGetStations
```

### Test Yardımcıları

`BaseServiceTest` sınıfı testler için yardımcı metodlar sağlar:

```java
protected void verifyResult(List<?> resultList) {
    assertNotNull(resultList);
    assertFalse(resultList.isEmpty());
    resultList.forEach(System.out::println);
}
```

---

## Hata Yönetimi

Tüm HTTP ve parse hataları `IbbClientException` fırlatır:

```java
try {
    List<MetroStation> stations = service.getStations();
} catch (IbbClientException e) {
    System.err.println("Hata: " + e.getMessage());
}
```

---

## Lisans

Bu proje GNU General Public License v3.0 altında lisanslanmıştır. Detaylı bilgi için [LICENSE](LICENSE) dosyasına bakın.

---

## Geliştirici

**Mesut ORMANLI**
- E-posta: mesutormanli@gmail.com
- GitHub: [@hyperpostulate](https://github.com/hyperpostulate)

---

## Katkıda Bulunma

1. Fork yapın
2. Feature branch oluşturun (`git checkout -b feature/yeni-ozellik`)
3. Değişikliklerinizi commit edin (`git commit -m 'Yeni özellik eklendi'`)
4. Branch'i push edin (`git push origin feature/yeni-ozellik`)
5. Pull Request oluşturun
