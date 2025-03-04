package com.example.interfaces.access;

import java.io.IOException;

/**
 * @author danieldevlin
 * @date 03/03/2025
 * @project Interfaces
 */
public class Main {
    public static void main(String[] args){
        // Create an instance of TextDataAccess for handling text files.
        FileDataAccess textAccess = new TextDataAccess();
        // Print the current working directory to help debug file path issues
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        try {
            // Load text file data (ensure that "example.txt" exists in the correct location)
            textAccess.loadData("src/com/java/interfaces/access/example.txt");
            // Display the text data
            System.out.println("Text file data:");
            System.out.println(textAccess.getData());
            // Output the text data to another file
            textAccess.outputData("outputText.txt");
        } catch (IOException e) {
            System.err.println("Error handling text file: " + e);
        }

        // Create an instance of ImageDataAccess for handling image files.
        FileDataAccess imageAccess = new ImageDataAccess();
        try {
            // Load image file data (ensure that "example.png" exists in the correct location)
            imageAccess.loadData("src/com/java/interfaces/access/flower.png");
            // Retrieve the Base64-encoded string of the image data and print it
            System.out.println("Image file data (Base64 encoded):");
            System.out.println(imageAccess.getData());
            // Output the image data to another file (the format is determined by the file extension)
            imageAccess.outputData("outputImage.png");
        } catch (IOException e) {
            System.err.println("Error handling image file: " + e.getMessage());
        }
    }
}
