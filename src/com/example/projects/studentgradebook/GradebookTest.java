package com.example.projects.studentgradebook;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class GradebookTest {
    public static void main(String[] args) {
        Gradebook<Student> gradebook = new Gradebook<>();

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        student1.addGrade(90);
        student1.addGrade(85);
        student2.addGrade(78);
        student2.addGrade(82);

        gradebook.addStudent(student1);
        gradebook.addStudent(student2);

        System.out.println("Students in Gradebook:");
        gradebook.displayStudents();
    }
}
