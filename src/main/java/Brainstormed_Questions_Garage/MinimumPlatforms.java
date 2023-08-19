package Brainstormed_Questions_Garage;

import java.util.Arrays;

public class MinimumPlatforms {


    public int minimumPlatforms(int[] arr, int[] dep) {

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0;
        int j = 0;

        int min_platforms = 0;
        int current_platforms = 0;


        while (i < arr.length && j < dep.length) {


            if (arr[i] <= dep[j]) {
                i++;
                current_platforms++;
            } else {

                if (arr[i] > dep[j]) {
                    j++;
                    current_platforms--;
                }
            }

            if (current_platforms > min_platforms) {
                min_platforms = current_platforms;
            }
        }

        return min_platforms;
    }


    public static void main(String[] args) {

        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        MinimumPlatforms minimumPlatforms = new MinimumPlatforms();
        int minPlatforms = minimumPlatforms.minimumPlatforms(arr, dep);

        System.out.println("Minimum number of platforms are : " + minPlatforms);
    }
}
