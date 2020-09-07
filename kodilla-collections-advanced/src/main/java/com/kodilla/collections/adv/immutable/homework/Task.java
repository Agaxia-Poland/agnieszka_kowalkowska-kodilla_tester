package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    protected final String title;
    protected final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        Task task = new Task("Write 2 new posts", 20);

        System.out.println(task.getTitle() + ", duration time: " + task.getDuration());
    }
}
