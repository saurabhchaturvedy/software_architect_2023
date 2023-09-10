package FundamentalsSep2023.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!map.containsKey(target - arr[i])) {

                map.put(arr[i], i);
            } else {

                result[1] = i;
                result[0] = map.get(target - arr[i]);
            }
        }

        return result;
    }


    public static void main(String[] args) {


        int[] arr = {1, 2, 6, 4, 8, 9};

        TwoSum twoSum = new TwoSum();
        int[] twoSumIndexes = twoSum.twoSum(arr, 15);

        System.out.print("Two sum indexes are :::: ");
        for (int x : twoSumIndexes) {
            System.out.print(x + " ");
        }
    }
}
