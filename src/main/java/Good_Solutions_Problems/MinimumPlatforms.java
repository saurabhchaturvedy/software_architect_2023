package Good_Solutions_Problems;

import java.util.Arrays;

public class MinimumPlatforms {

    public static int findMinPlatforms(int[] arrival, int[] departure) {
        int n = arrival.length;

        // Sort the arrival and departure arrays in ascending order
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platforms = 1; // Minimum number of platforms required
        int maxPlatforms = 1; // Maximum number of platforms required at any time
        int i = 1; // Iterator for arrival array
        int j = 0; // Iterator for departure array

        // Perform a merge-like traversal to find the minimum number of platforms
        while (i < n && j < n) {
            // If a train arrives before the previous train departs
            if (arrival[i] <= departure[j]) {
                platforms++;
                i++;

                // Update the maximum number of platforms required
                if (platforms > maxPlatforms) {
                    maxPlatforms = platforms;
                }
            } else { // If a train departs before the next train arrives
                platforms--;
                j++;
            }
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int minimumPlatforms = findMinPlatforms(arrival, departure);
        System.out.println("Minimum number of platforms required: " + minimumPlatforms);
    }
}
