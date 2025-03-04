package com.example.interfaces.people;

/**
 * @author danieldevlin
 * @date 03/03/2025
 * @project Interfaces
 *
 * Demonstrates the creation and usage of Student and FullTimeEmployee objects,
 * which both implement the Person interface.
 */
public class PersonDemo {
    /**
     * The main method to execute the demo.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a Student object
        Person student = new Student("Alice", 20, "Computer Science");

        // Create a FullTimeEmployee object
        Person employee = new FullTimeEmployee("Bob", 35, 60000.0);

        // Print details of each Person
        System.out.println(student.getDetails());
        System.out.println(employee.getDetails());
    }
}
