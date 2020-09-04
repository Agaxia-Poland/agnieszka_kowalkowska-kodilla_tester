package com.kodilla.collections.interfaces.homework;


import java.util.Random;

public class CarRace {
    public static void doRace(Car car) {
        car.getIncreaseSpeed();
        car.getIncreaseSpeed();
        car.getIncreaseSpeed();
        car.getDecreaseSpeed();
        car.getDecreaseSpeed();

        System.out.println(car.getName() + ": " + car.getSpeed());
    }

    public static void main(String[] args) {
        Opel opel = new Opel();
        opel.name = "Opel Corsa";

        doRace(opel);

        Ford ford = new Ford();
        ford.name = "Ford Focus";

        doRace(ford);

        Toyota toyota = new Toyota();
        toyota.name = "Toyota Yaris";

        doRace(toyota);
    }
}