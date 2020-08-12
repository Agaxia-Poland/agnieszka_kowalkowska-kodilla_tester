package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Ford(int speed, int increaseSpeed, int decreaseSpeed) {
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }

    public Ford() {
        int speed = 250;
        int increaseSpeed = 20;
        int decreaseSpeed = 10;
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
