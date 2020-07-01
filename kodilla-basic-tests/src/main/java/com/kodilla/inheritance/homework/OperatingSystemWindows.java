package com.kodilla.inheritance.homework;

public class OperatingSystemWindows extends OperatingSystem {
    public OperatingSystemWindows(int screen, int disc, int yearProduction) {
        super(screen, disc, yearProduction);
        System.out.println("Operating System Windows: " + "screen is " + screen + " " + "disc is " + disc);
    }

    public void selectVersion() {
        System.out.println("The Windows system version is...");
    }


    @Override
    public void turnOn() {
        System.out.println("The Windows system is turned on");
    }
}
