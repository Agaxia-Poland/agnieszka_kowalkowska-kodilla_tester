package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Suzuki", 43, 31.25, "stamped"));
        stamps.add(new Stamp("Honda", 39.5, 31.25,"not stamped"));
        stamps.add(new Stamp("Yamaha", 90, 70, "not stamped"));
        stamps.add(new Stamp("Suzuki", 43, 31.25, "stamped"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }

}
