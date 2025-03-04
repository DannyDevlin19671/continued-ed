package com.example.interfaces.people;

/**
 * @author danieldevlin
 * @date 03/03/2025
 * @project Interfaces
 *
 * The {@code FullTimeEmployee} class represents a full-time employee.
 * It implements the {@code Person} interface and includes additional
 * information such as the employee's salary.
 */
public class FullTimeEmployee implements Person {
    private String name;
    private int age;
    private double salary;

    /**
     * Constructs a new {@code FullTimeEmployee} with the specified name, age, and salary.
     *
     * @param name   the name of the employee.
     * @param age    the age of the employee.
     * @param salary the salary of the employee.
     */
    public FullTimeEmployee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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
     * Returns details about the full-time employee.
     *
     * @return a {@code String} containing the employee's name, age, and salary.
     */
    @Override
    public String getDetails() {
        return "Full Time Employee: " + name + ", Age: " + age + ", Salary: $" + salary;
    }
}
