package com.example.projects.stackimplementation;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class StackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
    }
}
