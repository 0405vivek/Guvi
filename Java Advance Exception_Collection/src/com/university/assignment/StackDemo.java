package com.university.assignment;
import java.util.Stack;
public class StackDemo {
    private Stack<Integer> stack = new Stack<>();

    public void push(int element) {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public void display() {
        System.out.println("Stack contents: " + stack);
    }

    public static void runDemo() {
        StackDemo s = new StackDemo();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}