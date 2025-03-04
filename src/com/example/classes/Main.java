package com.example.classes;

import com.example.classes.Employee;

/**
 * @author danieldevlin
 * @date 24/02/2025
 * @project Test Project
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        com.example.classes.Person person1 = new com.example.classes.Person();
        com.example.classes.Person person2 = new com.example.classes.Person("Pat", 58);
        System.out.println(person2);
        person1.setName("Daniel");
        person1.setAge(45);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        person1.setName("Santa");
        person1.setAge(100);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1);

        Employee employee = new Employee("HSBC", "345kjkjl", "Graduate", "Alexandra", 25);
        employee.setAge(55);
        employee.setName("Seammus");
        employee.setEmployer("Neueda");
        employee.setEmployeeNumber("234JKLNDA");
        employee.setEmploymentType("Full time");
        System.out.println(employee);
    }
}