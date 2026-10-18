package org.mesutormanli.ibbwsclient.service;

import com.google.gson.reflect.TypeToken;
import org.mesutormanli.ibbwsclient.config.IbbClientConfig;
import org.mesutormanli.ibbwsclient.exception.IbbClientException;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.*;
import org.mesutormanli.ibbwsclient.service.base.BaseService;
import org.mesutormanli.ibbwsclient.util.JsonUtils;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * İBB Hal Fiyatları API'si sarmalayıcısı.
 */
public class HalUrunFiyatService extends BaseService {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * Bir Hal API JSON yanıtını verilen öğe türüyle ayrıştırır ve ResponseStatus başarısızlıklarını denetler.
     */
    private <T> HalServiceResponse<T> deserializeHalResponse(String json, Class<T> elementClass) {
        Type type = TypeToken.getParameterized(HalServiceResponse.class, elementClass).getType();
        HalServiceResponse<T> response = JsonUtils.deserializeObject(json, type);
        if (response == null) {
            throw new IbbClientException("Hal API returned null response");
        }
        if (Boolean.FALSE.equals(response.responseStatus())) {
            throw new IbbClientException("Hal API returned failure: " + response.message()
                    + (response.errorGUID() != null ? " (ErrorGUID: " + response.errorGUID() + ")" : ""));
        }
        return response;
    }

    /**
     * Ürün kategorilerini döndürür.
     *
     * @return kategori yanıtı
     * @throws IbbClientException ağ, HTTP veya parse hatalarında ve ResponseStatus=false olduğunda
     */
    public HalServiceResponse<ProductCategory> getCategories() {
        String json = executeGet(IbbClientConfig.HAL_CATEGORIES);
        return deserializeHalResponse(json, ProductCategory.class);
    }

    /**
     * Marketleri döndürür.
     *
     * @return market yanıtı
     * @throws IbbClientException ağ, HTTP veya parse hatalarında ve ResponseStatus=false olduğunda
     */
    public HalServiceResponse<Market> getMarkets() {
        String json = executeGet(IbbClientConfig.HAL_MARKETS);
        return deserializeHalResponse(json, Market.class);
    }

    /**
     * Ölçü türlerini döndürür.
     *
     * @return ölçü türü yanıtı
     * @throws IbbClientException ağ, HTTP veya parse hatalarında ve ResponseStatus=false olduğunda
     */
    public HalServiceResponse<MeasureType> getMeasureTypes() {
        String json = executeGet(IbbClientConfig.HAL_MEASURE_TYPES);
        return deserializeHalResponse(json, MeasureType.class);
    }

    /**
     * Ürün türlerini döndürür.
     *
     * @return ürün türü yanıtı
     * @throws IbbClientException ağ, HTTP veya parse hatalarında ve ResponseStatus=false olduğunda
     */
    public HalServiceResponse<ProductType> getProductTypes() {
        String json = executeGet(IbbClientConfig.HAL_PRODUCT_TYPES);
        return deserializeHalResponse(json, ProductType.class);
    }

    /**
     * Verilen gün için ürün fiyatlarını döndürür.
     *
     * @param day sorgulanacak gün
     * @return ürün fiyatı yanıtı
     * @throws IbbClientException ağ, HTTP veya parse hatalarında ve ResponseStatus=false olduğunda
     */
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

    /**
     * Verilen gün ve market için ürün fiyatlarını döndürür.
     *
     * @param day sorgulanacak gün
     * @param marketId market kimliği (isteğe bağlı; null ise filtrelenmez)
     * @return ürün fiyatı yanıtı
     * @throws IbbClientException ağ, HTTP veya parse hatalarında ve ResponseStatus=false olduğunda
     */
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

    /**
     * Verilen ürün kimliği için ürün fiyatlarını döndürür.
     *
     * @param productId ürün kimliği
     * @return ürün fiyatı yanıtı
     * @throws IbbClientException ağ, HTTP veya parse hatalarında ve ResponseStatus=false olduğunda
     */
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
