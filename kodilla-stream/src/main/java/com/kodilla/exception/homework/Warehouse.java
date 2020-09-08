package com.kodilla.exception.homework;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Integer> getOrders() {
        Map<String, Integer> orders = new HashMap<>();
        orders.put("Order1", 1);
        orders.put("Order2", 2);
        orders.put("Order3", 3);
        orders.put("Order4", 4);
        return orders;
    }

    public static void main(String[] args) {
    }
}
