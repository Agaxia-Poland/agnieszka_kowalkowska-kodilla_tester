package com.kodilla.inheritance.homework;

public class OperatingSystemMac extends OperatingSystem {
    public OperatingSystemMac(int screen, int disc, int yearProduction) {
        super(screen, disc, yearProduction);
        System.out.println("Operating System Mac : " + "screen is " + screen + " " + "disc is " + disc);
    }

    public void selectVersion() {
          System.out.println("The Mac system version is...");
    }

     @Override
     public void turnOn() {
        System.out.println("The Mac system is turned on");
     }

}
