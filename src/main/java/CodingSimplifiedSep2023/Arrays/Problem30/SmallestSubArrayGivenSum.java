package CodingSimplifiedSep2023.Arrays.Problem30;

public class SmallestSubArrayGivenSum {


    public int smallestSubLengthGivenSum(int[] arr, int target) {
        int start = 0;
        int end = 0;

        int currentSum = 0;

        int smallestLength = Integer.MAX_VALUE;

        while (end < arr.length) {

            currentSum = currentSum + arr[end];


            while (currentSum > target && start <= end) {
                currentSum = currentSum - arr[start];
                start++;
            }

            if (currentSum == target) {

                smallestLength = Math.min(smallestLength, end - start + 1);

            }

            end++;
        }

        return smallestLength;
    }


    public static void main(String[] args) {


        int[] arr = {4, 1, 6, 2, 3};

        SmallestSubArrayGivenSum smallestSubArrayGivenSum = new SmallestSubArrayGivenSum();

        int smallestSubLengthGivenSum = smallestSubArrayGivenSum.smallestSubLengthGivenSum(arr, 8);

        System.out.println(" Smallest sub array length with given sum : " + smallestSubLengthGivenSum);
    }
}
