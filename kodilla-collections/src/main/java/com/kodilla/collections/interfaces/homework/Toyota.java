package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    public String name;
    private int speed = 60;
    int value = 60;

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
        speed = speed - 10;
    }
}