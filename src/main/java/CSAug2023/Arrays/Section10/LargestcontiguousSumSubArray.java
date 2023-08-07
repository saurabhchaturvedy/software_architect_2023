package CSAug2023.Arrays.Section10;

public class LargestcontiguousSumSubArray {


    int largestContiguosSum(int[] arr) {
        int current_max = arr[0];
        int max_so_far = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current_max = Math.max(current_max + arr[i], arr[i]);
            max_so_far = Math.max(current_max, max_so_far);
        }

        return max_so_far;
    }


    void largestContiguosSumWithIndexes(int[] arr) {
        int current_max = arr[0];
        int max_so_far = arr[0];
        int start = 0;
        int end = 0;
        int s = 0;


        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > current_max + arr[i]) {
                current_max = arr[i];
                s = i;
            } else {

                current_max = current_max + arr[i];
            }

            if (current_max > max_so_far) {

                max_so_far = current_max;
                start = s;
                end = i;
            }
        }

        System.out.println("Subarray start index : " + start + " Subarray end index : " + end);
    }

    public static void main(String[] args) {


        int[] arr = {-3, -4, 4, -1, -2, 1, 5, -3};
        LargestcontiguousSumSubArray largestcontiguousSumSubArray = new LargestcontiguousSumSubArray();
        int i = largestcontiguousSumSubArray.largestContiguosSum(arr);

        System.out.println("Largest contiguous sum : " + i);


        largestcontiguousSumSubArray.largestContiguosSumWithIndexes(arr);
    }
}
