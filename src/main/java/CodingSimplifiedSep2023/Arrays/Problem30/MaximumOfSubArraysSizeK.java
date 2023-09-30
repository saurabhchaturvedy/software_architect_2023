package CodingSimplifiedSep2023.Arrays.Problem30;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumOfSubArraysSizeK {


    public int[] maximumOfSubArraysSizeK(int[] arr, int k) {

        if (arr == null || arr.length == 0 || k <= 0) {
            return new int[]{0};
        }


        int n = arr.length;

        Deque<Integer> deque = new LinkedList<>();

        int[] maxValues = new int[n - k + 1];

        int maxValuesIndex = 0;

        int i = 0;

        while (i < n) {

            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {

                maxValues[maxValuesIndex++] = arr[deque.peekFirst()];
            }

            i++;
        }

        return maxValues;
    }


    public static void main(String[] args) {


        int[] arr = {6, 3, 4, 8, 11, 7, 5, 18, 21};

        MaximumOfSubArraysSizeK maximumOfSubArraysSizeK = new MaximumOfSubArraysSizeK();

        int[] ints = maximumOfSubArraysSizeK.maximumOfSubArraysSizeK(arr, 3);

        for (int x : ints) {
            System.out.print(x + " ");
        }
    }
}
