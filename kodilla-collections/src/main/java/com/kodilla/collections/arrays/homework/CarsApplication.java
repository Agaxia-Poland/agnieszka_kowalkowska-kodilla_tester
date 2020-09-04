package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {


    public static void main(String[] args) {

        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    public static Car drawCar(){
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);

        Car car;

        if (drawnCarKind == 0)
            car = new Ford();
        else if (drawnCarKind == 1)
            car = new Opel();
        else
            car = new Toyota();

        int count = random.nextInt(3) + 1;
        for (int i = 0; i < count; i++) {
            car.getIncreaseSpeed();
        }

        return car;
    }
}
