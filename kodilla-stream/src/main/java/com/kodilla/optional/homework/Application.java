package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student("Student1", new Teacher("Teacher1"));
        Student student1 = new Student("Student2", new Teacher("Teacher2"));
        Student student3 = new Student("Student3", new Teacher(null));
        Student student4 = new Student("Student4", new Teacher(null));
        Student student5 = new Student("Student5", new Teacher("Teacher1"));


        Optional<Student> optionalStudent = Optional.ofNullable(student);

        optionalStudent.ifPresent(u -> System.out.println(u.getName()));

//        for each
    }
}
