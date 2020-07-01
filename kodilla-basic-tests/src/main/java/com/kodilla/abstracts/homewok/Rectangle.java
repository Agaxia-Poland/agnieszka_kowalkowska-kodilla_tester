package com.kodilla.abstracts.homewok;

public class Rectangle extends Shape {

    public Rectangle() {
        super (5, 10);
    }

    @Override
    public void giveSurfaceArea() {
        System.out.println("Surface area of rectangle is " + (5 * 10));
    }
    public void giveCircumference() {
        System.out.println("Circumference of rectangle is " + (5 * 2 + 10 * 2));
    }



}
