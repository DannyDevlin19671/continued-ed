package com.example.collections.comparator;

import java.util.Comparator;

/**
 * @author danieldevlin
 * @date 10/03/2025
 * @project continued-ed
 */
public class PeopleComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge() - o2.getAge() != 0){
            return o1.getAge() - o2.getAge();
        }
        return o1.getName().compareTo(o2.getName());
    }
}

