package com.kodilla.basic_assertion;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(b, a);
        boolean good = ResultChecker.assertEquals (3, subtractResult);
        if (good) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + b + " i " + a);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + b + " i " + a);
        }

        int squareResult = calculator.square(a);
        boolean fine = ResultChecker.assertEquals(25, squareResult);
        if (fine) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }

    }

}




//    public static void main(String[] args) {
//        sumAndDisplay(10, 2);
//        subtractAndDisplay(10, 2);
//    }
//
//    private static void sumAndDisplay(int a, int b) {
//        int result = a + b;
//        System.out.println(result);
//    }
//
//    private static void subtractAndDisplay(int a, int b) {
//        int result = a - b;
//        System.out.println(result);
//    }

