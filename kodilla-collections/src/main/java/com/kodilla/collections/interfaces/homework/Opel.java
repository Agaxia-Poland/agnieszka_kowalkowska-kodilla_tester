package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    public String name;
    public int speed = 60;
    int value = 30;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void getIncreaseSpeed() {
        speed = speed + value;
    }

    @Override
    public void getDecreaseSpeed() {
        speed = speed - 20;
    }
}