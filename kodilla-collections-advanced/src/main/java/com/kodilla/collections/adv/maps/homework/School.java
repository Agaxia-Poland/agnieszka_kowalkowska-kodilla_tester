package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

//Klasę School, która będzie reprezentowała szkołę,
// a w niej pole (typu ArrayList), które będzie przechowywało listę liczb uczniów
// w poszczególnych klasach.

public class School {
    private List<Double> numbersOfStudentsInClasses = new ArrayList<>();

    public School(double... numbersOfStudentsInClasses) {
        for(double numbersOfStudents : numbersOfStudentsInClasses)
            this.numbersOfStudentsInClasses.add(numbersOfStudents);
    }

    public double getNumbersOfStudentsInClasses() {
        double sum = 0;
        for (double classes : numbersOfStudentsInClasses)
            sum += classes;
        return sum;
    }
}


