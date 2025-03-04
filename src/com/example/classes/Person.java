package com.example.classes;

/**
 * @author danieldevlin
 * @date 24/02/2025
 * @project SecondWeek
 *
 * Represents a person with a name and an age.
 * <p>
 * This class provides constructors to create a person object, and methods to get and set
 * the person's name and age. The {@code toString()} method returns a string representation
 * of the person's details.
 * </p>
 *
 */
public class Person {
    /**
     * The age of the person. Defaults to 55 if not set.
     */
    private int age = 55;

    /**
     * The name of the person.
     */
    private String name;

    /**
     * Constructs a new {@code Person} with the specified name and age.
     *
     * @param name the name of the person.
     * @param age  the age of the person.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Constructs a new {@code Person} with default values.
     */
    public Person() {
        // Default constructor
    }

    /**
     * Sets the age of the person.
     *
     * @param age the new age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Retrieves the age of the person.
     *
     * @return the age of the person.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the name of the person.
     *
     * @return the name of the person.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns a string representation of the person.
     * <p>
     * The format of the returned string is:
     * <pre>
     * Name: [name]
     * Age: [age]
     * </pre>
     * </p>
     *
     * @return a {@code String} representation of the person.
     */
    @Override
    public String toString() {
        String output = "Name: " + this.name + "\nAge: " + this.age;
        return output;
    }
}