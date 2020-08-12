package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {

    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Toyota(int speed, int increaseSpeed, int decreaseSpeed) {

        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }

    public Toyota() {

        int speed = 280;
        int increaseSpeed = 10;
        int decreaseSpeed = 5;
    }

    public int getSpeed() {

        return speed;
    }
    @Override
    public int getIncreaseSpeed() {
        return increaseSpeed;
    }

    @Override
    public int getDecreaseSpeed() {
        return decreaseSpeed;
    }
}
