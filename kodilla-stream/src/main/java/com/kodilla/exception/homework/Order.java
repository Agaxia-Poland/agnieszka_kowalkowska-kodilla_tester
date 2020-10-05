package com.kodilla.exception.homework;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private String number;
    public Order(String number){
        this.number = number;
    }
    public String getNumber(){
        return this.number;
    }

    private Map<String, Boolean> getOrder() {
        Map<String, Boolean> orders = new HashMap<>();
        orders.put("Order1", true);
        orders.put("Order2", true);
        orders.put("Order3", false);
        orders.put("Order4", true);
        return orders;
    }

    public Object doesOrderExists(String order) throws OrderDoesntExistException {
        if(getOrder().containsKey(order))
            return getOrder().get(order);
        throw new OrderDoesntExistException();
    }


}
