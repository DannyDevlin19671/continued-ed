package com.example.object.comparisons;

import java.util.Objects;

/**
 * @author danieldevlin
 * @date 10/03/2025
 * @project continued-ed
 */
public class TestPerson {
    public static void main(String[] args){
        // Instantiate a person called Daniel
        Person daniel = new Person("Daniel", 45);
        // Instantiate a second person that points to Daniel
        Person danielCopy = daniel;

        // Output if daniel is equal to danielCopy (same name and age)
        System.out.println(daniel.equals(danielCopy));
        // Print out the hashcodes of both objects
        System.out.println(daniel.hashCode());
        System.out.println(danielCopy.hashCode());
        // Check if both variables are pointing to the same object
        System.out.println(daniel == danielCopy);

        // Instantiate a new person
        Person caroline = new Person("Caroline", 30);
        // Print out hashcode
        System.out.println(caroline.hashCode());
        // Compare to Daniel object to see if they are equal (same name and age)
        System.out.println(daniel.equals(caroline));
        // Test if daniel and caroline are the same object
        System.out.println(daniel==caroline);



    }
}
