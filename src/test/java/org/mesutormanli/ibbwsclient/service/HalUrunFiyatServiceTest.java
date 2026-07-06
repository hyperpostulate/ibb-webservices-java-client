package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.*;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.time.LocalDate;

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
        final HalServiceResponse<ProductCategory> categories = halUrunFiyatService.getCategories();
        assertNotNull(categories);
        assertTrue(categories.results() != null && !categories.results().isEmpty());
        System.out.println(categories);
    }

    @Test
    void getMarkets() {
        final HalServiceResponse<Market> markets = halUrunFiyatService.getMarkets();
        assertNotNull(markets);
        assertTrue(markets.results() != null && !markets.results().isEmpty());
        System.out.println(markets);
    }

    @Test
    void getMeasureTypes() {
        final HalServiceResponse<MeasureType> measureTypes = halUrunFiyatService.getMeasureTypes();
        assertNotNull(measureTypes);
        assertTrue(measureTypes.results() != null && !measureTypes.results().isEmpty());
        System.out.println(measureTypes);
    }

    @Test
    void getProductTypes() {
        final HalServiceResponse<ProductType> productTypes = halUrunFiyatService.getProductTypes();
        assertNotNull(productTypes);
        assertTrue(productTypes.results() != null && !productTypes.results().isEmpty());
        System.out.println(productTypes);
    }

    @Test
    void getProductPriceByDay() {
        final LocalDate day = LocalDate.now().minusDays(1);
        final HalServiceResponse<ProductPrice> products = halUrunFiyatService.getProductPriceByDay(day);
        assertNotNull(products);
        System.out.println(products);
    }

    @Test
    void getProductPriceByDayAndMarket() {
        final LocalDate day = LocalDate.now().minusDays(1);
        final HalServiceResponse<ProductPrice> products = halUrunFiyatService.getProductPriceByDayAndMarket(day, 1);
        assertNotNull(products);
        System.out.println(products);
    }

    @Test
    void getProductPriceByProductId() {
        final String productId = "433e77c9-1d4d-4cb5-a817-2ece82eb9bf9";
        final HalServiceResponse<ProductPrice> products = halUrunFiyatService.getProductPriceByProductId(productId);
        assertNotNull(products);
        System.out.println(products);
    }
}
