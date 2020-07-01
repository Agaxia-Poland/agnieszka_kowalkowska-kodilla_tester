package com.kodilla.task25;

public class User {
    final String name;
    final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User maria = new User("Maria", 30);
        User ewa = new User("Ewa", 57);
        User scooby = new User("Scooby", 4);
        User henryk = new User("Henryk", 32);

        User[] users = {maria, ewa, scooby, henryk};

        int result = 0;
        double average;
        int userNumber = users.length;
        for (User user : users) {
            result = result + user.age;
        }
        average = result / users.length;

        for (User user : users) {
            if (user.age < average) {
                System.out.println(user.name);
            } else {
                System.out.println("Nobody");
            }
        }
    }
}

