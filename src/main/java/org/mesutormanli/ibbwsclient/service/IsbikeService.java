package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.isbike.IsbikeServiceResponse;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

public class IsbikeService extends BaseService {

    public IsbikeServiceResponse getAllStationStatus() {
        String json = executePost(IbbClientConfig.ISBIKE_ALL_STATION_STATUS, "");
        return deserializeObject(json, IsbikeServiceResponse.class);
    }

    public IsbikeServiceResponse getStationStatus(int guid) {
        String body = gson.toJson(java.util.Map.of("guid", String.valueOf(guid)));
        String json = executePost(IbbClientConfig.ISBIKE_STATION_STATUS, body);
        return deserializeObject(json, IsbikeServiceResponse.class);
    }
}
