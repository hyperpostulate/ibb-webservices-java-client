package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroNews(
    @SerializedName("Id") int id,
    @SerializedName("Title") String title,
    @SerializedName("Content") String content
) {}
