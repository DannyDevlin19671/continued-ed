package com.example.collections.comparator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author danieldevlin
 * @date 10/03/2025
 * @project continued-ed
 */
public class PeopleComparisonTest {
    public static void main(String[] args){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Daniel", 45));
        people.add(new Person("Ethan", 18));
        people.add(new Person("Emma", 14));
        people.add(new Person("Sarah", 31));

        people.sort(new PeopleComparator());
        for(Person person: people){
            System.out.println(person);
        };
    }
}
