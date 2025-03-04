package com.java.interfaces.animals;

/**
 * @author danieldevlin
 * @date 02/03/2025
 * @project Interfaces
 *
 * The {@code Animal} interface defines a contract for basic animal behaviors.
 * Any class implementing this interface is required to provide concrete
 * implementations for retrieving the animal's name, making it speak, and describing
 * how it moves.
 *
 * <p>This interface is part of the Interfaces project, which demonstrates how
 * interfaces can be used to define common behaviors for a family of classes representing
 * different types of animals.</p>
 *
 */
public interface Animal {

    /**
     * Returns the animal's name.
     *
     * @return a {@code String} representing the animal's name
     */
    String getName();

    /**
     * Makes the animal produce its characteristic sound.
     *
     * <p>The implementation of this method should output or return the sound typical
     * for the specific animal type.</p>
     */
    void speak();

    /**
     * Describes how the animal moves.
     *
     * <p>The implementation of this method should output or describe the movement
     * behavior typical of the animal.</p>
     */
    void move();
}