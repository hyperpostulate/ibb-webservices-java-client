package org.mesutormanli.ibbwsclient.service.base;

import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.exception.IbbHttpException;
import org.mesutormanli.ibbwsclient.exception.IbbNetworkException;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BaseServiceHttpHandlingTest {

    private record StubResponse(int status, String body) {
    }

    static class TestService extends BaseService {
    }

    private final Map<String, StubResponse> responses = new HashMap<>();
    private HttpServer server;
    private int port;

    @BeforeEach
    void setUp() throws IOException {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/", exchange -> {
            String path = exchange.getRequestURI().getPath();
            StubResponse response = responses.getOrDefault(path, new StubResponse(404, "not found"));
            byte[] bytes = response.body().getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(response.status(), bytes.length);
            try (OutputStream outputStream = exchange.getResponseBody()) {
                outputStream.write(bytes);
            }
        });
        server.start();
        port = server.getAddress().getPort();
    }

    @AfterEach
    void tearDown() {
        server.stop(0);
    }

    @Test
    void getReturnsBodyOnSuccess() {
        responses.put("/ok", new StubResponse(200, "{\"a\":1}"));
        try (TestService service = new TestService()) {
            assertEquals("{\"a\":1}", service.executeGet(url("/ok")));
        }
    }

    @Test
    void getThrowsHttpExceptionOn404WithStatusAndBody() {
        responses.put("/missing", new StubResponse(404, "nope"));
        try (TestService service = new TestService()) {
            IbbHttpException ex = assertThrows(IbbHttpException.class, () -> service.executeGet(url("/missing")));

            assertEquals(404, ex.getStatus());
            assertEquals("nope", ex.getBody());
            assertTrue(ex.getUrl().contains("/missing"));
            assertTrue(ex.getMessage().contains(url("/missing")));
        }
    }

    @Test
    void getThrowsHttpExceptionOn500() {
        responses.put("/boom", new StubResponse(500, "server error"));
        try (TestService service = new TestService()) {
            IbbHttpException ex = assertThrows(IbbHttpException.class, () -> service.executeGet(url("/boom")));

            assertEquals(500, ex.getStatus());
        }
    }

    @Test
    void postReturnsBodyOnSuccess() {
        responses.put("/post", new StubResponse(200, "{\"b\":2}"));
        try (TestService service = new TestService()) {
            assertEquals("{\"b\":2}", service.executePost(url("/post"), "{}"));
        }
    }

    @Test
    void getThrowsNetworkExceptionWhenConnectionFails() throws IOException {
        HttpServer other = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        other.createContext("/", exchange -> {
            exchange.sendResponseHeaders(200, -1);
            exchange.close();
        });
        other.start();
        int deadPort = other.getAddress().getPort();
        other.stop(0);

        try (TestService service = new TestService()) {
            assertThrows(IbbNetworkException.class,
                    () -> service.executeGet("http://127.0.0.1:" + deadPort + "/x"));
        }
    }

    @Test
    void soapHappyPathWithUnprefixedResult() {
        String json = "[{\"Id\":1}]";
        responses.put("/soap", new StubResponse(200, soapEnvelope(
                "<FooResult xmlns=\"http://tempuri.org/\">" + json + "</FooResult>")));
        try (TestService service = new TestService()) {
            assertEquals(json, service.executeSoapJson(url("/soap"), "Foo", null, null));
        }
    }

    @Test
    void soapHappyPathWithPrefixedResult() {
        String json = "[{\"Id\":1}]";
        responses.put("/soap-prefixed", new StubResponse(200, soapEnvelope(
                "<tem:FooResult xmlns:tem=\"http://tempuri.org/\">" + json + "</tem:FooResult>")));
        try (TestService service = new TestService()) {
            assertEquals(json, service.executeSoapJson(url("/soap-prefixed"), "Foo", null, null));
        }
    }

    @Test
    void soapFaultThrowsHttpExceptionCarryingFaultText() {
        responses.put("/soap-fault", new StubResponse(500, soapEnvelope(
                "<soap:Fault><faultcode>soap:Server</faultcode><faultstring>Boom</faultstring></soap:Fault>")));
        try (TestService service = new TestService()) {
            IbbHttpException ex = assertThrows(IbbHttpException.class,
                    () -> service.executeSoapJson(url("/soap-fault"), "Foo", null, null));

            assertTrue(ex.getMessage().contains("Boom"));
        }
    }

    @Test
    void closingOneInstanceDoesNotAffectAnother() {
        responses.put("/iso", new StubResponse(200, "ok"));
        TestService svc1 = new TestService();
        TestService svc2 = new TestService();
        try {
            assertEquals("ok", svc1.executeGet(url("/iso")));
            svc1.close();
            assertEquals("ok", svc2.executeGet(url("/iso")));
        } finally {
            svc2.close();
        }
    }

    @Test
    @SuppressWarnings("deprecation")
    void globalShutdownDoesNotAffectInstance() {
        responses.put("/global", new StubResponse(200, "still-works"));
        TestService svc3 = new TestService();
        try {
            BaseService.shutdown();
            assertEquals("still-works", svc3.executeGet(url("/global")));
        } finally {
            svc3.close();
        }
    }

    private String url(String path) {
        return "http://127.0.0.1:" + port + path;
    }

    private static String soapEnvelope(String bodyContent) {
        return "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "<soap:Body>" + bodyContent + "</soap:Body></soap:Envelope>";
    }
}
