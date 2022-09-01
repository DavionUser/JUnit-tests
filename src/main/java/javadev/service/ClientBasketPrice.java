package javadev.service;

import java.util.List;
import java.util.Map;

import static javadev.service.Products.productsToMap;

public class ClientBasketPrice {
    ProductsPrice price = new ProductsPrice();
    Discount discount = new Discount();
    List<String> buyerProducts;
    public double calculateTotalCost(String basket) {
        buyerProducts = List.of(basket.split(""));
        Map<String, Long> map = productsToMap(buyerProducts);
        int aQuantity = map.get(Products.productA).intValue();
        int bQuantity = map.get(Products.productB).intValue();
        int cQuantity = map.get(Products.productC).intValue();
        int dQuantity = map.get(Products.productD).intValue();

        double totalCost = discount.getDiscountForA(aQuantity)
                + bQuantity * price.getPrice(Products.productB)
                + discount.getDiscountForC(cQuantity)
                + dQuantity * price.getPrice(Products.productD);
        return totalCost;
    }
}