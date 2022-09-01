package javadev.service;

public class ProductsPrice {
    private final double priceA = 1.25d;
    private final double priceB = 4.25d;
    private final double priceC = 1.00d;
    private final double priceD = 0.75d;

    public double getPrice(String product) {
        if (product.equals(Products.productA)) {
            return priceA;
        } if (product.equals(Products.productB)) {
            return priceB;
        } if (product.equals(Products.productC)) {
            return priceC;
        } if (product.equals(Products.productD)) {
            return priceD;
        }
        return 0;
    }
}
