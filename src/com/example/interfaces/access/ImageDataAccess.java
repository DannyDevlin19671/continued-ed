package com.example.interfaces.access;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.util.Base64;

/**
 * @author danieldevlin
 * @date 02/03/2025
 * @project Interfaces
 * Implementation of the FileDataAccess interface for handling image data.
 * <p>
 * This class provides methods to load image data from a file, output image data to a file,
 * and convert image data to and from a Base64-encoded string representation.
 * The image data is stored as a BufferedImage, and when encoded, the image is always in PNG format.
 * </p>
 *
 */
public class ImageDataAccess implements FileDataAccess {

    /**
     * The BufferedImage instance that holds the image data.
     */
    private BufferedImage image;

    /**
     * Loads an image from the specified file path.
     *
     * @param filePath the path to the image file to load.
     * @throws IOException if an error occurs while reading the image file.
     */
    @Override
    public void loadData(String filePath) throws IOException {
        image = ImageIO.read(new File(filePath));
    }

    /**
     * Writes the current image to the specified file path.
     * <p>
     * The image format is determined by the file extension in the provided file path.
     * If the file extension is not specified or recognized, PNG is used as the default format.
     * </p>
     *
     * @param filePath the file path to write the image data.
     * @throws IOException if an error occurs while writing the image to the file.
     */
    @Override
    public void outputData(String filePath) throws IOException {
        // Determine format from file extension (default to "png")
        String format = "png";
        int dotIndex = filePath.lastIndexOf('.');
        if (dotIndex != -1 && dotIndex < filePath.length() - 1) {
            format = filePath.substring(dotIndex + 1);
        }
        ImageIO.write(image, format, new File(filePath));
    }

    /**
     * Returns a Base64-encoded string representation of the current image.
     * <p>
     * The image is encoded using PNG format. If the image is not set, this method returns null.
     * </p>
     *
     * @return a Base64 string of the image data, or null if no image is loaded.
     */
    @Override
    public String getData() {
        if (image == null) {
            return null;
        }
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            // Encode image to Base64 using PNG format
            ImageIO.write(image, "png", baos);
            byte[] imageBytes = baos.toByteArray();
            return Base64.getEncoder().encodeToString(imageBytes);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the image data from a Base64-encoded string.
     * <p>
     * The provided string is decoded and converted into a BufferedImage.
     * </p>
     *
     * @param data the Base64-encoded string representing the image data.
     * @throws IOException if an error occurs while decoding the string or reading the image.
     */
    @Override
    public void setData(String data) throws IOException {
        byte[] imageBytes = Base64.getDecoder().decode(data);
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes)) {
            image = ImageIO.read(bais);
            if (image == null) {
                throw new IOException("Failed to decode image from the provided data.");
            }
        }
    }
}