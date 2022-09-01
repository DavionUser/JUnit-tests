package javadev.service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Products {
    public static String productA = "A";
    public static String productB = "B";
    public static String productC = "C";
    public static String productD = "D";

    public static Map<String, Long> productsToMap(List<String> buyerProducts) {
        return buyerProducts.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}