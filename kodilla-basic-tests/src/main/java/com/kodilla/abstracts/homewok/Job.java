package com.kodilla.abstracts.homewok;

public abstract class Job {

    private String name;
    private int age;
    private String job;
    private int salary;
    private int responsibilities;

    public Job(String name, int age, String job, int salary, int responsibilities) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    public int getResponsibilities() {
        return responsibilities;
    }
    public abstract void giveName();
    public abstract void giveAge();
    public abstract void giveJob();
    public abstract void giveSalary();
    public abstract void giveResponsibilities();

}
