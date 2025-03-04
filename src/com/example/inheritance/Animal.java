package com.example.inheritance;

/**
 * @author danieldevlin
 * @date 04/03/2025
 * @project JavaDevIntelliJ
 *
 * Represents a generic animal.
 * <p>
 * This class demonstrates basic inheritance concepts with methods that can be overridden
 * and overloaded in subclasses.
 * </p>
 */
public class Animal {
    /**
     * The name of the animal.
     */
    protected String name;

    /**
     * Constructs an {@code Animal} with the given name.
     *
     * @param name the name of the animal.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Default constructor that sets the name to "Unknown".
     */
    public Animal() {
        this("Unknown");
    }

    /**
     * Makes a generic animal sound.
     */
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    /**
     * Moves the animal.
     */
    public void move() {
        System.out.println(name + " moves");
    }

    /**
     * Overloaded method: Moves the animal a specified distance.
     *
     * @param distance the distance in meters.
     */
    public void move(int distance) {
        System.out.println(name + " moves " + distance + " meters.");
    }

    /**
     * Displays information about the animal.
     */
    public void displayInfo() {
        System.out.println("Animal: " + name);
    }
}
