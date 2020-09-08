package com.kodilla.optional.homework;

import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Student student = new Student("Student1", new Teacher("Teacher1"));
        Student student2 = new Student("Student2", new Teacher("Teacher2"));


        Optional<Student> optionalStudent = Optional.ofNullable(student);

        optionalStudent.ifPresent(u -> System.out.println(u.getName()));
    }
}
