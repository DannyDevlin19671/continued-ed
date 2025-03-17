package com.example.exceptions;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero! " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
