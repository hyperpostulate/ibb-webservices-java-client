package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir haber kaydını temsil eder.
 */
public record MetroNews(
    /** Haberin kimliği. */
    @SerializedName("Id") int id,
    /** Haber başlığı. */
    @SerializedName("Title") String title,
    /** Haber içeriği. */
    @SerializedName("Content") String content
) {}
