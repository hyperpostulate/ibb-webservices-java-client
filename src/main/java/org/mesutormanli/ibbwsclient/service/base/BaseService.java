package org.mesutormanli.ibbwsclient.service.base;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.metro.MetroServiceResponse;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class BaseService {

    protected final Gson gson;

    protected BaseService() {
        this.gson = new Gson();
    }

    protected String executeGet(String url) {
        try {
            HttpResponse<String> response = Unirest.get(url)
                    .header("Accept", "application/json")
                    .asString();
            checkHttpError(response);
            return response.getBody();
        } catch (UnirestException e) {
            throw new IbbClientException("GET request failed: " + url, e);
        }
    }

    protected String executePost(String url, String body) {
        try {
            HttpResponse<String> response = Unirest.post(url)
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .body(body)
                    .asString();
            checkHttpError(response);
            return response.getBody();
        } catch (UnirestException e) {
            throw new IbbClientException("POST request failed: " + url, e);
        }
    }

    protected String executeSoapJson(String url, String methodName, String username, String password, String... paramPairs) {
        try {
            String soapEnvelope = buildSoapEnvelope(methodName, username, password, paramPairs);
            HttpResponse<String> response = Unirest.post(url)
                    .header("Content-Type", "text/xml; charset=utf-8")
                    .header("SOAPAction", "http://tempuri.org/" + methodName)
                    .body(soapEnvelope)
                    .asString();
            checkHttpError(response);
            return extractJsonFromSoapResponse(response.getBody(), methodName);
        } catch (UnirestException e) {
            throw new IbbClientException("SOAP request failed: " + url, e);
        }
    }

    private String buildSoapEnvelope(String methodName, String username, String password, String... paramPairs) {
        StringBuilder soap = new StringBuilder();
        soap.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        soap.append("<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">");

        boolean hasAuth = username != null && password != null;
        if (hasAuth) {
            soap.append("<soap:Header>");
            soap.append("<tem:AuthHeader>");
            soap.append("<tem:Username>").append(escapeXml(username)).append("</tem:Username>");
            soap.append("<tem:Password>").append(escapeXml(password)).append("</tem:Password>");
            soap.append("</tem:AuthHeader>");
            soap.append("</soap:Header>");
        }

        soap.append("<soap:Body>");
        soap.append("<tem:").append(methodName).append(">");
        for (int i = 0; i < paramPairs.length; i += 2) {
            String paramName = paramPairs[i];
            String paramValue = paramPairs[i + 1];
            soap.append("<tem:").append(paramName).append(">").append(escapeXml(paramValue)).append("</tem:").append(paramName).append(">");
        }
        soap.append("</tem:").append(methodName).append(">");
        soap.append("</soap:Body>");
        soap.append("</soap:Envelope>");
        return soap.toString();
    }

    private String escapeXml(String value) {
        if (value == null) return "";
        return value.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&apos;");
    }

    private String extractJsonFromSoapResponse(String soapXml, String methodName) {
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new InputSource(new StringReader(soapXml)));
            String resultTag = methodName + "Result";
            var nodes = doc.getElementsByTagNameNS("*", resultTag);
            if (nodes.getLength() > 0) {
                return nodes.item(0).getTextContent();
            }
            // Fallback: try non-namespace lookup
            nodes = doc.getElementsByTagName(resultTag);
            if (nodes.getLength() > 0) {
                return nodes.item(0).getTextContent();
            }
            throw new IbbClientException("Could not find " + resultTag + " in SOAP response");
        } catch (IbbClientException e) {
            throw e;
        } catch (Exception e) {
            throw new IbbClientException("Failed to parse SOAP response for " + methodName, e);
        }
    }

    private void checkHttpError(HttpResponse<String> response) {
        int status = response.getStatus();
        if (status >= 400) {
            throw new IbbClientException(
                    "HTTP " + status + " " + response.getStatusText());
        }
    }

    protected <T> List<T> deserializeArray(String json, Class<T[]> arrayClass) {
        T[] array = gson.fromJson(json, arrayClass);
        return array != null ? Arrays.asList(array) : Collections.emptyList();
    }

    protected <T> T deserializeObject(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }

    protected <T> MetroServiceResponse<T> deserializeMetroResponse(String json, Type type) {
        return gson.fromJson(json, type);
    }

    protected <T> List<T> extractDataOrEmpty(MetroServiceResponse<List<T>> response) {
        if (response == null || !response.isSuccess() || response.getData() == null) {
            return Collections.emptyList();
        }
        return response.getData();
    }

    protected <T> Type createMetroListType(Class<T> elementClass) {
        return TypeToken.getParameterized(MetroServiceResponse.class,
                TypeToken.getParameterized(List.class, elementClass).getType()).getType();
    }

    public static void shutdown() {
        Unirest.shutDown();
    }
}
