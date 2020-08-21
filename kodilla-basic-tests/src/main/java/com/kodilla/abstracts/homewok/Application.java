package com.kodilla.abstracts.homewok;

public class Application {

    public static void main(String[] args) {

        Shape square = new Square(2.5);
        System.out.println("Square with side 2.5 has area " + square.getSurface());
        System.out.println("Square with side 2.5 has circumference " + square.getCircumference());

        Shape triangle = new Triangle(6, 4, 5,5);
        System.out.println("Triangle with base 6, side 1 4, side 2 5, height 5 has area " + triangle.getSurface());
        System.out.println("Triangle with base 6, side 1 4, side 2 5, height 5 has circumference " + triangle.getCircumference());

        Shape circle = new Circle(3);
        System.out.println("Circle with radius 3 has area " + circle.getSurface());
        System.out.println("Circle with radius 3 has circumference " + circle.getCircumference());

    }
}
