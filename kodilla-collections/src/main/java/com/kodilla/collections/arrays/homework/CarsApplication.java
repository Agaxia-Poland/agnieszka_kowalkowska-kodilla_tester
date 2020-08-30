package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    //Klasę CarsApplication z metodą public static Car drawCar(), która będzie tworzyła losowy samochód z losowo zwiększoną prędkością.

    public static void main(String[] args) {
        //Metodę main, w której znajdzie się tablica o losowym rozmiarze od 1 do 15 samochodów.
        // Do każdego elementu tablicy wpisz wylosowany przy pomocy metody drawCar samochód,
        // a następnie przy pomocy pętli wyświetl informacje o wszystkich samochodach znajdujących się w tablicy.

        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    public static Car drawCar(){
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);

        if (drawnCarKind == 0)
            return new Ford();
        else if (drawnCarKind == 1)
            return new Opel();
        else
            return new Toyota();
    }
}
