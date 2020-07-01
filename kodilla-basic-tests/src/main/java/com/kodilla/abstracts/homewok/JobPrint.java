package com.kodilla.abstracts.homewok;

import com.kodilla.abstracts.Animal;

public class JobPrint {
    public void process(Job job) {
        System.out.println("This person name is " + job.getName() + "age " + job.getAge() + "job " + job.getJob() + "salary " + job.getSalary() + "responsibilities " + job.getResponsibilities());
            job.giveName();
            job.giveAge();
            job.giveJob();
            job.giveSalary();
            job.giveResponsibilities();

        }
}
