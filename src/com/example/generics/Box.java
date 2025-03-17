package com.example.generics;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 * <p>How It Works:
 * T is a type parameter that represents any object type.
 * The class can store any type (String, Integer, Double, etc.).
 * </p>
 * <p>
 * Example Usage:
 * </p>
 * <p>
 * Box<String> stringBox = new Box<>();
 * stringBox.setItem("Hello");
 * System.out.println(stringBox.getItem()); // Output: Hello
 * </p>
 */
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}
