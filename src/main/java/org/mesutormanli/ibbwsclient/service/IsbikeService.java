package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.isbike.IsbikeServiceResponse;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

public class IsbikeService extends BaseService {

    public IsbikeServiceResponse getAllStationStatus() {
        String json = executePost(IbbClientConfig.ISBIKE_ALL_STATION_STATUS, "");
        return JsonUtils.deserializeObject(json, IsbikeServiceResponse.class);
    }

    public IsbikeServiceResponse getStationStatus(int guid) {
        String body = JsonUtils.serialize(java.util.Map.of("guid", String.valueOf(guid)));
        String json = executePost(IbbClientConfig.ISBIKE_STATION_STATUS, body);
        return JsonUtils.deserializeObject(json, IsbikeServiceResponse.class);
    }
}
