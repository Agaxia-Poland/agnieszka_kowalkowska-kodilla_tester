package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    public String name;
    public int speed;
    private static final int DECREASE_VALUE = 40;
    private static final int INCREASE_VALUE = 50;

    public Opel(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Opel() {
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