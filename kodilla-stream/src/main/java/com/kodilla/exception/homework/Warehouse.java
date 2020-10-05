package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Warehouse {
    public ArrayList<Order> orderList =  new ArrayList<>();
    public Order addOrder(Order order){
        orderList.add(order);
        return order;
    }
    public Stream<Order> getOrder(Order order) throws OrderDoesntExistException{
        Stream<Order> stream1 = orderList.stream();
        Stream<Order> streamFiltered = stream1.filter(n -> n.equals(addOrder(order)));
        if(orderList.isEmpty()){
            throw new OrderDoesntExistException();
        }
        return streamFiltered;
    }

}

