package CSAug2023.Arrays.Section40;

import java.util.Arrays;

public class TripletsClosestSum {


    public int tripletClosestSum(int[] arr, int target) {

        Arrays.sort(arr);
        int closestSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int currentSum = arr[i] + arr[left] + arr[right];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }


    public static void main(String[] args) {

        int[] arr = {-1, 2, 1, -4};
        TripletsClosestSum tripletsClosestSum = new TripletsClosestSum();
        int sum = tripletsClosestSum.tripletClosestSum(arr, 1);
        System.out.println("closest sum is = " + sum);
    }
}
