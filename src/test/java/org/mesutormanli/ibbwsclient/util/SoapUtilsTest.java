package org.mesutormanli.ibbwsclient.util;

import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SoapUtilsTest {

    private static String envelope(String bodyContent) {
        return "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "<soap:Body>" + bodyContent + "</soap:Body></soap:Envelope>";
    }

    @Test
    void buildEnvelopeEscapesAuthHeaderWhenCredentialsPresent() {
        String soap = SoapUtils.buildEnvelope("Foo", "u&<>\"'", "p&<>\"'");

        assertTrue(soap.contains("<soap:Header>"));
        assertTrue(soap.contains("<tem:Username>u&amp;&lt;&gt;&quot;&apos;</tem:Username>"));
        assertTrue(soap.contains("<tem:Password>p&amp;&lt;&gt;&quot;&apos;</tem:Password>"));
    }

    @Test
    void buildEnvelopeOmitsHeaderWhenCredentialsNull() {
        String soap = SoapUtils.buildEnvelope("Foo", null, null);

        assertFalse(soap.contains("soap:Header"));
        assertTrue(soap.contains("<tem:Foo>"));
    }

    @Test
    void buildEnvelopeEscapesParamValues() {
        String soap = SoapUtils.buildEnvelope("Foo", null, null, "p", "a&b<c>d\"e'f");

        assertTrue(soap.contains("<tem:p>a&amp;b&lt;c&gt;d&quot;e&apos;f</tem:p>"));
    }

    @Test
    void buildEnvelopeRejectsOddParamPairs() {
        assertThrows(IllegalArgumentException.class,
                () -> SoapUtils.buildEnvelope("Foo", null, null, "onlyKey"));
    }

    @Test
    void buildEnvelopeRejectsInvalidMethodName() {
        assertThrows(IllegalArgumentException.class,
                () -> SoapUtils.buildEnvelope("x/><tem:Injected", null, null));
    }

    @Test
    void buildEnvelopeRejectsInvalidParamName() {
        assertThrows(IllegalArgumentException.class,
                () -> SoapUtils.buildEnvelope("Foo", null, null, "a b", "value"));
    }

    @Test
    void buildEnvelopeStripsInvalidControlCharacters() {
        String soap = SoapUtils.buildEnvelope("Foo", null, null, "p", "ab\u0000cd");

        assertFalse(soap.contains("\u0000"));
        assertTrue(soap.contains("<tem:p>abcd</tem:p>"));
    }

    @Test
    void extractJsonFromResponseFindsUnprefixedResult() {
        String json = SoapUtils.extractJsonFromResponse(
                envelope("<FooResult xmlns=\"http://tempuri.org/\">[{\"Id\":1}]</FooResult>"), "Foo");

        assertEquals("[{\"Id\":1}]", json);
    }

    @Test
    void extractJsonFromResponseFindsPrefixedResult() {
        String json = SoapUtils.extractJsonFromResponse(
                envelope("<tem:FooResult xmlns:tem=\"http://tempuri.org/\">[{\"Id\":1}]</tem:FooResult>"), "Foo");

        assertEquals("[{\"Id\":1}]", json);
    }

    @Test
    void extractJsonFromResponseThrowsOnSoapFault() {
        String xml = envelope("<soap:Fault><faultcode>soap:Server</faultcode>"
                + "<faultstring>Something bad</faultstring></soap:Fault>");

        IbbClientException ex = assertThrows(IbbClientException.class,
                () -> SoapUtils.extractJsonFromResponse(xml, "Foo"));

        assertTrue(ex.getMessage().contains("Something bad"));
    }

    @Test
    void extractJsonFromResponseThrowsWhenResultMissing() {
        IbbClientException ex = assertThrows(IbbClientException.class,
                () -> SoapUtils.extractJsonFromResponse(envelope("<Other>x</Other>"), "Foo"));

        assertTrue(ex.getMessage().contains("FooResult"));
    }

    @Test
    void extractJsonFromResponseRejectsXxePayload() throws Exception {
        String xxe = "<?xml version=\"1.0\"?>\n"
                + "<!DOCTYPE foo [<!ENTITY xxe SYSTEM \"file:///etc/passwd\">]>\n"
                + envelope("<FooResult>&xxe;</FooResult>");

        IbbClientException ex = assertThrows(IbbClientException.class,
                () -> SoapUtils.extractJsonFromResponse(xxe, "Foo"));

        String passwd = readPasswdContents();
        assertFalse(messageChainContains(ex, passwd));
        assertFalse(messageChainContains(ex, "root:"));
    }

    @Test
    void extractFaultStringReturnsFaultText() {
        String xml = envelope("<soap:Fault><faultcode>soap:Server</faultcode>"
                + "<faultstring>Faulted</faultstring></soap:Fault>");

        assertEquals("Faulted", SoapUtils.extractFaultString(xml));
    }

    @Test
    void extractFaultStringReturnsNullForNormalEnvelope() {
        assertNull(SoapUtils.extractFaultString(
                envelope("<FooResult xmlns=\"http://tempuri.org/\">[{\"Id\":1}]</FooResult>")));
    }

    @Test
    void extractFaultStringReturnsNullForGarbage() {
        assertNull(SoapUtils.extractFaultString("this is not xml <<<"));
    }

    private static boolean messageChainContains(Throwable throwable, String needle) {
        Throwable current = throwable;
        while (current != null) {
            String message = current.getMessage();
            if (message != null && message.contains(needle)) {
                return true;
            }
            current = current.getCause();
        }
        return false;
    }

    private static String readPasswdContents() {
        try {
            String contents = Files.readString(Path.of("/etc/passwd"));
            assertNotNull(contents);
            return contents;
        } catch (Exception e) {
            return "root:";
        }
    }
}
