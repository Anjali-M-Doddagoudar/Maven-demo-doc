package com.mavendemo;

public class Calculator {

    public int add(int a, int b) {
        int result = a + b;
        System.out.println("Add: " + a + " + " + b + " = " + result);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtract: " + a + " - " + b + " = " + result);
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiply: " + a + " * " + b + " = " + result);
        return result;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        int result = a / b;
        System.out.println("Divide: " + a + " / " + b + " = " + result);
        return result;
    }

    public boolean isPositive(int a) {
        boolean result = a > 0;
        System.out.println("IsPositive: " + a + " => " + result);
        return result;
    }

    public boolean isDivisible(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        boolean result = a % b == 0;
        System.out.println("IsDivisible: " + a + " % " + b + " == 0 => " + result);
        return result;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 5);
        calc.subtract(10, 5);
        calc.multiply(10, 5);
        calc.divide(10, 5);
        calc.isPositive(-3);
        calc.isDivisible(10, 2);
    }
}
