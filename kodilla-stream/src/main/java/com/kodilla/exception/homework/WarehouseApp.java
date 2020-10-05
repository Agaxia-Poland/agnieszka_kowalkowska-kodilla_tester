package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Order o1 = new Order("1");
        Order o2 = new Order("5");
        Order o3 = new Order("34");

        Warehouse w1 = new Warehouse();
        w1.addOrder(o1);
        w1.addOrder(o2);
        w1.addOrder(o3);

        w1.getOrder("1");



//        int numberOfOrder = Order.addOrder();
//        System.out.println("Number of order: " + numberOfOrder);

        /*private Map<String, Integer> getOrder () {
            Map<String, Integer> orders = new HashMap<>();
            orders.put("Computer", 120);
            orders.put("Screen", 123);
            orders.put("Roller", 124);
            orders.put("Projector", 130);
            return orders;
        }

        public Integer isOrderExisted (String order) throws OrderDoesntExistException {
            if (getOrder().containsKey(order))
                return getOrder().get(order);
            throw new OrderDoesntExistException();
        }
    }*/
    }
}
