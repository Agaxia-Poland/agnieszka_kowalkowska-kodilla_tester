package com.kodilla.inheritance.homework;

import com.kodilla.inheritance.homework.OperatingSystem;
import com.kodilla.inheritance.homework.OperatingSystemMac;
import com.kodilla.inheritance.homework.OperatingSystemWindows;

public class OperatingSystemApplication {

    public static void main(String[] args) {
        OperatingSystem operatingSystemWindows = new OperatingSystemWindows (17,3, 2019);
        operatingSystemWindows.displayYearProduction();

        OperatingSystemMac operatingSystemMac = new OperatingSystemMac(15, 5, 2020);
        operatingSystemMac.displayYearProduction();


        }
}
