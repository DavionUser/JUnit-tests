package javadev.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsPriceTest {
    private ProductsPrice productsPrice = new ProductsPrice();

    @Test
    void testGetPriceShouldBeOk() {
        //given
        String product = "V";
        //when
        double actual = productsPrice.getPrice(product);
        //then
        double expected = 0d;

        assertEquals(actual, expected);

    }
}