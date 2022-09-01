package javadev.service;

import static javadev.service.Products.*;

public class Discount {
    ProductsPrice productsPrice = new ProductsPrice();
    private int discountQuantityForA = 3;
    private int discountQuantityForC = 6;
    private double discountPriceForA = 3.00d;
    private double discountPriceForC = 5.00d;
    public double getDiscountForA(int productQuantity) {
        if (productQuantity == discountQuantityForA) {
            return discountPriceForA;
        }
        return productQuantity * productsPrice.getPrice(productA);
    }

    public double getDiscountForC(int productQuantity) {
        if (productQuantity == discountQuantityForC) {
            return discountPriceForC;
        }
        return productQuantity * productsPrice.getPrice(productC);
    }
}