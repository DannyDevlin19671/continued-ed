package com.example.lambdas;

/**
 * @author danieldevlin
 * @date 10/03/2025
 * @project continued-ed
 */

interface Multiplication{
    int calculate(int a, int b);
}

public class Task1 {
    public static void main(String[] args) {
        // Lambda expression for addition
        Multiplication mult = (a, b) -> a * b;

        // Testing the lambda
        int result = mult.calculate(10, 5);
        System.out.println("10 * 5 = " + result);  // Expected output: 15
    }
}
