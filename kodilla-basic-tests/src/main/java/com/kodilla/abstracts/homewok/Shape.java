package com.kodilla.abstracts.homewok;

public abstract class Shape {
    private int side1;
    private int side2;

    public Shape(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSurfaceArea() {
        return side1 * side2;
    }

    public int getCircumference() {
        return side1 * 2 + side2 * 2;
    }

    public abstract void giveSurfaceArea();
    public abstract void giveCircumference();

}
