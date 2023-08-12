package CSAug2023.Arrays.Section50;

public class SubarrayWithMaxOnes {


    public int subArrayWithMax1sLength(int[] arr, int k) {

        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            return -1;
        }


        int start = 0;
        int end = 0;
        int maxLength = 0;
        int numberOfZeroes = 0;


        while (end < arr.length) {

            if (arr[end] == 0) {
                numberOfZeroes++;
            }

            if (numberOfZeroes > k) {
                if (arr[start] == 0) {
                    numberOfZeroes--;
                }
                start++;
            }

            maxLength = Math.max(end - start + 1, maxLength);
            end++;
        }

        return maxLength;
    }


    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 0, 1, 1, 1, 0};
        int k = 2;
        SubarrayWithMaxOnes subarrayWithMaxOnes = new SubarrayWithMaxOnes();
        int length = subarrayWithMaxOnes.subArrayWithMax1sLength(arr, k);
        System.out.println("max length of the subarray is : " + length);
    }
}
