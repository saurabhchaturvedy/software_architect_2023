package CodingSimplifiedSep2023.Arrays.Problem10;

public class LargestContiguousSumSubArray {


    public int largestContiguousSumSubArray(int[] arr) {

        int current_max = arr[0];
        int max_so_far = arr[0];

        for (int i = 1; i < arr.length; i++) {

            current_max = Math.max(current_max + arr[i], arr[i]);
            max_so_far = Math.max(current_max, max_so_far);
        }

        return max_so_far;
    }


    public static void main(String[] args) {


        int[] arr = {-3, -4, 4, -1, -2, 1, 5, -3};

        LargestContiguousSumSubArray largestContiguousSumSubArray = new LargestContiguousSumSubArray();
        int largestContiguosSum = largestContiguousSumSubArray.largestContiguousSumSubArray(arr);

        System.out.println("Largest contiguos sum : " + largestContiguosSum);
    }
}
