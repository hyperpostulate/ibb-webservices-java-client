package org.mesutormanli.ibbwsclient.model.halurunfiyat;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record MarketsServiceResponse(
    @SerializedName("ResponseStatus") Boolean responseStatus,
    @SerializedName("ErrorGUID") String errorGUID,
    @SerializedName("Message") String message,
    @SerializedName("Results") List<Market> results
) {}
