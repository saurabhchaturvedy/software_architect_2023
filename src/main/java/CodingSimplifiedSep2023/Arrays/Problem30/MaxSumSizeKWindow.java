package CodingSimplifiedSep2023.Arrays.Problem30;

public class MaxSumSizeKWindow {


    public int maxSumSizeKWindow(int[] arr, int k) {

        int start = 0;
        int end = 0;

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (end < arr.length) {

            currentSum = currentSum + arr[end];

            if (end >= k - 1) {

                maxSum = Math.max(currentSum, maxSum);
                currentSum = currentSum - arr[start];
                start++;
            }

            end++;
        }

        return maxSum;
    }


    public static void main(String[] args) {


        MaxSumSizeKWindow maxSumSizeKWindow = new MaxSumSizeKWindow();

        int[] arr = {3, 5, 2, 1, 7};

        int maxSum = maxSumSizeKWindow.maxSumSizeKWindow(arr, 2);

        System.out.println(" Max sum of window size of k=2 is : " + maxSum);
    }
}
