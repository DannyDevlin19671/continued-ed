package com.example.projects.studentgradebook;

import java.util.ArrayList;
import java.util.List;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
class Gradebook<T> {
    private List<T> students = new ArrayList<>();

    public void addStudent(T student) {
        students.add(student);
    }

    public void displayStudents() {
        students.forEach(System.out::println);
    }
}
