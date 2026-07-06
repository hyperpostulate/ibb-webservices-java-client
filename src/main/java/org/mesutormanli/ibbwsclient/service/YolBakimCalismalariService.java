package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.yolbakim.YolBakimData;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.util.List;

public class YolBakimCalismalariService extends BaseService {

    public List<YolBakimData> getRoadMaintenanceWorks() {
        String json = executeGet(IbbClientConfig.YOL_BAKIM);
        return JsonUtils.deserializeArray(json, YolBakimData[].class);
    }
}
