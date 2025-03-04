package com.example.interfaces.people;

/**
 * @author danieldevlin
 * @date 03/03/2025
 * @project Interfaces
 *
 * The {@code Student} class represents a student.
 * It implements the {@code Person} interface and includes additional
 * information such as the student's major.
 */
public class Student implements Person {
    private String name;
    private int age;
    private String major;

    /**
     * Constructs a new {@code Student} with the specified name, age, and major.
     *
     * @param name  the name of the student.
     * @param age   the age of the student.
     * @param major the student's major.
     */
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getAge() {
        return age;
    }

    /**
     * Returns details about the student.
     *
     * @return a {@code String} containing the student's name, age, and major.
     */
    @Override
    public String getDetails() {
        return "Student: " + name + ", Age: " + age + ", Major: " + major;
    }
}
