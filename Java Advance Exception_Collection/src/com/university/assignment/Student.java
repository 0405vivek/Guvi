package com.university.assignment;
public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        setName(name);
        setAge(age);
        this.course = course;
    }

    private void setAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
        this.age = age;
    }

    private void setName(String name) throws NameNotValidException {
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name must not contain numbers or special characters.");
        }
        this.name = name;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}