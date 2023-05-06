package Fundamentals.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class TwoSum {




    int[] twoSum(int[] array, int target) {

        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(target - array[i])) {
                map.put(array[i], i);
            } else {
                arr[0] = map.get(target - array[i]);
                arr[1] = i;
                return arr;
            }
        }

        throw new NoSuchElementException("No such 2 numbers...");
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum(arr, 6);
        System.out.println("indexes are " + ints[0] + " " + ints[1]);
    }
}
