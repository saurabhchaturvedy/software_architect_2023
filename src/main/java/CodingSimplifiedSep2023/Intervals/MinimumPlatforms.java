package CodingSimplifiedSep2023.Intervals;

import java.util.Arrays;

public class MinimumPlatforms {


    public int minPlatforms(int[] arr, int[] dep) {

        Arrays.sort(arr);
        Arrays.sort(dep);

        int minimumPlatforms = 1;
        int platforms = 1;

        int i = 1;
        int j = 0;

        while (i < arr.length && j < dep.length) {

            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
            } else {

                platforms--;
                j++;
            }

            minimumPlatforms = Math.max(minimumPlatforms, platforms);
        }

        return minimumPlatforms;
    }


    public static void main(String[] args) {


        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        MinimumPlatforms minimumPlatforms = new MinimumPlatforms();

        ;

        System.out.println("Minimum required platforms : " + minimumPlatforms.minPlatforms(arr, dep));
    }
}
