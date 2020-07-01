package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(b, a);
        assertEquals(3, subtractResult);
    }
    @Test
    public void testPositiveSquare() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);
    }
    @Test
    public void testNegativeSquare() {
        Calculator calculator = new Calculator();
        int a = -5;
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);
    }
    @Test
    public void testZeroSquare() {
        Calculator calculator = new Calculator();
        int a = 0;
        int squareResult = calculator.square(a);
        assertEquals(0, squareResult);
    }

}
