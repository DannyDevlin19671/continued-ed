package com.example.exceptions;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int num = 10 / 2;
            System.out.println("Result: " + num);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
