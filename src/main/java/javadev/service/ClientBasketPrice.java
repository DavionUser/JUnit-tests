package javadev.service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static javadev.service.ProductsList.*;

public class ClientBasketPrice {
    double totalPrice;
    Discount discount = new Discount();
    List<String> buyerProducts;

    public double calculateTotalCost(String basket) {
        buyerProducts = List.of(basket.split(""));
        Map<String, Long> map = productsToMap(buyerProducts);

        for(Map.Entry<String, Long> entry: map.entrySet()) {
            String key = entry.getKey();
            if (!key.equals(a.getName()) && !key.equals(b.getName())
                    && !key.equals(c.getName()) && !key.equals(d.getName())) {
                System.out.println("Product " + key + " is not in the store list");
            }
        }

        if (map.containsKey(a.getName())) {
            totalPrice = totalPrice +
                    discount.priceWithDiscount(map.get(a.getName()).intValue(), a);
        }
        if (map.containsKey(b.getName())) {
            totalPrice = totalPrice +
                    discount.priceWithDiscount(map.get(b.getName()).intValue(),b);
        }
        if (map.containsKey(c.getName())) {
            totalPrice = totalPrice +
                    discount.priceWithDiscount(map.get(c.getName()).intValue(), c);
        }
        if (map.containsKey(d.getName())) {
            totalPrice = totalPrice +
                    discount.priceWithDiscount(map.get(d.getName()).intValue(),d);
        }
        return totalPrice;
    }

    private static Map<String, Long> productsToMap(List<String> buyerProducts) {
        return buyerProducts.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}