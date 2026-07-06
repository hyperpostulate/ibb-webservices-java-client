package org.mesutormanli.ibbwsclient.service;

import com.google.gson.reflect.TypeToken;
import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.*;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class HalUrunFiyatService extends BaseService {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private <T> HalServiceResponse<T> deserializeHalResponse(String json, Class<T> elementClass) {
        Type type = TypeToken.getParameterized(HalServiceResponse.class, elementClass).getType();
        return JsonUtils.deserializeObject(json, type);
    }

    public HalServiceResponse<ProductCategory> getCategories() {
        String json = executeGet(IbbClientConfig.HAL_CATEGORIES);
        return deserializeHalResponse(json, ProductCategory.class);
    }

    public HalServiceResponse<Market> getMarkets() {
        String json = executeGet(IbbClientConfig.HAL_MARKETS);
        return deserializeHalResponse(json, Market.class);
    }

    public HalServiceResponse<MeasureType> getMeasureTypes() {
        String json = executeGet(IbbClientConfig.HAL_MEASURE_TYPES);
        return deserializeHalResponse(json, MeasureType.class);
    }

    public HalServiceResponse<ProductType> getProductTypes() {
        String json = executeGet(IbbClientConfig.HAL_PRODUCT_TYPES);
        return deserializeHalResponse(json, ProductType.class);
    }

    public HalServiceResponse<ProductPrice> getProductPriceByDay(LocalDate day) {
        if (day == null) {
            throw new IllegalArgumentException("day must not be null");
        }
        String dateStr = day.format(DATE_FORMATTER);
        var item = new HashMap<String, String>();
        item.put("Day", dateStr);
        var body = Map.of("item", item);
        String json = executePost(IbbClientConfig.HAL_PRODUCT_PRICE_BY_DAY, JsonUtils.serialize(body));
        return deserializeHalResponse(json, ProductPrice.class);
    }

    public HalServiceResponse<ProductPrice> getProductPriceByDayAndMarket(LocalDate day, Integer marketId) {
        if (day == null) {
            throw new IllegalArgumentException("day must not be null");
        }
        String dateStr = day.format(DATE_FORMATTER);
        var item = new HashMap<String, Object>();
        item.put("Day", dateStr);
        if (marketId != null) {
            item.put("MarketId", marketId);
        }
        var body = Map.of("item", item);
        String json = executePost(IbbClientConfig.HAL_PRODUCT_PRICE_BY_DAY_AND_MARKET, JsonUtils.serialize(body));
        return deserializeHalResponse(json, ProductPrice.class);
    }

    public HalServiceResponse<ProductPrice> getProductPriceByProductId(String productId) {
        if (productId == null) {
            throw new IllegalArgumentException("productId must not be null");
        }
        var item = new HashMap<String, String>();
        item.put("TabelaGId", productId);
        var body = Map.of("item", item);
        String json = executePost(IbbClientConfig.HAL_PRODUCT_PRICE_BY_PRODUCT_ID, JsonUtils.serialize(body));
        return deserializeHalResponse(json, ProductPrice.class);
    }
}
