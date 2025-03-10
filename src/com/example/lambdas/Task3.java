package com.example.lambdas;

/**
 * @author danieldevlin
 * @date 10/03/2025
 * @project continued-ed
 */
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using lambda to filter even numbers and summing them
        int sumEven = numbers.stream()
                .filter(n -> n % 2 == 0)      // Filter even numbers
                .mapToInt(s -> s)  // Convert to int
                .sum();                      // Sum the even numbers

        System.out.println("Sum of even numbers: " + sumEven);  // Expected output: 30
    }
}

