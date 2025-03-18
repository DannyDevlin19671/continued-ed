package com.example.projects.studentgradebook;

import java.util.*;
/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */


class Student {
    private String name;
    private int id;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getAverageGrade() {
        // Remember Integer::intValue is equivalent to s -> Integer.intValue(s)
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + "), Average Grade: " + getAverageGrade();
    }
}
