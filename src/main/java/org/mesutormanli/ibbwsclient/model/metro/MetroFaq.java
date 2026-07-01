package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroFaq(
    @SerializedName("Id") int id,
    @SerializedName("Question") String question,
    @SerializedName("Answer") String answer
) {}
