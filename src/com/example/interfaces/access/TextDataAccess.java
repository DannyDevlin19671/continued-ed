package com.example.interfaces.access;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author danieldevlin
 * @date 02/03/2025
 * @project Interfaces
 *
 * The {@code TextDataAccess} class is an implementation of the {@link FileDataAccess} interface,
 * which provides file-based operations for reading and writing textual data.
 *
 * <p>
 * This class encapsulates a simple String-based data storage mechanism, where data can be loaded from a file,
 * modified in memory, and written back to a file.
 * </p>
 *
 * <p>
 * The primary methods include:
 * <ul>
 *   <li>{@link #loadData(String)}: Reads text data from a file specified by the file path.</li>
 *   <li>{@link #outputData(String)}: Writes the current data to a file specified by the file path.</li>
 *   <li>{@link #getData()}: Returns the currently stored data.</li>
 *   <li>{@link #setData(String)}: Sets the stored data.</li>
 * </ul>
 * </p>
 *
 * <p>
 * This implementation uses the {@code java.nio.file.Files} and {@code java.nio.file.Paths} classes for file I/O.
 * </p>
 */
public class TextDataAccess implements FileDataAccess {

    /**
     * Holds the textual data loaded from a file or set programmatically.
     */
    private String data;

    /**
     * Loads data from the file at the specified file path.
     *
     * <p>
     * This method reads all bytes from the file and converts them into a {@code String}
     * which is stored internally.
     * </p>
     *
     * @param filePath the path of the file from which data is to be loaded
     * @throws IOException if an I/O error occurs reading from the file or if the file content cannot be decoded
     */
    @Override
    public void loadData(String filePath) throws IOException {
        data = new String(Files.readAllBytes(Paths.get(filePath)));
    }

    /**
     * Writes the current data to a file at the specified file path.
     *
     * <p>
     * This method converts the stored {@code String} data into a byte array and writes it to the file.
     * </p>
     *
     * @param filePath the path of the file where data is to be written
     * @throws IOException if an I/O error occurs writing to the file
     */
    @Override
    public void outputData(String filePath) throws IOException {
        Files.write(Paths.get(filePath), data.getBytes());
    }

    /**
     * Returns the currently stored data.
     *
     * @return the data as a {@code String}
     */
    @Override
    public String getData() {
        return data;
    }

    /**
     * Sets the internal data to the specified value.
     *
     * @param data the new data to be stored
     */
    @Override
    public void setData(String data) {
        this.data = data;
    }
}