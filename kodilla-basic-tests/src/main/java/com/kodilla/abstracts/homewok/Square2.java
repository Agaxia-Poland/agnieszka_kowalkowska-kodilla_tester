package com.kodilla.abstracts.homewok;

public class Square2 extends Shape {

    public Square2() {
        super (3, 3);
    }

    @Override
    public void giveSurfaceArea() {
        System.out.println("Surface area of square 2 is " + (3 * 3));
    }
    public void giveCircumference() {
        System.out.println("Circumference of square 2 is " + (3 * 2 + 3 * 2));
    }

}
