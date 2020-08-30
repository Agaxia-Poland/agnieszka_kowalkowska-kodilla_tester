package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {
    //Klasę CarUtils z metodą statyczną opisującą samochody (patrz poprzednie zadanie) o nazwie public static void describeCar(Car car)
    public static void describeCar(Car car) {
        System.out.println("----------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford Focus";
        else if (car instanceof Opel)
            return "Opel Corsa";
        else if (car instanceof Toyota)
            return "Toyota Yaris";
        else
            return "Unknown car name";
    }

    private static int getSpeed(Car car) {
        if (car instanceof Ford)
            return 50;
        else if (car instanceof Opel)
            return 50;
        else if (car instanceof Toyota)
            return 60;
        else
            return 0;
    }
}
