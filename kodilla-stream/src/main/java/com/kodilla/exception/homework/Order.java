package com.kodilla.exception.homework;

public class Order {
    private static int numberOfOrder;
    String number;

    public Order(String number) {
        this.number = number;

    }

    public static int addOrder() {
        return numberOfOrder;
    }

    public String getNumber() {
        return number;
    }
}
