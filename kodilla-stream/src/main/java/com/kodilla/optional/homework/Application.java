package com.kodilla.optional.homework;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Map<Student, Teacher> students = new HashMap<>();
        Student piotr = new Student("Piotr Nowak", "Anna Gadomska");
        Student adam = new Student("Adam Nowak", "Mateusz Kowalski");
        Student ewa = new Student("Ewa Kowalska", "Anna Gadomska");

        Teacher piotrTeacher = new Teacher("Anna Gadomska");
        Teacher adamTeacher = new Teacher("Mateusz Kowalski");
        Teacher ewaTeacher = new Teacher("Anna Gadomska");

        students.put(piotr, piotrTeacher);
        students.put(adam, adamTeacher);
        students.put(ewa, ewaTeacher);

        System.out.println(students.get(piotr));
        System.out.println(students.get(adam));
        System.out.println(students.get(ewa));

//        for (Map.Entry<Student, Teacher> studentEntry : students.entrySet()
//        System.out.println(studentEntry.getKey().getName() + " " + studentEntry.getValue().getTeacher);
//        )
//
//        Optional<Student> optionalStudent = Optional.ofNullable(student);
//
//        optionalStudent.ifPresent(u -> System.out.println(u.getName()));
    }
}
