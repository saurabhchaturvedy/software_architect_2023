package Good_Solutions_Problems;

import java.util.Arrays;

public class MinimumPlatforms2 {
    public static int findMinPlatforms(int[] arrivals, int[] departures) {
        Arrays.sort(arrivals);
        Arrays.sort(departures);

        int platforms = 0;
        int maxPlatforms = 0;
        int i = 0; // pointer for arrivals
        int j = 0; // pointer for departures

        while (i < arrivals.length && j < departures.length) {
            if (arrivals[i] <= departures[j]) {
                platforms++;
                i++;
            } else {
                platforms--;
                j++;
            }

            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrivals = {900, 910, 925, 930};
        int[] departures = {930, 940, 935, 1000};

        int minPlatforms = findMinPlatforms(arrivals, departures);
        System.out.println("Minimum number of platforms required: " + minPlatforms);
    }
}


