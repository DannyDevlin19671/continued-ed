package com.example.exceptions;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class ThrowsExample {
    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (InterruptedException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void riskyMethod() throws InterruptedException {
        Thread.sleep(1000); // Can throw InterruptedException
        throw new InterruptedException("Interrupted Exception");
    }
}
