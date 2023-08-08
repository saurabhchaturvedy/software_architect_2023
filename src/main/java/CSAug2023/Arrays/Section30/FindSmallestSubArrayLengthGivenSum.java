package CSAug2023.Arrays.Section30;

public class FindSmallestSubArrayLengthGivenSum {


    public int smallestSubArrayLength(int[] arr, int targetSum) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;


        while (right < arr.length) {

            currentSum = currentSum + arr[right];


            if (currentSum >= targetSum) {
                currentSum = currentSum - arr[left];
                minLength = Math.min(minLength, right - left + 1);
                left++;
            }


            right++;
        }


        return minLength;
    }

    public static void main(String[] args) {

        int[] array = {2, 1, 5, 2, 3, 2};
        int targetSum = 7;

        FindSmallestSubArrayLengthGivenSum findSmallestSubArrayLengthGivenSum = new FindSmallestSubArrayLengthGivenSum();
        int length = findSmallestSubArrayLengthGivenSum.smallestSubArrayLength(array, targetSum);

        System.out.println("Minimum length of the window is : " + length);
    }
}
