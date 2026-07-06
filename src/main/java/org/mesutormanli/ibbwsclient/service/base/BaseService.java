package org.mesutormanli.ibbwsclient.service.base;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.util.SoapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public abstract class BaseService {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    static {
        Unirest.config()
                .connectTimeout((int) Duration.ofSeconds(10).toMillis())
                .socketTimeout((int) Duration.ofSeconds(30).toMillis());
    }

    protected String executeGet(String url) {
        log.debug("GET {}", url);
        try {
            HttpResponse<String> response = Unirest.get(url)
                    .header("Accept", "application/json")
                    .asString();
            checkHttpError(response);
            String body = response.getBody();
            log.trace("GET {} response: {}", url, body);
            return body;
        } catch (UnirestException e) {
            throw new IbbClientException("GET request failed: " + url, e);
        }
    }

    protected String executePost(String url, String body) {
        log.debug("POST {} body: {}", url, body);
        try {
            HttpResponse<String> response = Unirest.post(url)
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .body(body)
                    .asString();
            checkHttpError(response);
            String responseBody = response.getBody();
            log.trace("POST {} response: {}", url, responseBody);
            return responseBody;
        } catch (UnirestException e) {
            throw new IbbClientException("POST request failed: " + url, e);
        }
    }

    protected String executeSoapJson(String url, String methodName, String username, String password, String... paramPairs) {
        log.debug("SOAP {} method={}", url, methodName);
        try {
            String soapEnvelope = SoapUtils.buildEnvelope(methodName, username, password, paramPairs);
            HttpResponse<String> response = Unirest.post(url)
                    .header("Content-Type", "text/xml; charset=utf-8")
                    .header("SOAPAction", "http://tempuri.org/" + methodName)
                    .body(soapEnvelope)
                    .asString();
            checkHttpError(response);
            return SoapUtils.extractJsonFromResponse(response.getBody(), methodName);
        } catch (UnirestException e) {
            throw new IbbClientException("SOAP request failed: " + url, e);
        }
    }

    private void checkHttpError(HttpResponse<String> response) {
        int status = response.getStatus();
        if (status >= 400) {
            throw new IbbClientException(
                    "HTTP " + status + " " + response.getStatusText());
        }
    }

    public static void shutdown() {
        Unirest.shutDown();
    }
}
