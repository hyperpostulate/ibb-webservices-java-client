package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul tarafından düzenlenen bir etkinliği temsil eder.
 */
public record MetroActivity(
    /** Etkinliğin kimliği. */
    @SerializedName("Id") int id,
    /** Etkinlik adı. */
    @SerializedName("Name") String name,
    /** Etkinlik açıklaması. */
    @SerializedName("Description") String description,
    /** Etkinlik görselinin adresi. */
    @SerializedName("ImageUrl") String imageUrl,
    /** Etkinlik başlangıç tarihi (API'nin döndürdüğü biçimde). */
    @SerializedName("StartDate") String startDate,
    /** Etkinlik bitiş tarihi (API'nin döndürdüğü biçimde). */
    @SerializedName("EndDate") String endDate
) {}
