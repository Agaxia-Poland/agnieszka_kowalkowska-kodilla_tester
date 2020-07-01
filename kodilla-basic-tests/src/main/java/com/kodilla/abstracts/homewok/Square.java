package com.kodilla.abstracts.homewok;

public class Square extends Shape {

    public Square() {
        super (5, 5);
    }

    @Override
    public void giveSurfaceArea () {
        System.out.println("Surface area of square is " + (5 * 5));
    }

    public void giveCircumference() {
        System.out.println("Circumference of square is " + (5 * 2 + 5 * 2));
    }

}
