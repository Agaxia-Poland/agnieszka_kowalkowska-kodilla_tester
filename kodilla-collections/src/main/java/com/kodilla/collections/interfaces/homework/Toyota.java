package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Toyota implements Car {
    public String name = "Yaris";
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

    @Override
    public String toString() {
        return "Toyota{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toyota toyota = (Toyota) o;
        return speed == toyota.speed &&
                value == toyota.value &&
                Objects.equals(name, toyota.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, value);
    }
}