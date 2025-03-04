package com.java.interfaces.animals;

import com.java.interfaces.animals.Animal;

/**
 *  @author danieldevlin
 *  @date 02/03/2025
 *  @project Interfaces
 *
 * The {@code Dog} class is a concrete implementation of the {@link Animal} interface,
 * representing a dog. It encapsulates the dog's name and defines behaviors typical
 * to a dog such as speaking and moving.
 *
 * <p>
 * This class is part of the Interfaces project, which demonstrates how multiple
 * animal types can implement a common interface. The {@code Dog} class specifically
 * shows how a dog's actions can be defined through the methods declared in the
 * {@code Animal} interface.
 * </p>
 *
 * <p>
 * The class implements the following methods:
 * <ul>
 *   <li>{@link #getName()} - Returns the name of the dog.</li>
 *   <li>{@link #speak()} - Outputs a message representing the dog's bark.</li>
 *   <li>{@link #move()} - Outputs a message representing the dog's movement.</li>
 * </ul>
 * </p>
 *
 */
public class Dog implements Animal {

    /**
     * The name of the dog.
     */
    private String name;

    /**
     * Constructs a new {@code Dog} instance with the specified name.
     *
     * @param name the name of the dog
     */
    public Dog(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the dog.
     *
     * @return the dog's name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Simulates the dog's speaking behavior by printing a message to the console.
     * <p>
     * The output is formatted as: {@code [name] says: Woof!}
     * </p>
     */
    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }

    /**
     * Simulates the dog's movement by printing a message to the console.
     * <p>
     * The output is formatted as: {@code [name] runs energetically.}
     * </p>
     */
    @Override
    public void move() {
        System.out.println(name + " runs energetically.");
    }
}