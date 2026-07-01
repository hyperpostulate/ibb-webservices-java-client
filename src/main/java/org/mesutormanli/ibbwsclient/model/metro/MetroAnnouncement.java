package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroAnnouncement(
    @SerializedName("Id") int id,
    @SerializedName("Title") String title,
    @SerializedName("Content") String content,
    @SerializedName("Date") String date,
    @SerializedName("ImageUrl") String imageUrl
) {}
