package CSAug2023.Arrays.Section40;

public class MinimumLengthSubArraySorted {


    public int minLengthSubArraySorted(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < arr.length - 1 && arr[left] < arr[left + 1]) {
            left++;
        }

        if(left==arr.length-1)
        {
            return 0;
        }

        while (right > 0 && arr[right - 1] < arr[right]) {
            right--;
        }


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = left + 1; i < right; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }


        while (left >= 0 && arr[left] > min) {
            left--;
        }

        while (right < arr.length && arr[right] < max) {
            right++;
        }

        return right - left + 1;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 3, 0, 12, 13, 8, 15, 18};
        MinimumLengthSubArraySorted minimumLengthSubArraySorted = new MinimumLengthSubArraySorted();
        int subArrayLength = minimumLengthSubArraySorted.minLengthSubArraySorted(arr);

        System.out.println("Subarray length is : " + subArrayLength);
    }
}
