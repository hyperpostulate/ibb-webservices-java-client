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

## Author

Mesut ORMANLI (mesutormanli@gmail.com)
