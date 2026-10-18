package org.mesutormanli.ibbwsclient.util;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.exception.IbbParseException;

import java.lang.reflect.Type;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JsonUtilsTest {

    private record Sample(
            @SerializedName("Id") int id,
            @SerializedName("Name") String name
    ) {
    }

    @Test
    void deserializeObjectMapsPascalCaseFields() {
        Sample sample = JsonUtils.deserializeObject("{\"Id\":7,\"Name\":\"foo\"}", Sample.class);

        assertEquals(7, sample.id());
        assertEquals("foo", sample.name());
    }

    @Test
    void deserializeObjectThrowsOnMalformedJsonWithCause() {
        IbbParseException ex = assertThrows(IbbParseException.class,
                () -> JsonUtils.deserializeObject("not-json{", Sample.class));

        assertNotNull(ex.getCause());
    }

    @Test
    void deserializeObjectThrowsOnEmptyBody() {
        assertThrows(IbbParseException.class, () -> JsonUtils.deserializeObject("", Sample.class));
    }

    @Test
    void deserializeObjectThrowsOnBlankBody() {
        assertThrows(IbbParseException.class, () -> JsonUtils.deserializeObject("   ", Sample.class));
    }

    @Test
    void deserializeObjectThrowsOnNullLiteral() {
        assertThrows(IbbParseException.class, () -> JsonUtils.deserializeObject("null", Sample.class));
    }

    @Test
    void deserializeArrayMapsElements() {
        List<Sample> samples = JsonUtils.deserializeArray(
                "[{\"Id\":1,\"Name\":\"a\"},{\"Id\":2,\"Name\":\"b\"}]", Sample[].class);

        assertEquals(2, samples.size());
        assertEquals(1, samples.get(0).id());
        assertEquals("b", samples.get(1).name());
    }

    @Test
    void deserializeArrayReturnsEmptyListForEmptyArray() {
        List<Sample> samples = JsonUtils.deserializeArray("[]", Sample[].class);

        assertTrue(samples.isEmpty());
    }

    @Test
    void deserializeArrayThrowsOnEmptyBody() {
        assertThrows(IbbParseException.class, () -> JsonUtils.deserializeArray("", Sample[].class));
    }

    @Test
    void deserializeArrayThrowsOnNullLiteral() {
        assertThrows(IbbParseException.class, () -> JsonUtils.deserializeArray("null", Sample[].class));
    }

    @Test
    void deserializeArrayThrowsOnMalformedJson() {
        assertThrows(IbbParseException.class, () -> JsonUtils.deserializeArray("[{", Sample[].class));
    }

    @Test
    void deserializeObjectWithTypeWorksOnWrappedGenericType() {
        Type type = TypeToken.getParameterized(List.class, Sample.class).getType();

        List<Sample> samples = JsonUtils.deserializeObject("[{\"Id\":3,\"Name\":\"c\"}]", type);

        assertEquals(1, samples.size());
        assertEquals(3, samples.get(0).id());
        assertEquals("c", samples.get(0).name());
    }

    @Test
    void deserializeObjectWithTypeThrowsOnMalformedJson() {
        Type type = TypeToken.getParameterized(List.class, Sample.class).getType();

        assertThrows(IbbParseException.class, () -> JsonUtils.deserializeObject("not-json{", type));
    }

    @Test
    void serializeAndRoundTrip() {
        String json = JsonUtils.serialize(new Sample(9, "round"));

        assertTrue(json.contains("\"Id\""));
        assertTrue(json.contains("\"Name\""));

        Sample roundTripped = JsonUtils.deserializeObject(json, Sample.class);
        assertEquals(new Sample(9, "round"), roundTripped);
    }
}
