package CSAug2023.Arrays.Section40;

import java.util.List;

public class TripletsLessThanTargetSum {


    public int tripletsLessThanTargetSum(int[] arr, int targetSum) {

        int tripletSumCount = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];

                if (sum < targetSum) {
                    tripletSumCount = tripletSumCount + end - start;
                    start++;
                } else {
                    end--;
                }

            }
        }
        return tripletSumCount;
    }


    public static void main(String[] args) {

        int arr[] = {1, 2, -3, 4, -2};
        TripletsLessThanTargetSum tripletsLessThanTargetSum = new TripletsLessThanTargetSum();
        int sum = tripletsLessThanTargetSum.tripletsLessThanTargetSum(arr, 14);
        System.out.println("total of triplets is : " + sum);
    }
}
