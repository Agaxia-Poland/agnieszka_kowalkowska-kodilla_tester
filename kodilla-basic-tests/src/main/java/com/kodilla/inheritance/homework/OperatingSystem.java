package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int screen;
    private int disc;
    private int yearProduction;

    public OperatingSystem(int screen, int disc, int yearProduction) {
        this.screen = screen;
        this.disc = disc;
        this.yearProduction = yearProduction;
    }

    public void turnOn () {
            System.out.println("System is turned on");
    }

    public void turnOff() {
            System.out.println("System is turned off");
    }

    public int getScreen() {
        return screen;
    }

    public int getYearProduction() {
        return yearProduction;
    }
    public void displayYearProduction() {
        System.out.println("Year production of system is: " + yearProduction);
    }

}


