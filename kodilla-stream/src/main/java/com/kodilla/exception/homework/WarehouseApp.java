package com.kodilla.exception.homework;

import java.util.HashMap;
import java.util.Map;

public class WarehouseApp {
    public static void main(String[] args) {

        int numberOfOrder = Order.addOrder();
        System.out.println("Number of order: " + numberOfOrder);
    }

    private Map<String, Integer> getOrder() {
            Map<String, Integer> orders = new HashMap<>();
            orders.put("Computer", 120);
            orders.put("Screen", 123);
            orders.put("Roller", 124);
            orders.put("Projector", 130);
            return orders;
        }

    public Integer isOrderExisted(String order) throws OrderDoesntExistException {
        if(getOrder().containsKey(order))
            return getOrder().get(order);
        throw new OrderDoesntExistException();
    }

}
