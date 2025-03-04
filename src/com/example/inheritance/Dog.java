package com.example.inheritance;

/**
 * @author danieldevlin
 * @date 04/03/2025
 * @project JavaDevIntelliJ
 *
 * Represents a dog, which is a specific type of Animal.
 * <p>
 * This class demonstrates method overriding and overloading by providing specific
 * implementations for methods inherited from {@code Animal}.
 * </p>
 */
public class Dog extends Animal {

    /**
     * Constructs a {@code Dog} with the given name.
     *
     * @param name the name of the dog.
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Makes a dog-specific sound.
     * This method overrides the generic animal sound from {@code Animal}.
     */
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    /**
     * Moves the dog with a behavior specific to dogs.
     * This method overrides the {@code move()} method from {@code Animal}.
     */
    @Override
    public void move() {
        System.out.println(name + " runs quickly.");
    }

    /**
     * Overloaded method: Moves the dog for a specified distance at a given speed.
     *
     * @param distance the distance in meters.
     * @param speed    the speed in km/h.
     */
    public void move(int distance, int speed) {
        System.out.println(name + " runs " + distance + " meters at " + speed + " km/h.");
    }

    /**
     * Displays information about the dog.
     * This method overrides the {@code displayInfo()} method from {@code Animal}.
     */
    @Override
    public void displayInfo() {
        System.out.println("Dog: " + name);
    }
}
