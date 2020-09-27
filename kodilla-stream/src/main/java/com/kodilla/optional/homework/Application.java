package com.kodilla.optional.homework;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Map<Teacher, Student> students = new HashMap<>();
        Teacher teacher = new Teacher("name");
        Teacher t1 = new Teacher("Anna Gadomska");
        Teacher t2 = new Teacher("Adam Kowalski");
        Teacher t3 = new Teacher("Rafał Kalinowski");
        Teacher undefined = new Teacher("undefined");

        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
        optionalTeacher.ifPresent(t -> System.out.println(t.getName()));
        String teachername =
                optionalTeacher.orElse(new Teacher("")).getTeachername();
        System.out.println(teachername);

        Student s1 = new Student("Piotr Nowak", t1);
        Student s2 = new Student("Stasiek Nowacki", t2);
        Student s3 = new Student("Adrian Jankowski", undefined);

        students.put(t1, s1);
        students.put(t2, s2);
        students.put(undefined, s3);

        System.out.println(students.get(s1));
        System.out.println(students.get(s2));
        System.out.println(students.get(s3));

        for (Map.Entry<Teacher, Student> teacherEntry : students.entrySet()) {
            System.out.println(teacherEntry.getKey().getName() + " " + teacherEntry.getValue().getName());
        }
    }
}
