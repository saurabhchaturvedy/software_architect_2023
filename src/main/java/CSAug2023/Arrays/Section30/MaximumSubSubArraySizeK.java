package CSAug2023.Arrays.Section30;

public class MaximumSubSubArraySizeK {


    public int maximumSumSubarraySizeK(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int maxSum = 0;


        while (right < k) {
            currentSum = currentSum + arr[right];
            right++;
        }


        while (right < arr.length) {
            currentSum = currentSum + arr[right] - arr[left];
            maxSum = Math.max(currentSum, maxSum);
            left++;
            right++;
        }

        return maxSum;
    }


    public static void main(String[] args) {

        int[] arr = {1, 5, 4, 2, 9, 9, 9};
        MaximumSubSubArraySizeK maximumSubSubArraySizeK = new MaximumSubSubArraySizeK();
        int sum = maximumSubSubArraySizeK.maximumSumSubarraySizeK(arr, 3);
        System.out.println("maximum sum is : " + sum);
    }
}
