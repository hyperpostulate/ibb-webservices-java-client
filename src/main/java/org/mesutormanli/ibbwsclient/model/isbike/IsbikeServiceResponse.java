package org.mesutormanli.ibbwsclient.model.isbike;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record IsbikeServiceResponse(
    @SerializedName("serviceCode") int serviceCode,
    @SerializedName("serviceDesc") String serviceDesc,
    @SerializedName("dataList") List<IsbikeStation> dataList
) {}
