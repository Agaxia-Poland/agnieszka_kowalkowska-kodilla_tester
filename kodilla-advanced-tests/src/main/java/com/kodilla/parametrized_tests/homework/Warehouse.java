package com.kodilla.parametrized_tests.homework;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Warehouse {
    public static ArrayList<Order> orderList =  new ArrayList<>();
    public Order addOrder(Order order){
        orderList.add(order);
        return order;
    }
    public Stream<Order> getOrder(String number) throws OrderDoesntExistException {
        orderList.stream()
                .filter(n -> n.getNumber().equals(number))
                .forEach(o -> System.out.println("Found order: " + o));
        //Stream<Order> orderStream = orderList.stream();
        if(orderList.isEmpty()){
            throw new OrderDoesntExistException();
        }
        return orderList.stream();
    }

}
