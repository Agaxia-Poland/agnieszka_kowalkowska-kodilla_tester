package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> classes = new HashMap<>();
        Principal piotr = new Principal("Piotr", "Nowak", "Colleage 1");
        Principal adam = new Principal("Adam", "Kowalski", "Secondary School 1");
        Principal ewa = new Principal("Ewa", "Panda", "Secondary School 2");

        School piotrSchool = new School(20, 30, 15, 18, 34, 21);
        School adamSchool = new School(12, 14, 15, 16, 21, 18);
        School ewaSchool = new School(27, 23, 24, 25, 27, 21);

        classes.put(piotr, piotrSchool);
        classes.put(adam, adamSchool);
        classes.put(ewa, ewaSchool);

        System.out.println(classes.get(piotr));
        System.out.println(classes.get(adam));
        System.out.println(classes.get(ewa));

        for (Map.Entry<Principal, School> principalEntry : classes.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + " " + principalEntry.getKey().getLastname() + ", school: " + principalEntry.getKey().getSchoolname() + ", sum of students: " + principalEntry.getValue().getNumbersOfStudentsInClasses());
    }
}

