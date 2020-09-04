package com.kodilla.stream.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Write tasks", 2020-9-3, 2020-9-20));
        tasks.add(new Task("Sign documents", 2020-8-3, 2020-9-10));
        tasks.add(new Task("Create posts on website", 2020-7-15, 2020-9-1));
        tasks.add(new Task("Write new tasks", 2020-9-20, 2020-11-30));

        return tasks;
    }

//    List<Task> getTasks()
// Klasę TaskRepository z metodą statyczną List<Task> getTasks() zwracającą listę kilku przykładowych zadań.
}
