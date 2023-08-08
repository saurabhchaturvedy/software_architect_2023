package CSAug2023.Arrays.Section30;

public class SubArraySumEqualToGivenSum {


    public void subArrayWithAGivenSum(int[] arr, int targetSum) {
        int left = 0;
        int right = 0;
        int currentSum = 0;


        while (right < arr.length) {

            currentSum = currentSum + arr[right];


            if (currentSum > targetSum) {
                currentSum = currentSum - arr[left];
                left++;
            }

            if (currentSum == targetSum) {
                System.out.println("subarray found within indexes : [" + left + "," + right + "]");
                return;
            }

            right++;
        }
    }


    public static void main(String[] args) {

        int arr[] = {4, 2, 5, 3, 1, 8};
        SubArraySumEqualToGivenSum subArraySumEqualToGivenSum = new SubArraySumEqualToGivenSum();
        subArraySumEqualToGivenSum.subArrayWithAGivenSum(arr, 9);
    }
}
