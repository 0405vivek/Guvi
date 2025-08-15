package com.university.assignment;
import java.util.HashMap;
public class StudentGrades {
    private HashMap<String, Integer> grades = new HashMap<>();

    public void addStudent(String name, int grade) {
        grades.put(name, grade);
    }

    public void removeStudent(String name) {
        grades.remove(name);
    }

    public void displayGrade(String name) {
        Integer grade = grades.get(name);
        if (grade != null) {
            System.out.println(name + "'s Grade: " + grade);
        } else {
            System.out.println("Student not found!");
        }
    }

    public static void runDemo() {
        StudentGrades sg = new StudentGrades();
        sg.addStudent("Ramesh", 85);
        sg.addStudent("Suresh", 90);
        sg.displayGrade("Ramesh");
        sg.removeStudent("Suresh");
        sg.displayGrade("Suresh");
    }
}