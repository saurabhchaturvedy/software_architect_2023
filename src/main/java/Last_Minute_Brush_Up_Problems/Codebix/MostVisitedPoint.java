package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.HashMap;
import java.util.Map;

public class MostVisitedPoint {

    public static int mostVisitedPoint(int n, int[] a) {
        Map<Integer, Integer> pointFrequency = new HashMap<>();

        // Iterate through intervals and update point frequencies
        for (int i = 0; i < a.length - 1; i++) {
            int start = Math.min(a[i], a[i + 1]);
            int end = Math.max(a[i], a[i + 1]);

            for (int j = start; j < end; j++) {
                pointFrequency.put(j, pointFrequency.getOrDefault(j, 0) + 1);
            }
        }

        // Find the point with the maximum frequency
        int mostVisitedPoint = -1;
        int maxFrequency = -1;

        for (Map.Entry<Integer, Integer> entry : pointFrequency.entrySet()) {
            int point = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency || (frequency == maxFrequency && point < mostVisitedPoint)) {
                mostVisitedPoint = point;
                maxFrequency = frequency;
            }
        }

        return mostVisitedPoint;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] a = {1, 5, 10, 3};

        int result = mostVisitedPoint(n, a);
        System.out.println("Most visited point: " + result);
    }
}
