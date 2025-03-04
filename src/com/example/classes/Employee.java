package com.example.classes;

/**
 * @author danieldevlin
 * @date 24/02/2025
 * @project SecondWeek
 *
 * Represents an employee with additional details such as employer, employee number,
 * and employment type. This class extends the {@code com.example.classes.Person} class, inheriting the
 * basic attributes such as name and age.
 * <p>
 * Example usage:
 * <pre>
 *   com.example.classes.Employee emp = new com.example.classes.Employee("Acme Corp", "12345", "Full Time", "John Doe", 30);
 *   System.out.println(emp);
 * </pre>
 * </p>
 *
 */
public class Employee extends Person {
    /**
     * The name of the employer.
     */
    private String employer;

    /**
     * The unique employee number.
     */
    private String employeeNumber;

    /**
     * The type of employment (e.g., Full Time, Part Time, Contract).
     */
    private String employmentType;

    /**
     * Default constructor.
     */
    public Employee() {
        // Default constructor
    }

    /**
     * Constructs an {@code com.example.classes.Employee} with the specified details.
     *
     * @param employer        the name of the employer.
     * @param employeeNumber  the unique employee number.
     * @param employmentType  the type of employment.
     * @param name            the employee's name.
     * @param age             the employee's age.
     */
    public Employee(String employer, String employeeNumber, String employmentType, String name, int age) {
        super(name, age);
        this.employeeNumber = employeeNumber;
        this.employer = employer;
        this.employmentType = employmentType;
    }

    /**
     * Returns the name of the employer.
     *
     * @return the employer as a {@code String}.
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * Sets the employer name.
     *
     * @param employer the name of the employer to set.
     */
    public void setEmployer(String employer) {
        this.employer = employer;
    }

    /**
     * Returns the employee number.
     *
     * @return the employee number as a {@code String}.
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the employee number.
     *
     * @param employeeNumber the employee number to set.
     */
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * Returns the type of employment.
     *
     * @return the employment type as a {@code String}.
     */
    public String getEmploymentType() {
        return employmentType;
    }

    /**
     * Sets the type of employment.
     *
     * @param employmentType the employment type to set.
     */
    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    /**
     * Returns a string representation of the employee, including the person details
     * inherited from the {@code com.example.classes.Person} class and the employee-specific details.
     *
     * @return a {@code String} representation of the employee.
     */
    @Override
    public String toString() {
        String output = "EmployeeNumber: " + this.employeeNumber + "\nEmployer: " + this.employer
                + "\nEmploymentType: " + this.employmentType;
        return super.toString() + "\n" + output;
    }
}