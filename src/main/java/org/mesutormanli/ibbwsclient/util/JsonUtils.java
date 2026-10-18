package org.mesutormanli.ibbwsclient.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import org.mesutormanli.ibbwsclient.exception.IbbParseException;

import java.util.Arrays;
import java.util.List;

/**
 * Paylaşılan Gson örneği ve JSON serileştirme/ayrıştırma yardımcıları.
 * <p>
 * Ayrıştırma hataları {@link IbbParseException} olarak sarmalanır.
 */
public final class JsonUtils {

    private static final Gson GSON = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    private JsonUtils() {
    }

    /**
     * Paylaşılan Gson örneğini döndürür.
     *
     * @return paylaşılan Gson örneği
     */
    public static Gson gson() {
        return GSON;
    }

    /**
     * JSON dizisini bir listeye ayrıştırır.
     * <p>
     * Dönen liste {@link Arrays#asList} sözleşmesine uyar: sabit boyutludur, yapısal değişikliklere izin vermez.
     *
     * @param json ayrıştırılacak JSON dizisi
     * @param arrayClass dizi öğelerinin sınıfı
     * @param <T> liste öğelerinin türü
     * @return ayrıştırılmış liste
     */
    public static <T> List<T> deserializeArray(String json, Class<T[]> arrayClass) {
        T[] array = deserialize(json, arrayClass, arrayClass.getSimpleName());
        return Arrays.asList(array);
    }

    /**
     * JSON'u verilen sınıfa ayrıştırır.
     *
     * @param json ayrıştırılacak JSON
     * @param classOfT hedef sınıf
     * @param <T> hedef tür
     * @return ayrıştırılmış nesne
     */
    public static <T> T deserializeObject(String json, Class<T> classOfT) {
        return deserialize(json, classOfT, classOfT.getSimpleName());
    }

    /**
     * JSON'u verilen türe ayrıştırır.
     *
     * @param json ayrıştırılacak JSON
     * @param type hedef tür
     * @param <T> hedef tür
     * @return ayrıştırılmış nesne
     */
    public static <T> T deserializeObject(String json, java.lang.reflect.Type type) {
        return deserialize(json, type, type.toString());
    }

    /**
     * Bir nesneyi JSON dizesine serileştirir.
     *
     * @param object serileştirilecek nesne
     * @return JSON dizesi
     */
    public static String serialize(Object object) {
        return GSON.toJson(object);
    }

    /**
     * Boş yanıtları reddederek JSON'u verilen türe ayrıştırır.
     */
    private static <T> T deserialize(String json, java.lang.reflect.Type type, String typeDescription) {
        if (json == null || json.isBlank()) {
            throw new IbbParseException("Empty response body for " + typeDescription);
        }
        T result;
        try {
            result = GSON.fromJson(json, type);
        } catch (JsonParseException e) {
            throw new IbbParseException(
                    "Failed to parse response as " + typeDescription + ": " + truncate(json, 256), e);
        }
        if (result == null) {
            throw new IbbParseException("Response body parsed to null: " + truncate(json, 256));
        }
        return result;
    }

    /**
     * Bir dizeyi en fazla verilen uzunlukta keser.
     */
    private static String truncate(String s, int max) {
        return s.length() <= max ? s : s.substring(0, max);
    }
}
