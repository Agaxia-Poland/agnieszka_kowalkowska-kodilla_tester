package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {
    public String name = "Fiesta";
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

    @Override
    public String toString() {
        return "Ford{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed &&
                value == ford.value &&
                Objects.equals(name, ford.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, value);
    }
}
