package com.kodilla.collections.lists.homework;
import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;


public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford("f1", 22));
        cars.add(new Ford("f2", 1));
        cars.add(new Ford("f21", 1));
        cars.add(new Ford("f5", 15));
        cars.add(new Ford("f21234", 131));
        cars.add(new Opel("o1", 22));
        cars.add(new Opel("o2", 23));
        cars.add(new Opel("o3", 34));
        cars.add(new Toyota("t1", 78));
        cars.add(new Toyota("t2", 320));
        cars.add(new Toyota("t3", 240));

        System.out.println(cars.size());

        cars.remove(1);
        System.out.println(cars.size());

        Ford carToRemove = new Ford("f5", 115);
        cars.remove(carToRemove);
        System.out.println(cars.size());

        for (Car car : cars) {
            if (car.getSpeed() > 200) {
                CarUtils.describeCar(car);
            }
        }
    }
}




