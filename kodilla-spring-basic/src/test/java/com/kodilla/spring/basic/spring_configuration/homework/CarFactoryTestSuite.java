package com.kodilla.spring.basic.spring_configuration.homework;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;

public class CarFactoryTestSuite extends TestCase {

@Test
public void shouldReturnCorrectCarWithCorrectLightSetDependingOnCurrentSeason(){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    String season = SeasonsSelector.getSeason(LocalDate.now());
    int hour = LocalTime.now().getHour();

    Car car = (Car) context.getBean("selectCar");
    System.out.println("Returned car : " + car.getCarType() + ", lights on: " + car.hasHeadlightsTurnedOn());
    if(season.equals("Summer")) {
        Assertions.assertEquals("Cabrio", car.getCarType());
    } else if ( season.equals("Winter")){
        Assertions.assertEquals("SUV", car.getCarType());
    } else {
        Assertions.assertEquals("Sedan", car.getCarType());
    }

    if(hour >=20 || hour <= 6){
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    } else {
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }
}
}