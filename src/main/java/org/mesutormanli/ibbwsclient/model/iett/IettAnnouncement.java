package org.mesutormanli.ibbwsclient.model.iett;

import com.google.gson.annotations.SerializedName;

/**
 * İETT bir duyuruyu temsil eder.
 */
public record IettAnnouncement(
    /** Duyuru başlığı. */
    @SerializedName("Baslik") String baslik,
    /** Duyuru içeriği. */
    @SerializedName("Icerik") String icerik,
    /** Tarih (API'nin döndürdüğü biçimde). */
    @SerializedName("Tarih") String tarih,
    /** Hat kodu. */
    @SerializedName("HatKodu") String hatKodu,
    /** Hat adı. */
    @SerializedName("HatAdi") String hatAdi
) {}
