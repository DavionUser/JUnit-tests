package javadev.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {
    private Discount discount = new Discount();

    @Test
    void testGetDiscountForAMustBeEquals() {
        //given
        int currentCount = 3;
        //when
        double actual = discount.getDiscountForA(currentCount);
        //then
        double expected = 3.00d;

        assertEquals(actual, expected);
    }

    @Test
    void testGetDiscountForCMustBeNotEquals() {
        //given
        int currentCount = 6;
        //when
        double actual = discount.getDiscountForC(currentCount);
        //then
        double expected = 6.00d;

        assertNotEquals(actual, expected);
    }
}