# IBB Web Services Java Client

Java client for IBB (Istanbul Metropolitan Municipality) public APIs at `https://data.ibb.gov.tr`. Licensed GPL-3.0.

## Tech stack

- **Java 25** (source & target, `maven-compiler-plugin` 3.12.1), **Maven** only
- **Unirest 3.14.5** (HTTP), **Gson 2.10.1** (JSON), **JUnit Jupiter 5** (RELEASE, `maven-surefire-plugin` 3.2.5)
- No formatter, linter, or resources directory configured

## Build & test

```bash
mvn compile        # compile sources
mvn test           # all tests (no single-test shortcut in POM)
mvn package        # produces target/ibbwsclient-1.0-SNAPSHOT.jar
```

## CI

`.github/workflows/maven.yml` — triggers on every push. Uses **`corretto` 25** (not `temurin` — match if updating). Command: `mvn -B package --file pom.xml`.

## Project conventions

### Architecture

- **Library JAR** — no `main()` method
- **Services** extend `BaseService` (provides `protected Gson gson`)
- **Models** extend `BaseDataModel` (implements `Serializable`)
- **Tests** extend `BaseServiceTest` (provides `printResult(List<? extends BaseDataModel>)`)

### HTTP & JSON patterns

Services use Unirest (`GET` or `POST` with `.header()`, `.queryString()`, or `.body()`):
- Deserialization varies: array via `gson.fromJson(json, ModelType[].class)`, single object via `ModelType.class`, or wrapped responses via `TypeToken` (e.g. `MetroServiceResponse<List<ModelType>>`).
- `BaseService` constructs `new Gson()` (no custom config).

### Testing

- **Integration tests only** — call live `api.ibb.gov.tr` endpoints, print output. Internet required.
- **No mocking** or test fixtures.
- `@BeforeEach` creates the service under test.
- `@Disabled` tests exist where endpoints are unavailable (e.g. `AirQualityServiceTest`, `IsparkServiceTest` class-level; `YolBakimCalismalariServiceTest` method level with reason `"API endpoint is blocked by WAF"`). Do not remove without verification.

### Code style

- Match existing style (IntelliJ defaults in `.idea/`, though `.idea/` is gitignored).
- Package: `org.mesutormanli.ibbwsclient`
