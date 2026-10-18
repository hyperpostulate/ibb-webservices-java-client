package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir hat projesini temsil eder.
 */
public record MetroLineProject(
    /** Projenin kimliği. */
    @SerializedName("Id") int id,
    /** Proje adı. */
    @SerializedName("Name") String name,
    /** Proje açıklaması. */
    @SerializedName("Description") String description,
    /** Proje görselinin adresi. */
    @SerializedName("ImageUrl") String imageUrl,
    /** Proje başlangıç tarihi (API'nin döndürdüğü biçimde). */
    @SerializedName("StartDate") String startDate,
    /** Proje bitiş tarihi (API'nin döndürdüğü biçimde). */
    @SerializedName("EndDate") String endDate,
    /** İlerleme oranı. */
    @SerializedName("Progress") int progress
) {}
