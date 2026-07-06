package org.mesutormanli.ibbwsclient.util;

import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public final class SoapUtils {

    private SoapUtils() {
    }

    public static String buildEnvelope(String methodName, String username, String password, String... paramPairs) {
        if (paramPairs.length % 2 != 0) {
            throw new IllegalArgumentException("paramPairs must contain an even number of elements (key-value pairs)");
        }
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
            soap.append("<tem:").append(paramName).append(">")
                    .append(escapeXml(paramValue))
                    .append("</tem:").append(paramName).append(">");
        }
        soap.append("</tem:").append(methodName).append(">");
        soap.append("</soap:Body>");
        soap.append("</soap:Envelope>");
        return soap.toString();
    }

    public static String extractJsonFromResponse(String soapXml, String methodName) {
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new InputSource(new StringReader(soapXml)));
            String resultTag = methodName + "Result";
            var nodes = doc.getElementsByTagName(resultTag);
            if (nodes.getLength() > 0) {
                return nodes.item(0).getTextContent();
            }
            nodes = doc.getElementsByTagNameNS("*", resultTag);
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

    private static String escapeXml(String value) {
        if (value == null) return "";
        return value.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&apos;");
    }
}
