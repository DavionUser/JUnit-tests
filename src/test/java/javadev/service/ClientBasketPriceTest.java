package javadev.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientBasketPriceTest {
    private final ClientBasketPrice clientBasketPrice = new ClientBasketPrice();

    @Test
    void testCalculateTotalCostShouldBeOk() {
        //given
        String basket = "AAAA";
        //when
        double actualPrice = clientBasketPrice.calculateTotalCost(basket);
        //then
        double expectedPrice = 4.25d;
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    void testCalculateTotalCostShouldBeNotEquals() {
        //given
        String basket1 = "VVV";
        //when
        double actualPrice1 = clientBasketPrice.calculateTotalCost(basket1);
        //then
        double expectedPrice1 = 0d;
        assertEquals(expectedPrice1, actualPrice1);
    }

    @Test
    void testCalculateTotalCostShouldBeEquals() {
        //given
        String basket1 = "CCCCCC";
        //when
        double actualPrice1 = clientBasketPrice.calculateTotalCost(basket1);
        //then
        double expectedPrice1 = 5d;
        assertEquals(expectedPrice1, actualPrice1);
    }
}