package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.*;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HalUrunFiyatServiceTest extends BaseServiceTest {

    private HalUrunFiyatService halUrunFiyatService;

    @BeforeEach
    void setUp() {
        halUrunFiyatService = new HalUrunFiyatService();
    }

    @Test
    void getCategories() {
        final CategoriesServiceResponse categories = halUrunFiyatService.getCategories();
        assertNotNull(categories);
        assertTrue(categories.getResponseStatus() != null ? categories.getResponseStatus() : true);
        System.out.println(categories);
    }

    @Test
    void getMarkets() {
        final MarketsServiceResponse markets = halUrunFiyatService.getMarkets();
        assertNotNull(markets);
        assertTrue(markets.getResponseStatus() != null ? markets.getResponseStatus() : true);
        System.out.println(markets);
    }

    @Test
    void getMeasureTypes() {
        final MeasureTypesServiceResponse measureTypes = halUrunFiyatService.getMeasureTypes();
        assertNotNull(measureTypes);
        assertTrue(measureTypes.getResponseStatus() != null ? measureTypes.getResponseStatus() : true);
        System.out.println(measureTypes);
    }

    @Test
    void getProductTypes() {
        final ProductTypesServiceResponse productTypes = halUrunFiyatService.getProductTypes();
        assertNotNull(productTypes);
        assertTrue(productTypes.getResponseStatus() != null ? productTypes.getResponseStatus() : true);
        System.out.println(productTypes);
    }

    @Test
    void getProductPriceByDay() {
        final Date day = Date.from(Instant.now().minus(Duration.ofDays(1L)));
        final ProductPriceServiceResponse products = halUrunFiyatService.getProductPriceByDay(day);
        assertNotNull(products);
        System.out.println(products);
    }

    @Test
    void getProductPriceByDayAndMarket() {
        final Date day = Date.from(Instant.now().minus(Duration.ofDays(1L)));
        final ProductPriceServiceResponse products = halUrunFiyatService.getProductPriceByDayAndMarket(day, 1);
        assertNotNull(products);
        System.out.println(products);
    }

    @Test
    void getProductPriceByProductId() {
        final String productId = "433e77c9-1d4d-4cb5-a817-2ece82eb9bf9";
        final ProductPriceServiceResponse products = halUrunFiyatService.getProductPriceByProductId(productId);
        assertNotNull(products);
        System.out.println(products);
    }
}
