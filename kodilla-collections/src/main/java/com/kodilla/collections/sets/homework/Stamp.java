package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double width;
    private double length;
    private String stamped;

    public Stamp(String stampName, double width, double length, String stamped) {
        this.stampName = stampName;
        this.width = width;
        this.length = length;
        this.stamped = stamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 &&
                Double.compare(stamp.length, length) == 0 &&
                stamped == stamp.stamped &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, width, length, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", stamped=" + stamped +
                '}';
    }
}
