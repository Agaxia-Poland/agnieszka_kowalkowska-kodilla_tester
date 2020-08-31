package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Ford> cars = new ArrayList<>();
        cars.add(new Ford());
        cars.add(new Ford());
        cars.add(new Ford());

        List<Opel> cars1 = new ArrayList<>();
        cars1.add(new Opel());
        cars1.add(new Opel());
        cars1.add(new Opel());

        List<Toyota> cars2 = new ArrayList<>();
        cars2.add(new Toyota());
        cars2.add(new Toyota());
        cars2.add(new Toyota());

        cars.remove(1);
        cars1.remove(cars1);

        System.out.println(cars.size());
        System.out.println(cars1.size());
        System.out.println(cars2.size());

        for (Car car : cars) {
            if (car.getSpeed() > 200)
                System.out.println("----------------------------");
                System.out.println(car + ", name: " + car.getName());
                System.out.println(car + ", speed: " + car.getSpeed());
        }

        for (Car car : cars1) {
            if (car.getSpeed() > 200)
                System.out.println("----------------------------");
                System.out.println(car + ", name: " + car.getName());
                System.out.println(car + ", speed: " + car.getSpeed());
        }

        for (Car car : cars2) {
            if (car.getSpeed() > 200)
                System.out.println("----------------------------");
                System.out.println(car + ", name: " + car.getName());
                System.out.println(car + ", speed: " + car.getSpeed());
        }
    }
}




