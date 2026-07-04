# ibb-webservices-java-client

Java client library for Istanbul Metropolitan Municipality (IBB) open data APIs. No main class — consumed as a dependency.

## Build & Test

```bash
mvn clean test              # full build + tests
mvn test -pl . -Dtest=MetroIstanbulServiceTest  # single test class (Surefire)
```

Java 25 required (`pom.xml`: source/target 25). Single-module Maven project.

## CI

GitHub Actions workflow (`.github/workflows/maven.yml`): runs `mvn -B package` on every push using JDK 25 (Amazon Corretto).

Disabled tests are skipped automatically since they use `@Disabled` — CI passes without them.

## Architecture

- **9 service classes** under `org.mesutormanli.ibbwsclient.service`, each wrapping one IBB API domain (Metro, AirQuality, IETT, ISBIKE, ISPARK, Trafik, HalUrunFiyat, SinyalizeKavsak, YolBakim)
- **`BaseService`** (`service/base/BaseService.java`) provides three HTTP primitives: `executeGet`, `executePost`, `executeSoapJson`
- **All models** are Java `record` types with Gson `@SerializedName` for JSON mapping
- HTTP: Unirest 3.14.5. JSON: Gson 2.10.1

### Key patterns
- **MetroIstanbulService**: responses wrapped in `MetroServiceResponse<T>` envelope — use `createMetroListType()` + `extractDataOrEmpty()`
- **IettService**: SOAP over POST to legacy `.asmx` endpoints. Some endpoints require username/password passed to the constructor. Unauthenticated endpoints pass `null, null`
- **HalUrunFiyat**: custom `*ServiceResponse` wrappers with `ResponseStatus`, `ErrorGUID`, `Message`, `Results`
- **Isbike**: `IsbikeServiceResponse` wrapper with `serviceCode`, `serviceDesc`, `dataList`
- **Shutdown**: call `BaseService.shutdown()` to release Unirest resources

## Testing

All tests are **integration tests** making real HTTP calls to live IBB APIs. No mocking.

Disabled tests (live APIs currently unavailable):
- `AirQualityServiceTest` — class-level `@Disabled`
- `IsparkServiceTest` — class-level `@Disabled`
- `IettServiceTest` — class-level `@Disabled` (also requires auth credentials)
- `YolBakimCalismalariServiceTest.getOpenData()` — method-level `@Disabled` (blocked by WAF)

`BaseServiceTest` provides `verifyResult(List<?>)` asserting non-null and non-empty.

## API endpoints

All URLs in `config/IbbClientConfig.java`. Base domains:
- Metro: `api.ibb.gov.tr/MetroIstanbul/api/MetroMobile/V2`
- IETT (SOAP): `api.ibb.gov.tr/iett/.../*.asmx`
- Air Quality: `api.ibb.gov.tr/havakalitesi/OpenDataPortalHandler`
- Traffic: `api.ibb.gov.tr/tkmservices/api/TrafficData/v1`
- ISBIKE: `kurumsalapi.ispark.istanbul/DebtApi/bike`
- ISPARK: `api.ibb.gov.tr/ispark`
- Sinyalize Kavsak: `api.ibb.gov.tr/web/api/junction`
- Yol Bakim: `api.ibb.gov.tr/teas/api/open_data`
- Hal Urun Fiyat: `halfiyatlaripublicdata.ibb.gov.tr/api/HalManager`

## License

GNU GPL v3.

## Developer

Mesut ORMANLI (mesutormanli@gmail.com)

---

# ibb-webservices-java-client

İstanbul Büyükşehir Belediyesi (İBB) açık veri API'leri için Java istemci kütüphanesi. Ana sınıf içermez — bağımlılık olarak tüketilir.

## Derleme ve Test

```bash
mvn clean test              # tam derleme + testler
mvn test -pl . -Dtest=MetroIstanbulServiceTest  # tek test sınıfı (Surefire)
```

Java 25 gereklidir (`pom.xml`: source/target 25). Tek modüllü Maven projesi.

## CI

GitHub Actions iş akışı (`.github/workflows/maven.yml`): her push'ta JDK 25 (Amazon Corretto) ile `mvn -B package` çalıştırır.

Devre dışı bırakılan testler `@Disabled` kullanıldığı için otomatik olarak atlanır — CI onlarsız geçer.

## Mimari

- **9 servis sınıfı** `org.mesutormanli.ibbwsclient.service` altında, her biri bir İBB API alanını sarar (Metro, HavaKalitesi, İETT, İSBAK, İSPARK, Trafik, HalÜrünFiyat, SinyalizeKavşak, YolBakım)
- **`BaseService`** (`service/base/BaseService.java`), üç HTTP temel işlemi sağlar: `executeGet`, `executePost`, `executeSoapJson`
- **Tüm modeller** Java `record` türleridir ve JSON eşleme için Gson `@SerializedName` kullanır
- HTTP: Unirest 3.14.5. JSON: Gson 2.10.1

### Temel desenler
- **MetroIstanbulService**: yanıtlar `MetroServiceResponse<T>` zarfı içinde sarılır — `createMetroListType()` + `extractDataOrEmpty()` kullanın
- **IettService**: eski `.asmx` uç noktalarına POST üzerinden SOAP. Bazı uç noktalar kurucuya iletilen kullanıcı adı/parola gerektirir. Kimlik doğrulama gerektirmeyen uç noktalar `null, null` iletir
- **HalUrunFiyat**: `ResponseStatus`, `ErrorGUID`, `Message`, `Results` içeren özel `*ServiceResponse` sarmalayıcıları
- **Isbike**: `serviceCode`, `serviceDesc`, `dataList` içeren `IsbikeServiceResponse` sarmalayıcısı
- **Kapatma**: Unirest kaynaklarını serbest bırakmak için `BaseService.shutdown()` çağırın

## Test

Tüm testler, canlı İBB API'lerine gerçek HTTP çağrıları yapan **entegrasyon testleridir**. Mock kullanılmaz.

Devre dışı bırakılan testler (şu anda kullanılamayan canlı API'ler):
- `AirQualityServiceTest` — sınıf düzeyinde `@Disabled`
- `IsparkServiceTest` — sınıf düzeyinde `@Disabled`
- `IettServiceTest` — sınıf düzeyinde `@Disabled` (ayrıca kimlik bilgileri gerektirir)
- `YolBakimCalismalariServiceTest.getOpenData()` — metot düzeyinde `@Disabled` (WAF tarafından engellenir)

`BaseServiceTest`, null olmama ve boş olmama durumunu kontrol eden `verifyResult(List<?>)` sağlar.

## API uç noktaları

Tüm URL'ler `config/IbbClientConfig.java` içindedir. Temel alan adları:
- Metro: `api.ibb.gov.tr/MetroIstanbul/api/MetroMobile/V2`
- İETT (SOAP): `api.ibb.gov.tr/iett/.../*.asmx`
- Hava Kalitesi: `api.ibb.gov.tr/havakalitesi/OpenDataPortalHandler`
- Trafik: `api.ibb.gov.tr/tkmservices/api/TrafficData/v1`
- İSBAK: `kurumsalapi.ispark.istanbul/DebtApi/bike`
- İSPARK: `api.ibb.gov.tr/ispark`
- Sinyalize Kavşak: `api.ibb.gov.tr/web/api/junction`
- Yol Bakım: `api.ibb.gov.tr/teas/api/open_data`
- Hal Ürün Fiyat: `halfiyatlaripublicdata.ibb.gov.tr/api/HalManager`

## Lisans

GNU GPL v3.

## Geliştirici

Mesut ORMANLI (mesutormanli@gmail.com)
