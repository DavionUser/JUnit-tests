package javadev.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientBasketPriceTest {
    private ClientBasketPrice clientBasketPrice = new ClientBasketPrice();

    @Test
    void testCalculateTotalCostShouldBeOk() {
        //given
        String basket = "ABCD";
        //when
        double actualPrice = clientBasketPrice.calculateTotalCost(basket);
        //then
        double expectedPrice = 7.25d;
        assertEquals(expectedPrice, actualPrice);
    }


}