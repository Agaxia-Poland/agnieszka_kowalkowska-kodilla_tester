package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    public String name;
    public int speed;
    private static final int DECREASE_VALUE = 40;
    private static final int INCREASE_VALUE = 50;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void getIncreaseSpeed() {
        speed = speed + INCREASE_VALUE;
    }

    @Override
    public void getDecreaseSpeed() {
        speed = speed - DECREASE_VALUE;
    }
}