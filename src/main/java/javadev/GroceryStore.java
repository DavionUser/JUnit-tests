package javadev;

import javadev.service.ClientBasketPrice;

public class GroceryStore {
    public static String basket = "ACCCCCBCDABA";
    public static void main(String[] args) {
        ClientBasketPrice store = new ClientBasketPrice();
        System.out.println(store.calculateTotalCost(basket));
    }
}
