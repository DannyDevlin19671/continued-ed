package com.example.interfaces.access;

import java.io.IOException;

/**
 * @author danieldevlin
 * @date 02/03/2025
 * @project Interfaces
 *
 * The {@code FileDataAccess} interface defines a contract for loading, outputting,
 * and manipulating file data.
 * <p>
 * Implementations of this interface can handle various types of files such as text files and images.
 * For text files, the data is treated as plain text, whereas for images, the data is typically handled
 * as a Base64‑encoded string representation.
 * </p>
 * <p>
 * The interface provides methods to:
 * <ul>
 *   <li>Load file data from a specified path.</li>
 *   <li>Output (write) the current file data to a specified path.</li>
 *   <li>Retrieve the file data as a {@code String}.</li>
 *   <li>Set the file data from a given {@code String}.</li>
 * </ul>
 * </p>
 *
 */
public interface FileDataAccess {
    /**
     * Loads file data from the specified path.
     * <p>
     * For text files, the file data is read as plain text.
     * For images, the image data is loaded and may be stored internally
     * in a format suitable for conversion to a Base64‑encoded string.
     * </p>
     *
     * @param filePath the path of the file from which to load data.
     * @throws IOException if an error occurs while reading the file.
     */
    void loadData(String filePath) throws IOException;

    /**
     * Outputs the current file data to the specified file path.
     * <p>
     * For text files, the file data is written as plain text.
     * For images, the image data is written to the file after decoding the Base64‑encoded string if necessary.
     * </p>
     *
     * @param filePath the path of the file to which to write data.
     * @throws IOException if an error occurs while writing the file.
     */
    void outputData(String filePath) throws IOException;

    /**
     * Returns a string representation of the file’s contents.
     * <p>
     * For text files, this will be the file's text content.
     * For images, this is a Base64‑encoded string representing the image data.
     * </p>
     *
     * @return a {@code String} containing the file data.
     */
    String getData();

    /**
     * Sets the file’s contents from the provided string.
     * <p>
     * For text files, the provided string is stored directly.
     * For images, the provided string should be a Base64‑encoded representation of the image.
     * </p>
     *
     * @param data a {@code String} representing the file data.
     * @throws IOException if an error occurs when processing the data.
     */
    void setData(String data) throws IOException;
}