package javadev.service;

import javadev.model.Product;

public class Discount {
    double priceAfterDiscount;

    public double priceWithDiscount(int quantity, Product product) {

        if (product.getDiscountQuantity() != 0) {
            int outOfDiscount = quantity % product.getDiscountQuantity();
            if (outOfDiscount == 0) {
                priceAfterDiscount = quantity / product.getDiscountQuantity() * product.getDiscountPrice();
            } else {
                priceAfterDiscount = (quantity - outOfDiscount) / product.getDiscountQuantity()
                        * product.getDiscountPrice() + outOfDiscount * product.getPrice();
            }
        } else {
            priceAfterDiscount = quantity * product.getPrice();
        }
        return priceAfterDiscount;
    }
}