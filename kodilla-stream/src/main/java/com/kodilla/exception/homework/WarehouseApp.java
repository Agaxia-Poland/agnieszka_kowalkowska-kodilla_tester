package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args){
        Order o1 = new Order("1");
        Order o2 = new Order("6");
        Order o3 = new Order("13");
        Warehouse w1 = new Warehouse();
        w1.addOrder(o1);
        w1.addOrder(o2);
        w1.addOrder(o3);
        System.out.println(o2.getNumber());
        try {
            System.out.println(w1.getOrder(o1));
        }
        catch (OrderDoesntExistException e){
            System.out.println("Empty list");
        }
        finally {
            System.out.println("Other exception");
        }
    }
}
