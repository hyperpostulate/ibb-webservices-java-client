package org.mesutormanli.ibbwsclient.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class JsonUtils {

    private static final Gson GSON = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    private JsonUtils() {
    }

    public static Gson gson() {
        return GSON;
    }

    public static <T> List<T> deserializeArray(String json, Class<T[]> arrayClass) {
        T[] array = GSON.fromJson(json, arrayClass);
        return array != null ? Arrays.asList(array) : Collections.emptyList();
    }

    public static <T> T deserializeObject(String json, Class<T> classOfT) {
        return GSON.fromJson(json, classOfT);
    }

    public static <T> T deserializeObject(String json, java.lang.reflect.Type type) {
        return GSON.fromJson(json, type);
    }

    public static String serialize(Object object) {
        return GSON.toJson(object);
    }
}
