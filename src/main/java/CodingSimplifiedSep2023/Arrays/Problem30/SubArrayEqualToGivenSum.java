package CodingSimplifiedSep2023.Arrays.Problem30;

public class SubArrayEqualToGivenSum {


    public void subArrayGivenSum(int[] arr, int target) {

        int start = 0;
        int end = 0;

        int currentSum = 0;


        while (end < arr.length) {

            currentSum = currentSum + arr[end];


            while (currentSum > target && start <= end) {

                currentSum = currentSum - arr[start];
                start++;
            }


            if (currentSum == target) {

                System.out.print("Target element found at index [ " + start + " , " + end + " ]");
                return;
            }

            end++;
        }
    }


    public static void main(String[] args) {


        int[] arr = {1, 4, 20, 3, 10, 5};

        SubArrayEqualToGivenSum subArrayEqualToGivenSum = new SubArrayEqualToGivenSum();

        subArrayEqualToGivenSum.subArrayGivenSum(arr, 33);
    }
}
