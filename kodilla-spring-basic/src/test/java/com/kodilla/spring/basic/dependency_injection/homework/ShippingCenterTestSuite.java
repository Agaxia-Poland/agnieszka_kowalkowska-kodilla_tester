package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ShippingCenterTestSuite {

@Test
public void shouldReturnCorrectMessage(){
    ApplicationContextShippingCenter context = new AnnotationConfigApplicationContextShippingCenter("com.kodilla.spring");
    ShippingCenter bean = context.getBean(ShippingCenter.class);
    String message = bean.sendPackage("Słowackiego 20,Gdańsk, PL", 25.0);
    Assertions.assertEquals("Package delivered to: Słowackiego 20,Gdańsk, PL", message);
}

@Test
public void shouldReturnPackageNotDeliveredMessage(){
     ApplicationContextShippingCenter context = new AnnotationConfigApplicationContextShippingCenter("com.kodilla.spring");
     ShippingCenter bean = context.getBean(ShippingCenter.class);
     String message = bean.sendPackage("Słowackiego 20,Gdańsk, PL", 33.0);
     Assertions.assertEquals("Package not delivered to: Słowackiego 20,Gdańsk, PL", message);
}
}
