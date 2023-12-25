package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.Arrays;

public class DivisibilityExample {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 8, 2};


        long count = Arrays.stream(numbers).count();
        int intExact = Math.toIntExact(count);

        // Using Java 8 Stream API to create an array representing divisibility counts
        int[] divisibilityCounts = Arrays.stream(numbers)
                .map(value -> (int) Arrays.stream(numbers)
                        .filter(divisor -> divisor != 0 && value % divisor == 0)
                        .count())
                .toArray();

        // Print the resulting array
        System.out.println(Arrays.toString(divisibilityCounts));
        System.out.println(Arrays.stream(divisibilityCounts).max().getAsInt());
    }
}
