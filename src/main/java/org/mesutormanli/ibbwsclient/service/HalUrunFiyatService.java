package org.mesutormanli.ibbwsclient.service;

import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.*;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;

public class HalUrunFiyatService extends BaseService {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public CategoriesServiceResponse getCategories() {
        String json = executeGet(IbbClientConfig.HAL_CATEGORIES);
        return deserializeObject(json, CategoriesServiceResponse.class);
    }

    public MarketsServiceResponse getMarkets() {
        String json = executeGet(IbbClientConfig.HAL_MARKETS);
        return deserializeObject(json, MarketsServiceResponse.class);
    }

    public MeasureTypesServiceResponse getMeasureTypes() {
        String json = executeGet(IbbClientConfig.HAL_MEASURE_TYPES);
        return deserializeObject(json, MeasureTypesServiceResponse.class);
    }

    public ProductTypesServiceResponse getProductTypes() {
        String json = executeGet(IbbClientConfig.HAL_PRODUCT_TYPES);
        return deserializeObject(json, ProductTypesServiceResponse.class);
    }

    public ProductPriceServiceResponse getProductPriceByDay(Date day) {
        String dateStr = day.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().format(DATE_FORMATTER);
        String body = gson.toJson(Map.of("item", Map.of("Day", dateStr)));
        String json = executePost(IbbClientConfig.HAL_PRODUCT_PRICE_BY_DAY, body);
        return deserializeObject(json, ProductPriceServiceResponse.class);
    }

    public ProductPriceServiceResponse getProductPriceByDayAndMarket(Date day, Integer marketId) {
        String dateStr = day.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().format(DATE_FORMATTER);
        String body = gson.toJson(Map.of("item", Map.of("Day", dateStr, "MarketId", marketId)));
        String json = executePost(IbbClientConfig.HAL_PRODUCT_PRICE_BY_DAY_AND_MARKET, body);
        return deserializeObject(json, ProductPriceServiceResponse.class);
    }

    public ProductPriceServiceResponse getProductPriceByProductId(String productId) {
        String body = gson.toJson(Map.of("item", Map.of("TabelaGId", productId)));
        String json = executePost(IbbClientConfig.HAL_PRODUCT_PRICE_BY_PRODUCT_ID, body);
        return deserializeObject(json, ProductPriceServiceResponse.class);
    }
}
