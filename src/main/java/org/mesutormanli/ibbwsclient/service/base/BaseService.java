package org.mesutormanli.ibbwsclient.service.base;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.metro.MetroServiceResponse;

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
