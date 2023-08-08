package CSAug2023.Arrays.Section30;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaximumOfAllSubArraysSizeK {


    public List<Integer> maxAllSubArraysSizeK(int[] array, int k) {

        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {

            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && array[deque.peekLast()] < array[i]) {
                deque.pollLast();
            }


            deque.offerLast(i);


            if (i >= k - 1) {

                result.add(array[deque.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        MaximumOfAllSubArraysSizeK maximumSubSubArraySizeK = new MaximumOfAllSubArraysSizeK();
        List<Integer> maxArray = maximumSubSubArraySizeK.maxAllSubArraysSizeK(arr, 3);

        for (int x : maxArray) {
            System.out.print(x + " ");
        }
    }
}
