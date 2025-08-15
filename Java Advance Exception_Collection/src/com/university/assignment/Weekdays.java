package com.university.assignment;
import java.util.Scanner;
public class Weekdays {
    public static void run() {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day index (0-6): ");
        int index = sc.nextInt();
        try {
            System.out.println("Day is: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a value between 0 and 6.");
        }
    }
}