package org.mesutormanli.ibbwsclient.service.base;

import kong.unirest.Config;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import kong.unirest.UnirestInstance;
import org.mesutormanli.ibbwsclient.exception.IbbHttpException;
import org.mesutormanli.ibbwsclient.exception.IbbNetworkException;
import org.mesutormanli.ibbwsclient.util.SoapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

/**
 * IBB API servisleri için temel sınıf.
 * <p>
 * Her servis örneği, 10 saniye bağlantı ve 30 saniye soket zaman aşımı ile yapılandırılmış izole bir HTTP
 * istemcisine sahiptir; böylece süreç genelindeki Unirest yapılandırmasını ne okur ne de değiştirir. Örnekler
 * eşzamanlı çağrılar için thread-safe'tir. İşiniz bittiğinde bu örneğin HTTP istemcisi kaynaklarını serbest
 * bırakmak için try-with-resources veya {@link #close()} kullanın.
 */
public abstract class BaseService implements AutoCloseable {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    private final UnirestInstance unirest;

    protected BaseService() {
        this.unirest = new UnirestInstance(new Config()
                .connectTimeout((int) Duration.ofSeconds(10).toMillis())
                .socketTimeout((int) Duration.ofSeconds(30).toMillis()));
    }

    /**
     * Belirtilen URL'ye bir HTTP GET isteği gönderir.
     *
     * @param url istek gönderilecek URL
     * @return ham yanıt gövdesi
     * @throws IbbNetworkException taşıma hatalarında
     * @throws IbbHttpException HTTP 400 ve üzeri yanıtlarda
     */
    protected String executeGet(String url) {
        log.debug("GET {}", url);
        try {
            HttpResponse<String> response = unirest.get(url)
                    .header("Accept", "application/json")
                    .asString();
            assertHttpSuccess(response, url);
            String body = response.getBody();
            log.trace("GET {} response: {}", url, body);
            return body;
        } catch (UnirestException e) {
            throw new IbbNetworkException("GET request failed: " + url, e);
        }
    }

    /**
     * Belirtilen URL'ye JSON gövdesiyle bir HTTP POST isteği gönderir.
     *
     * @param url istek gönderilecek URL
     * @param body istek gövdesi (JSON)
     * @return ham yanıt gövdesi
     * @throws IbbNetworkException taşıma hatalarında
     * @throws IbbHttpException HTTP 400 ve üzeri yanıtlarda
     */
    protected String executePost(String url, String body) {
        log.debug("POST {} body: {}", url, body);
        try {
            HttpResponse<String> response = unirest.post(url)
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .body(body)
                    .asString();
            assertHttpSuccess(response, url);
            String responseBody = response.getBody();
            log.trace("POST {} response: {}", url, responseBody);
            return responseBody;
        } catch (UnirestException e) {
            throw new IbbNetworkException("POST request failed: " + url, e);
        }
    }

    /**
     * Belirtilen URL'ye bir SOAP 1.1 isteği gönderir ve yanıttaki JSON sonuç içeriğini döndürür.
     *
     * @param url istek gönderilecek URL
     * @param methodName çağrılacak SOAP yönteminin adı
     * @param username kimlik doğrulama kullanıcı adı (yoksa null)
     * @param password kimlik doğrulama parolası (yoksa null)
     * @param paramPairs yöntem parametreleri, ad-değer çiftleri olarak
     * @return SOAP sonuç içeriği
     * @throws IbbNetworkException taşıma hatalarında
     * @throws IbbHttpException HTTP 400 ve üzeri yanıtlarda; SOAP yolunda faultstring varsa gövdeye taşınır
     */
    protected String executeSoapJson(String url, String methodName, String username, String password, String... paramPairs) {
        log.debug("SOAP {} method={}", url, methodName);
        try {
            String soapEnvelope = SoapUtils.buildEnvelope(methodName, username, password, paramPairs);
            HttpResponse<String> response = unirest.post(url)
                    .header("Content-Type", "text/xml; charset=utf-8")
                    .header("SOAPAction", "http://tempuri.org/" + methodName)
                    .body(soapEnvelope)
                    .asString();
            if (response.getStatus() >= 400) {
                String fault = SoapUtils.extractFaultString(response.getBody());
                throw new IbbHttpException(response.getStatus(), response.getStatusText(), url,
                        fault != null ? "SOAP fault: " + fault : response.getBody());
            }
            return SoapUtils.extractJsonFromResponse(response.getBody(), methodName);
        } catch (UnirestException e) {
            throw new IbbNetworkException("SOAP request failed: " + url, e);
        }
    }

    /**
     * HTTP durum kodunu denetler ve 400 veya üzeri ise {@link IbbHttpException} fırlatır.
     */
    private void assertHttpSuccess(HttpResponse<String> response, String url) {
        int status = response.getStatus();
        if (status >= 400) {
            throw new IbbHttpException(status, response.getStatusText(), url, response.getBody());
        }
    }

    /**
     * Bu örneğin HTTP istemcisini serbest bırakır. Diğer servis örnekleri etkilenmez.
     */
    @Override
    public void close() {
        unirest.close();
    }

    /**
     * Süreç genelindeki Unirest örneğini kapatır.
     *
     * @deprecated Örnek başına {@link #close()} desteklenen yaşam döngüsüdür. Bu statik yöntem süreç genelindeki
     * Unirest'i kapatır ve aynı JVM'deki diğer Unirest kullanıcılarını bozabilir. Yalnızca geriye dönük uyumluluk
     * için tutulmuştur.
     */
    @Deprecated
    public static void shutdown() {
        Unirest.shutDown();
    }
}
