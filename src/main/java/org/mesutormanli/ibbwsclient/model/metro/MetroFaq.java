package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul sıkça sorulan bir soruyu ve yanıtını temsil eder.
 */
public record MetroFaq(
    /** Sorunun kimliği. */
    @SerializedName("Id") int id,
    /** Soru metni. */
    @SerializedName("Question") String question,
    /** Yanıt metni. */
    @SerializedName("Answer") String answer
) {}
