package com.example.inheritance;

/**
 * @author danieldevlin
 * @date 04/03/2025
 * @project JavaDevIntelliJ
 *
 * The {@code Main} class tests the {@code Animal} and {@code Dog} classes,
 * demonstrating inheritance, method overriding, and method overloading.
 */
public class Main {
    /**
     * The main method to run the demo.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create an Animal object
        Animal genericAnimal = new Animal("Generic Animal");

        // Create a Dog object
        Dog myDog = new Dog("Buddy");

        System.out.println("Testing Animal:");
        genericAnimal.makeSound();
        genericAnimal.move();
        genericAnimal.move(10);
        genericAnimal.displayInfo();

        System.out.println("\nTesting Dog:");
        myDog.makeSound();
        myDog.move();
        myDog.move(20);
        myDog.move(20, 15);
        myDog.displayInfo();
    }
}
