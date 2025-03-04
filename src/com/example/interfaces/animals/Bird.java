package com.java.interfaces.animals;

import com.java.interfaces.animals.Animal;

/**
 * @author danieldevlin
 * @date 02/03/2025
 * @project Interfaces
 *
 * The {@code Bird} class represents a bird, which is a concrete implementation
 * of the {@link Animal} interface. It demonstrates how an animal can be modeled
 * with behaviors such as speaking and moving. In this case, a bird speaks by
 * tweeting and moves by flying gracefully.
 *
 * <p>This class is part of the Interfaces project and is used to illustrate
 * the implementation of interface methods in Java.</p>
 *
 */
public class Bird implements Animal {

    /**
     * The name of the bird.
     */
    private String name;

    /**
     * Constructs a new {@code Bird} instance with the specified name.
     *
     * @param name the name of the bird
     */
    public Bird(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the bird.
     *
     * @return the bird's name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Makes the bird speak by printing its characteristic sound to the console.
     * <p>
     * The output is formatted as: {@code [name] says: Tweet!}
     * </p>
     */
    @Override
    public void speak() {
        System.out.println(name + " says: Tweet!");
    }

    /**
     * Simulates the bird's movement by printing a description of its graceful flight.
     * <p>
     * The output is formatted as: {@code [name] flies gracefully.}
     * </p>
     */
    @Override
    public void move() {
        System.out.println(name + " flies gracefully.");
    }
}