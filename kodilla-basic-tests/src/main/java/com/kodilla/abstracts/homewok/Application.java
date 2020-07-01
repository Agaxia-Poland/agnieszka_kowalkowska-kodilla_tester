package com.kodilla.abstracts.homewok;

public class Application {

    public static void main(String[] args) {
        Shape square = new Square();
        Square object = new Square();
        object.giveSurfaceArea();
        object.giveCircumference();

        Shape rectangle = new Rectangle();
        Rectangle object2 = new Rectangle();
        object2.giveSurfaceArea();
        object2.giveCircumference();

        Shape square2 = new Square2();
        Square2 object3 = new Square2();
        object3.giveSurfaceArea();
        object3.giveCircumference();

    }
}
