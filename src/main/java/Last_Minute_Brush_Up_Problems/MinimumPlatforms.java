package Last_Minute_Brush_Up_Problems;

import java.util.Arrays;

public class MinimumPlatforms {


    public int minPlatforms(int[] arr, int[] dep) {

        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms = 1;
        int min_platforms = 1;

        int i = 1;
        int j = 0;

        while (i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) {
                i++;
                platforms++;

                if (platforms > min_platforms) {
                    min_platforms = platforms;
                }
            } else {
                j++;
                platforms--;
            }
        }


        return min_platforms;
    }


    public static void main(String[] args) {

        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        MinimumPlatforms minimumPlatforms = new MinimumPlatforms();
        System.out.println("Minimum number of platforms is : " + minimumPlatforms.minPlatforms(arr, dep));
    }
}
