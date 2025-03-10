package com.example.lambdas;

/**
 * @author danieldevlin
 * @date 10/03/2025
 * @project continued-ed
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Task2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Map<Integer, Person> identities= new HashMap<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Using a lambda expression to sort the list by age
        people.sort((p1, p2) -> Integer.compare(p1.age, p2.age));

        // Print the sorted list
        people.forEach(System.out::println);
        people.forEach(s -> System.out.println(s));
        // Expected output:
        // Bob (25)
        // Alice (30)
        // Charlie (35)
    }
}
