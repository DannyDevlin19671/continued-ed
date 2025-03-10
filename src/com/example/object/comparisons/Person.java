package com.example.object.comparisons;

/**
 * @author danieldevlin
 * @date 10/03/2025
 * @project continued-ed
 */
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters (optional, but useful)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object o) {
        // Check if comparing to itself
        if (this == o) return true;
        // Check if the object is null or not the same class
        if (o == null || getClass() != o.getClass()) return false;
        // Cast and compare fields
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Overriding hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
