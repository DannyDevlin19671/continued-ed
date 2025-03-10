package com.example.stringbuilder;

/**
 * @author danieldevlin
 * @date 10/03/2025
 * @project continued-ed
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        // Creating a new StringBuilder with an initial string
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial: " + sb);

        // Append: Adds a string to the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert: Inserts a string at the specified index
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace: Replaces a substring from start index (inclusive) to end index (exclusive)
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // Delete: Removes characters from start index (inclusive) to end index (exclusive)
        sb.delete(2, 3);  // Removing the character after "Hi"
        System.out.println("After delete: " + sb);

        // Reverse: Reverses the sequence of characters in the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Capacity and length: Shows current length and capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // Clearing the StringBuilder by setting its length to 0
        sb.setLength(0);
        System.out.println("After clearing: '" + sb.toString() + "'");
    }
}
