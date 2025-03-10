package com.example.collections.comparator;

import java.util.ArrayList;
import java.util.List;

/**
 * A demonstration of sorting a list of {@link Person} objects using both a custom comparator
 * and an inline lambda expression. This class creates a list of people, sorts them using
 * different strategies, and prints the results.
 *
 * <p>Sorting is performed using:
 * <ul>
 *   <li>A custom comparator {@link PeopleComparator} that sorts by a predefined rule.</li>
 *   <li>An inline lambda expression that sorts by age in descending order, and by name in reverse alphabetical order if ages are the same.</li>
 * </ul>
 *
 * <p>The output will display:
 * <ul>
 *   <li>The first sorted order using the {@link PeopleComparator}.</li>
 *   <li>The reverse sorted order using the lambda expression.</li>
 * </ul>
 *
 * <p>This demonstrates different sorting techniques using Java collections.
 *
 * @author danieldevlin
 * @date 10/03/2025
 * @project continued-ed
 */
public class PeopleComparisonTest {

    /**
     * The main method demonstrates sorting a list of {@link Person} objects using
     * both a custom comparator and a lambda expression.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a list to store Person objects
        List<Person> people = new ArrayList<>();

        // Adding Person objects to the list
        people.add(new Person("Daniel", 45));
        people.add(new Person("Ethan", 18));
        people.add(new Person("Emma", 14));
        people.add(new Person("Sarah", 31));
        people.add(new Person("Adam", 45));

        /**
         * Sort the list using the custom comparator {@link PeopleComparator}.
         * The sorting logic is defined in the comparator, which may use name, age, or other attributes.
         */
        people.sort(new PeopleComparator());

        // Print the sorted list
        System.out.println("Sorted Order:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Print a separator to distinguish sorting methods
        System.out.println("\n\n\nReverse Order:");

        /**
         * Sort the list using an inline lambda expression.
         *
         * <p>Sorting rules:
         * <ul>
         *   <li>If two people have the same age, they are sorted by name in reverse alphabetical order.</li>
         *   <li>Otherwise, they are sorted by age in descending order.</li>
         * </ul>
         */
        people.sort((p, q) -> {
            if (p.getAge() == q.getAge()) {
                // If ages are equal, sort by name in reverse alphabetical order
                return q.getName().compareTo(p.getName());
            } else {
                // Otherwise, sort by age in descending order
                return q.getAge() - p.getAge();
            }
        });

        // Print the sorted list after applying the lambda sorting rule
        for (Person person : people) {
            System.out.println(person);
        }
    }
}