package com.example.generics;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 * <p>
 * How It Works:
 * </p>
 * <p>
 * <T> is declared before the return type, meaning it's a generic method.
 * Works inside any class (even if the class itself isn't generic).
 * </p>
 * <p>
 * Example usage:
 * </p>
 * <p>
 * Integer[] numbers = {1, 2, 3};
 * </p>
 * <p>
 * Utility.printArray(numbers);
 * </p>
 */
public class Utility {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}
