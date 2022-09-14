package javadev.service;

import javadev.model.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductsListTest {
    Product product = new Product();


    @Test
    void testAllProductsShouldBeEquals() {
        Product product1 = new Product("A", 1.25, 3, 3);
        Product product2 = new Product("B", 4.25, 0, 0);
        Product product3 = new Product("C", 1, 6, 5);
        Product product4 = new Product("D", 0.75, 0, 0);

        product.setName("A");
        product.setPrice(1.25);
        product.setDiscountQuantity(3);
        product.setDiscountPrice(3);

        List<Product> expected = new ArrayList<>();
        expected.add(product);
        expected.add(ProductsList.b);
        expected.add(ProductsList.c);
        expected.add(ProductsList.d);

        List<Product> actual = new ArrayList<>();
        actual.add(product1);
        actual.add(product2);
        actual.add(product3);
        actual.add(product4);

        assertEquals(expected, actual);

        assertEquals(product, product1);
    }
}