package com.kodilla.inheritance;

import java.util.ConcurrentModificationException;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(4,5);
        car.turnOnLights();

        Convertible convertible = new Convertible(4, 2);
        convertible.displayNumberOfSeats();

    }
}
