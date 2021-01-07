package org.mesutormanli.ibbwsclient.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.CategoriesServiceResponse;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.MarketsServiceResponse;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.MeasureTypesServiceResponse;
import org.mesutormanli.ibbwsclient.model.halurunfiyat.ProductTypesServiceResponse;
import org.mesutormanli.ibbwsclient.service.base.BaseServiceTest;

import java.util.Collections;

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
        //TODO: implement
    }

    @Test
    void getProductPriceByDayAndMarket() {
        //TODO: implement
    }

    @Test
    void getProductPriceByProductId() {
        //TODO: implement
    }
}
