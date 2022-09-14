package javadev.service;

import javadev.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsList {
    static ArrayList<Product> products;
    static Product a = new Product("A", 1.25d, 3, 3);
    static Product b = new Product("B", 4.25, 0, 0);
    static Product c = new Product("C", 1, 6, 5);
    static Product d = new Product("D", 0.75, 0, 0);
    public static List<Product> allProducts() {
        products.add(a);
        products.add(b);
        products.add(c);
        products.add(d);

        return products;
    }
}