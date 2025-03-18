package com.example.projects.librarymanagementsystem;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
class Book {
    private String title;
    private String author;
    private int bookId;

    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getBookId() { return bookId; }

    @Override
    public String toString() {
        return bookId + " - " + title + " by " + author;
    }
}

