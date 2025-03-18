package com.example.projects.librarymanagementsystem;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class LibraryTest {
    public static void main(String[] args) {
        Library<Book> library = new Library<>();

        Book book1 = new Book("Java Basics", "John Doe", 1);
        Book book2 = new Book("OOP with Java", "Jane Smith", 2);

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Library Books:");
        library.displayBooks();

        library.removeBook(book1);
        System.out.println("\nAfter removing a book:");
        library.displayBooks();
    }
}
