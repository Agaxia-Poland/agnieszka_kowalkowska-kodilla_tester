package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {

    private static Set<Order> orderList = new HashSet<>();

    public static Order addOrder(Order order) {
        orderList.add(order);
        System.out.println("Order" + order + " added.");
        return order;
    }

    public static void getOrder(Order order, String number) {
        System.out.println("Get order" + number);
        orderList
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .forEach(o -> System.out.println("Found order: " + o));

        try {
            throw new OrderDoesntExistException();
        } catch (OrderDoesntExistException e) {
            System.out.println("Not found");
        } finally {
            System.out.println(orderList);
        }
    }
}
