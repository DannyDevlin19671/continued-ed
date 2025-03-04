package com.example.interfaces.people;

/**
 * @author danieldevlin
 * @date 03/03/2025
 * @project Interfaces
 *
 * The {@code Person} interface defines simple methods that any person-like object should implement.
 * It includes methods to get the person's name, age, and details.
 */
public interface Person {
    /**
     * Returns the person's name.
     *
     * @return the name as a {@code String}.
     */
    String getName();

    /**
     * Returns the person's age.
     *
     * @return the age as an {@code int}.
     */
    int getAge();

    /**
     * Returns a detailed description of the person.
     *
     * @return a {@code String} containing details about the person.
     */
    String getDetails();
}
