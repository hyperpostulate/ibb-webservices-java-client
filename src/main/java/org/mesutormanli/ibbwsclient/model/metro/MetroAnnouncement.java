package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul duyurusunu temsil eder.
 */
public record MetroAnnouncement(
    /** Duyurunun kimliği. */
    @SerializedName("Id") int id,
    /** Duyuru başlığı. */
    @SerializedName("Title") String title,
    /** Duyuru içeriği. */
    @SerializedName("Content") String content,
    /** Duyuru tarihi (API'nin döndürdüğü biçimde). */
    @SerializedName("Date") String date,
    /** Duyuru görselinin adresi. */
    @SerializedName("ImageUrl") String imageUrl
) {}
