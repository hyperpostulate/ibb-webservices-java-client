package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.*;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.Date;

class HalUrunFiyatServiceTest extends BaseServiceTest {

    private HalUrunFiyatService halUrunFiyatService;

    @BeforeEach
    void setUp() {
        halUrunFiyatService = new HalUrunFiyatService();
    }

    @Test
    void getCategories() {
        final CategoriesServiceResponse categories = halUrunFiyatService.getCategories();
        printResult(Collections.singletonList(categories));
    }

    @Test
    void getMarkets() {
        final MarketsServiceResponse markets = halUrunFiyatService.getMarkets();
        printResult(Collections.singletonList(markets));
    }

    @Test
    void getMeasureTypes() {
        final MeasureTypesServiceResponse measureTypes = halUrunFiyatService.getMeasureTypes();
        printResult(Collections.singletonList(measureTypes));
    }

    @Test
    void getProductTypes() {
        final ProductTypesServiceResponse productTypes = halUrunFiyatService.getProductTypes();
        printResult(Collections.singletonList(productTypes));
    }

    @Test
    void getProductPriceByDay() {
        final Date day = Date.from(Instant.now().minus(Duration.ofDays(1L)));
        final ProductPriceServiceResponse products = halUrunFiyatService.getProductPriceByDay(day);
        printResult(Collections.singletonList(products));
    }

    @Test
    void getProductPriceByDayAndMarket() {
        final Date day = Date.from(Instant.now().minus(Duration.ofDays(1L)));
        final ProductPriceServiceResponse products = halUrunFiyatService.getProductPriceByDayAndMarket(day, 1);
        printResult(Collections.singletonList(products));
    }

    @Test
    void getProductPriceByProductId() {
        final String productId = "433e77c9-1d4d-4cb5-a817-2ece82eb9bf9";
        final ProductPriceServiceResponse products = halUrunFiyatService.getProductPriceByProductId(productId);
        printResult(Collections.singletonList(products));
    }
}
