<h1 align="center">ibb-webservices-java-client</h1>

<p align="center">
  <a href="https://github.com/hyperpostulate/ibb-webservices-java-client/actions/workflows/maven.yml"><img src="https://github.com/hyperpostulate/ibb-webservices-java-client/actions/workflows/maven.yml/badge.svg" alt="Java CI"></a>
  <a href="https://opensource.org/licenses/Apache-2.0"><img src="https://img.shields.io/badge/License-Apache%202.0-blue.svg" alt="License: Apache 2.0"></a>
</p>

<p align="center">İstanbul Büyükşehir Belediyesi (İBB) açık veri API'leri için Java istemci kütüphanesi.</p>
<p align="center">Ana sınıf içermez — bağımlılık olarak tüketilir.</p>

<p align="center">English version: <a href="README.md">README.md</a></p>

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
mvn clean test                    # Yalnızca offline birim testleri (varsayılan)
mvn clean package                 # Derleme + offline testler + paketleme (CI'ın çalıştırdığı)
mvn clean package -Pintegration   # Canlı API entegrasyon testlerini de çalıştırır (Türkiye ağı gerekir)
mvn test -Pintegration -Dtest=MetroIstanbulServiceTest  # Tek entegrasyon test sınıfı
```

---

## CI/CD

GitHub Actions iş akışı (`.github/workflows/maven.yml`):

- **Tetikleme**: Her push'ta çalışır
- **Ortam**: Ubuntu-latest
- **JDK**: Amazon Corretto 25
- **Komut**: `mvn -B package`

CI yalnızca offline birim testlerini çalıştırır. Canlı API entegrasyon testleri (`*ServiceTest`) varsayılan olarak hariç tutulur; çünkü İBB, Türkiye dışındaki/bulut IP aralıklarını güvenlik duvarıyla engelliyor ve GitHub koşucuları `*.ibb.gov.tr` adreslerine bağlanamıyor (bağlantı zaman aşımı). Bu testleri yerelde `-Pintegration` ile çalıştırabilirsiniz. Ayrıca `@Disabled` kullanan testler otomatik olarak atlanır.

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

Her servis örneği kendi izole HTTP istemcisine sahiptir. Kaynakları `close()` ile serbest bırakın (ör. try-with-resources):

```java
import org.mesutormanli.ibbwsclient.service.MetroIstanbulService;

try (MetroIstanbulService metro = new MetroIstanbulService()) {
    List<MetroStation> stations = metro.getStations();
}
```

`BaseService.shutdown()` kullanımdan kaldırılmıştır (deprecated): süreç-geneli Unirest istemcisini kapatır ve aynı JVM'deki diğer Unirest kullanıcılarını bozabilir. Bir servis örneğini kapatmak diğer örnekleri etkilemez.

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

Testlerin çoğu canlı İBB API'lerine gerçek HTTP çağrıları yapan **entegrasyon testleridir**. Bunlara ek olarak, yerel bir HTTP sunucusuna karşı çalışan ve dış ağ erişimi gerektirmeyen offline birim testleri (`SoapUtilsTest`, `JsonUtilsTest`, `BaseServiceHttpHandlingTest`) vardır.

Entegrasyon testleri **isteğe bağlıdır** (`integration` Maven profili). Varsayılan derlemeden (ve dolayısıyla CI'dan) hariç tutulurlar; çünkü İBB `*.ibb.gov.tr` adreslerini yalnızca Türkiye IP aralıklarına açıyor ve GitHub koşucularından yapılan her istek bağlantı zaman aşımıyla sonuçlanıyor.

### Çalışan Testler

Bu testler Türkiye'den yerel olarak geçer:

- `MetroIstanbulServiceTest`
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
| `IsbikeServiceTest` | API sunucusuna CI koşucularından erişilemiyor |
| `MetroIstanbulServiceTest.getStationBetweenTime()` | Upstream `Success:false` döndürüyor (sunucu tarafı hata) |
| `MetroIstanbulServiceTest.getFaultTypes()` | Upstream `GetFailuresTypes` ucu sunucu tarafında kırık; `getFailureTypes()` kullanın |
| `MetroIstanbulServiceTest.getTimeTable()` | Upstream `Success:false` döndürüyor (sunucu tarafı hata) |

### Test Çalıştırma

```bash
# Offline birim testleri (varsayılan, ağ gerekmez)
mvn test

# Offline birim testleri + canlı API entegrasyon testleri
mvn test -Pintegration

# Tek entegrasyon test sınıfı
mvn test -Pintegration -Dtest=MetroIstanbulServiceTest

# Tek entegrasyon test metodu
mvn test -Pintegration -Dtest=MetroIstanbulServiceTest#getStations
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

Tüm HTTP, ağ ve parse hataları `IbbClientException` fırlatır. Tipli alt sınıflar hatanın türüne göre dallanmanızı sağlar:

- `IbbHttpException` — HTTP hata durumu (4xx/5xx); `getStatus()`, `getStatusText()`, `getBody()`, `getUrl()` sunar
- `IbbNetworkException` — bağlantı/zaman aşımı hataları
- `IbbParseException` — yanıt gövdesi beklenen tipe ayrıştırılamadı

```java
try {
    List<MetroStation> stations = service.getStations();
} catch (IbbHttpException e) {
    System.err.println("HTTP " + e.getStatus() + " — " + e.getUrl() + ": " + e.getBody());
} catch (IbbClientException e) {
    System.err.println("Hata: " + e.getMessage());
}
```

---

## Lisans

Bu proje Apache License 2.0 altında lisanslanmıştır. Detaylı bilgi için [LICENSE](LICENSE) dosyasına bakın.

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
