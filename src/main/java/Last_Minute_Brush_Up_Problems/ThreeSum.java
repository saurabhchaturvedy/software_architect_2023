package Last_Minute_Brush_Up_Problems;

import java.util.Arrays;

public class ThreeSum {


    private static void threeSum(int[] arr, int target) {
        Arrays.sort(arr);
        int i, j, k = 0;
        int sum = 0;
        for (i = 0; i < arr.length - 2; i++) {

            j = i + 1;
            k = arr.length - 1;

            while (j < k) {
                sum = arr[i] + arr[j] + arr[k];

                if (sum == target) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

    }


    public static void main(String[] args) {

        threeSum(new int[]{2, 4, 3, 7, 1, 0}, 6);
    }
}