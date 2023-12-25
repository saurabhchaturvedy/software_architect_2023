package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.Arrays;

public class DivisibilityArrayExample {
    public static void main(String[] args) {
        double[] numbers = {2, 4, 6, 8};



        // Using Java 8 Stream API to create an array representing divisibility counts
        int[] divisibilityCounts = Arrays.stream(numbers)
                .mapToInt(value -> (int) Arrays.stream(numbers)
                        .filter(divisor -> value % divisor == 0)
                        .count())
                .toArray();

        // Print the resulting array
        System.out.println(Arrays.toString(divisibilityCounts));
    }
}
