package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    public String name;
    private int speed;
    private static final int DECREASE_VALUE = 20;
    private static final int INCREASE_VALUE = 30;

    public Ford(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Ford() {
    }

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
        speed = speed + INCREASE_VALUE;
    }

    @Override
    public void getDecreaseSpeed() {
        speed = speed - DECREASE_VALUE;
    }
}
