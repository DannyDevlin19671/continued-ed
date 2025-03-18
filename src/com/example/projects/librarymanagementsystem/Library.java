package com.example.projects.librarymanagementsystem;

import java.util.*;
/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */

class Library<T> {
    private List<T> books = new ArrayList<>();

    public void addBook(T book) {
        books.add(book);
    }

    public void removeBook(T book) {
        books.remove(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            books.forEach(System.out::println);
        }
    }
}
