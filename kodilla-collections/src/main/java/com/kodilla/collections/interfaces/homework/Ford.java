package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    public String name;
    private int speed = 50;
    int value = 20;

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
