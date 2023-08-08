package CSAug2023.Arrays.Section30;

public class MaximumSubArraySumKadane {


    public int maximumSumSubArray(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];


        for (int i = 1; i < array.length; i++) {

            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }


    public static void main(String[] args) {

        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubArraySumKadane maximumSubArraySumKadane = new MaximumSubArraySumKadane();
        int sum = maximumSubArraySumKadane.maximumSumSubArray(array);

        System.out.println(" sum is : " + sum);
    }
}
