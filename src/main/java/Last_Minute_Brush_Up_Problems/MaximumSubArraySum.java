package Last_Minute_Brush_Up_Problems;

public class MaximumSubArraySum {


    public int maxSubarraySum(int[] arr) {

        int max_so_far = arr[0];
        int curr_max = arr[0];


        for (int i = 1; i < arr.length; i++) {

            curr_max = Math.max(arr[i], arr[i] + curr_max);
            max_so_far = Math.max(max_so_far, curr_max);
        }

        return max_so_far;
    }


    public static void main(String[] args) {

        int[] arr = {-2, -5, 6, -2, -3, 1, 5, -6};
        MaximumSubArraySum maximumSubArraySum = new MaximumSubArraySum();
        int sum = maximumSubArraySum.maxSubarraySum(arr);
        System.out.println("Maximum sub array sum : " + sum);
    }
}
