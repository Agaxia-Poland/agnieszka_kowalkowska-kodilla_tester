package com.kodilla.abstracts.homewok;

public class Person extends Job{


    public Person(String name, int age, String job, int salary, int responsibilities) {
        super(name, age, job, salary, responsibilities);

    }
    public static void main(String[] args) {
        Job scientist = new Scientist();
        Scientist position = new Scientist();
        position.giveName();
        position.giveAge();
        position.giveJob();
        position.giveSalary();
        position.giveResponsibilities();

        Job doctor = new Doctor();
        Doctor position2 = new Doctor();
        position2.giveName();
        position2.giveAge();
        position2.giveJob();
        position2.giveSalary();
        position2.giveResponsibilities();

        Job programmer = new Programmer();
        Programmer position3 = new Programmer();
        position3.giveName();
        position3.giveAge();
        position3.giveJob();
        position3.giveSalary();
        position3.giveResponsibilities();

    }

    @Override
    public void giveName() {
    }

    @Override
    public void giveAge() {

    }

    @Override
    public void giveJob() {

    }

    @Override
    public void giveSalary() {

    }

    @Override
    public void giveResponsibilities() {

    }
}
