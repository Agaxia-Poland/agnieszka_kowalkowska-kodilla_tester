package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    public String name;
    private int speed;
    private static final int DECREASE_VALUE = 50;
    private static final int INCREASE_VALUE = 60;

    public Toyota(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Toyota() {
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