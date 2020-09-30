package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Suzuki", 43, 31.25, true));
        stamps.add(new Stamp("Honda", 39.5, 31.25,false));
        stamps.add(new Stamp("Yamaha", 90, 70, true));
        stamps.add(new Stamp("Suzuki", 43, 31.25, false));

        if (stamps.size() == 3) {
            System.out.println("stamps collection without duplicates");
        } else {
            System.out.println("something went wrong");
        }
    }
}
