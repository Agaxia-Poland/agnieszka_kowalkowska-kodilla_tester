package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {
    public String name = "Corsa";
    public int speed = 60;
    int value = 30;

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
        return "Opel{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed &&
                value == opel.value &&
                Objects.equals(name, opel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, value);
    }
}