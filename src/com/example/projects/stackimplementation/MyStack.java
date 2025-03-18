package com.example.projects.stackimplementation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */

class MyStack<T> {
    private List<T> elements = new ArrayList<>();

    public void push(T item) {
        elements.add(item);
    }
    public T pop() {
        return elements.remove(elements.size() - 1);
    }
    public T peek() {
        return elements.get(elements.size() - 1);
    }
}
