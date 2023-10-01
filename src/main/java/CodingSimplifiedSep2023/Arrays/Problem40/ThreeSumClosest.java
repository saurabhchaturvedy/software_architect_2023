package CodingSimplifiedSep2023.Arrays.Problem40;

import java.util.Arrays;

public class ThreeSumClosest {


    public int threeSumClosest(int[] arr, int target) {

        Arrays.sort(arr);
        int sum = arr[0] + arr[1] + arr[2];
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {

            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {

                int currentSum = arr[i] + arr[start] + arr[end];

                if (currentSum == target) {
                    return target;
                } else if (currentSum < target) {

                    start++;
                } else {
                    end--;
                }

                int diffToTarget = Math.abs(currentSum - target);

                if (diffToTarget < minDifference) {

                    sum = currentSum;
                    minDifference = diffToTarget;
                }
            }
        }

        return sum;
    }


    public static void main(String[] args) {

        int[] arr = {-1, 2, 1, -4};

        ThreeSumClosest threeSumClosest = new ThreeSumClosest();

        System.out.println(" Three sum closest is : " + threeSumClosest.threeSumClosest(arr, 1));
    }
}
