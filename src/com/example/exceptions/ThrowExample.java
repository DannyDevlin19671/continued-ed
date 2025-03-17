package com.example.exceptions;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("You are allowed to proceed.");
    }
}
