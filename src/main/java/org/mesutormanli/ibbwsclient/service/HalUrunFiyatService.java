package org.mesutormanli.ibbwsclient.service;

import kong.unirest.Unirest;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.CategoriesServiceResponse;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.MarketsServiceResponse;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.MeasureTypesServiceResponse;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.ProductTypesServiceResponse;
import org.mesutormanli.ibbwsclient.service.base.BaseService;

import java.util.Date;

public class HalUrunFiyatService extends BaseService {

    private static final String HAL_URUN_FIYAT_SERVICE_BASE_URL = "https://halfiyatlaripublicdata.ibb.gov.tr/api/HalManager";
    private static final String CATEGORIES_URL = HAL_URUN_FIYAT_SERVICE_BASE_URL + "/getCategories";
    private static final String MARKETS_URL = HAL_URUN_FIYAT_SERVICE_BASE_URL + "/getMarkets";
    private static final String MEASURE_TYPES_URL = HAL_URUN_FIYAT_SERVICE_BASE_URL + "/getMeasureTypes";
    private static final String PRODUCT_TYPES_URL = HAL_URUN_FIYAT_SERVICE_BASE_URL + "/getProductTypes";
    private static final String PRODUCT_PRICE_BY_DAY_URL = HAL_URUN_FIYAT_SERVICE_BASE_URL + "/getProductPricebyDay";
    private static final String PRODUCT_PRICE_BY_DAY_AND_MARKET_URL = HAL_URUN_FIYAT_SERVICE_BASE_URL + "/getProductPricebyDayAndMarket";
    private static final String PRODUCT_PRICE_BY_PRODUCT_ID_URL = HAL_URUN_FIYAT_SERVICE_BASE_URL + "/getProductPricebyProductId";

    public CategoriesServiceResponse getCategories() {
        final String json = Unirest.get(CATEGORIES_URL)
                .asString().getBody();
        return gson.fromJson(json, CategoriesServiceResponse.class);
    }

    public MarketsServiceResponse getMarkets() {
        final String json = Unirest.get(MARKETS_URL)
                .asString().getBody();
        return gson.fromJson(json, MarketsServiceResponse.class);
    }

    public MeasureTypesServiceResponse getMeasureTypes() {
        final String json = Unirest.get(MEASURE_TYPES_URL)
                .asString().getBody();
        return gson.fromJson(json, MeasureTypesServiceResponse.class);
    }

    public ProductTypesServiceResponse getProductTypes() {
        final String json = Unirest.get(PRODUCT_TYPES_URL)
                .asString().getBody();
        return gson.fromJson(json, ProductTypesServiceResponse.class);
    }

    public String getProductPriceByDay(Date day) {
        //TODO: implement
        return null;
    }

    public String getProductPriceByDayAndMarket(Date day, int marketId) {
        //TODO: implement
        return null;
    }

    public String getProductPriceByProductId(String productId) {
        //TODO: implement
        return null;
    }

}
