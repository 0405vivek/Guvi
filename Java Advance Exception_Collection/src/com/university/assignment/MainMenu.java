package com.university.assignment;
import java.util.Scanner;
public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Main Menu =====");
            System.out.println("1. Q1 - Student Exception Handling");
            System.out.println("2. Q2 - Voter Exception Handling");
            System.out.println("3. Q3 - Weekdays Array");
            System.out.println("4. Q4 - Student Grades HashMap");
            System.out.println("5. Q5 - Stack Demo");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        Student s1 = new Student(101, "Ramesh", 19, "B.Sc");
                        s1.display();
                        Student s2 = new Student(102, "Suresh123", 18, "B.Com"); // invalid
                        s2.display();
                    } catch (Exception e) {
                        System.out.println("Exception: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        Voter v1 = new Voter(1, "Rahul", 20);
                        v1.display();
                        Voter v2 = new Voter(2, "Amit", 16);
                        v2.display();
                    } catch (Exception e) {
                        System.out.println("Exception: " + e.getMessage());
                    }
                    break;
                case 3:
                    Weekdays.run();
                    break;
                case 4:
                    StudentGrades.runDemo();
                    break;
                case 5:
                    StackDemo.runDemo();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}



//=== Q1: Student Exception Handling ===
//Roll No: 101, Name: Ramesh, Age: 19, Course: B.Sc
//Exception: Name must not contain numbers or special characters.
//Exception: Age must be between 15 and 21.
//
//        === Q2: Voter Exception Handling ===
//VoterID: 1, Name: Rahul, Age: 20
//Exception: Invalid age for voter
//
//=== Q3: Weekdays Array ===
//Index 2 => Tuesday
//Index 10 => Invalid index! Please enter a value between 0 and 6.
//
//        === Q4: Student Grades HashMap ===
//Ramesh's Grade: 85
//Student not found!
//
//        === Q5: Stack Demo ===
//Pushed: 10
//Pushed: 20
//Pushed: 30
//Stack contents: [10, 20, 30]
//Popped: 30
//Stack contents: [10, 20]
//
//        === END OF ALL PROGRAMS ===
