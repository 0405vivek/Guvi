package com.university.assignment;
public class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new InvalidVoterAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("VoterID: " + voterId + ", Name: " + name + ", Age: " + age);
    }
}