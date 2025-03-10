import java.util.Arrays;
import java.util.List;

/**
 * @author danieldevlin
 * @date 04/03/2025
 * @project Default (Template) Project
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using lambda to filter even numbers and summing them
        int sumEven = numbers.stream()
                .filter(n -> n % 2 == 0)      // Filter even numbers
                .mapToInt(s -> s)  // Convert to int
                .sum();                      // Sum the even numbers

        System.out.println("Sum of even numbers: " + sumEven);  // Expected output: 30
    }
}