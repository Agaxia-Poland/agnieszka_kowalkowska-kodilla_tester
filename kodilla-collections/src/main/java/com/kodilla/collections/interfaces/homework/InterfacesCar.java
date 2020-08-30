package com.kodilla.collections.interfaces.homework;

public class InterfacesCar {

    public static void main(String[] args) {

        Ford ford = new Ford();
        showCarDetails(ford);

        Opel opel = new Opel();
        showCarDetails(opel);

        Toyota toyota = new Toyota();
        showCarDetails(toyota);

    }

    private static void showCarDetails(Car car) {
        System.out.println(car.getSpeed());

    }

}
