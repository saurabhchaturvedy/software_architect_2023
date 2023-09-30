package CodingSimplifiedSep2023.Arrays.Problem30;

public class SubArrayWithMaximumSum {


    public int subArrayWithMaxSum(int[] arr) {

        int max_element = Integer.MIN_VALUE;
        int max_sum = Integer.MIN_VALUE;
        boolean isAnyValuePositive = false;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {
                isAnyValuePositive = true;
            }

            max_element = Math.max(arr[i], max_element); // handling all negatives scenarios

            sum = sum + arr[i];

            if (sum < 0) {
                sum = 0;
            }

            max_sum = Math.max(max_sum, sum);
        }

        return isAnyValuePositive ? max_sum : max_element;
    }


    public static void main(String[] args) {


        int[] arr = {-3, -4, 5, -1, 2, -4, 6, -1};
        SubArrayWithMaximumSum subArrayWithMaximumSum = new SubArrayWithMaximumSum();

        System.out.println("Subarray with maximum sum : " + subArrayWithMaximumSum.subArrayWithMaxSum(arr));
    }
}
