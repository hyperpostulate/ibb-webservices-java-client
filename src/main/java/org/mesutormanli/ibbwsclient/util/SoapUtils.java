package org.mesutormanli.ibbwsclient.util;

import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.StringReader;
import java.util.regex.Pattern;

/**
 * SOAP 1.1 zarfı kurucu ve yanıt ayrıştırıcı yardımcıları.
 * <p>
 * XML ayrıştırma, XXE saldırılarına karşı sertleştirilmiş bir parser ile yapılır.
 */
public final class SoapUtils {

    private static final Pattern XML_NAME = Pattern.compile("[A-Za-z_][A-Za-z0-9_]*");

    private SoapUtils() {
    }

    /**
     * Verilen yöntem, kimlik doğrulama bilgileri ve parametrelerle bir SOAP 1.1 zarfı oluşturur.
     *
     * @param methodName çağrılacak SOAP yönteminin adı (geçerli bir XML adı olmalıdır)
     * @param username kimlik doğrulama kullanıcı adı (yoksa null)
     * @param password kimlik doğrulama parolası (yoksa null)
     * @param paramPairs yöntem parametreleri, ad-değer çiftleri olarak
     * @return SOAP 1.1 zarfı
     * @throws IllegalArgumentException paramPairs öğe sayısı tek ise veya methodName ya da bir parametre adı
     * geçerli bir XML adı değilse
     */
    public static String buildEnvelope(String methodName, String username, String password, String... paramPairs) {
        if (paramPairs.length % 2 != 0) {
            throw new IllegalArgumentException("paramPairs must contain an even number of elements (key-value pairs)");
        }
        validateXmlName(methodName, "methodName");
        for (int i = 0; i < paramPairs.length; i += 2) {
            validateXmlName(paramPairs[i], "paramName");
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

    /**
     * Bir SOAP yanıtından yöntem sonucu JSON içeriğini çıkarır.
     *
     * @param soapXml ayrıştırılacak SOAP yanıtı
     * @param methodName sonuç etiketinin türetileceği SOAP yönteminin adı
     * @return sonuç etiketinin metin içeriği
     * @throws IbbClientException yanıtta SOAP fault varsa, sonuç etiketi bulunamazsa veya yanıt ayrıştırılamazsa
     */
    public static String extractJsonFromResponse(String soapXml, String methodName) {
        try {
            Document doc = newDocumentBuilder().parse(new InputSource(new StringReader(soapXml)));
            String fault = findTextContent(doc, "faultstring");
            if (fault != null) {
                throw new IbbClientException("SOAP fault in response for method " + methodName + ": " + fault);
            }
            String resultTag = methodName + "Result";
            String result = findTextContent(doc, resultTag);
            if (result == null) {
                throw new IbbClientException("Could not find " + resultTag + " in SOAP response");
            }
            return result;
        } catch (IbbClientException e) {
            throw e;
        } catch (Exception e) {
            throw new IbbClientException("Failed to parse SOAP response for " + methodName, e);
        }
    }

    /**
     * Bir SOAP yanıtından faultstring metnini çıkarır. Asla istisna fırlatmaz; en iyi çaba (best-effort)
     * yaklaşımıyla çalışır ve bulunamazsa null döndürür.
     *
     * @param soapXml ayrıştırılacak SOAP yanıtı
     * @return faultstring metni veya bulunamazsa null
     */
    public static String extractFaultString(String soapXml) {
        if (soapXml == null || soapXml.isBlank()) {
            return null;
        }
        try {
            Document doc = newDocumentBuilder().parse(new InputSource(new StringReader(soapXml)));
            return findTextContent(doc, "faultstring");
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Verilen etiket adına sahip ilk düğümün metin içeriğini bulur.
     */
    private static String findTextContent(Document doc, String tag) {
        NodeList nodes = doc.getElementsByTagName(tag);
        if (nodes.getLength() > 0) {
            return nodes.item(0).getTextContent();
        }
        nodes = doc.getElementsByTagNameNS("*", tag);
        if (nodes.getLength() > 0) {
            return nodes.item(0).getTextContent();
        }
        return null;
    }

    /**
     * XXE'ye karşı sertleştirilmiş bir DocumentBuilder oluşturur.
     */
    private static DocumentBuilder newDocumentBuilder() throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
        factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        factory.setXIncludeAware(false);
        factory.setExpandEntityReferences(false);
        factory.setNamespaceAware(true);
        return factory.newDocumentBuilder();
    }

    /**
     * Verilen değerin geçerli bir XML adı olup olmadığını doğrular.
     */
    private static void validateXmlName(String value, String what) {
        if (value == null || !XML_NAME.matcher(value).matches()) {
            throw new IllegalArgumentException(what + " is not a valid XML name: " + value);
        }
    }

    /**
     * Bir dizeyi XML güvenli hale getirir: geçersiz karakterleri ayıklar ve XML varlıklarını kaçışlar.
     */
    private static String escapeXml(String value) {
        if (value == null) return "";
        StringBuilder sanitized = new StringBuilder(value.length());
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c == '\t' || c == '\n' || c == '\r' || c >= 0x20) {
                sanitized.append(c);
            }
        }
        return sanitized.toString()
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&apos;");
    }
}
