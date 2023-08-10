package CSAug2023.Arrays.Section40;

import java.util.*;

public class TripletSum {


    public Set<List<Integer>> tripletSum(int[] array, int targetSum) {

        Arrays.sort(array);
        Set<List<Integer>> list = new HashSet<>();  // set for handling duplicates

        for (int i = 0; i < array.length - 2; i++) {
            int sum = targetSum - array[i];

            int start = i + 1;
            int end = array.length - 1;

            while (start < end) {
                int t = array[start] + array[end];

                if (t == sum) {

                    list.add(Arrays.asList(array[start], array[end], array[i]));
                    start++;
                    end--;
                } else if (t < sum) {

                    start++;
                } else {
                    end--;
                }
            }
        }

        return list;
    }


    public static void main(String[] args) {

        // int[] arr = {2, 4, 6, 8, 3, 5, 7};
        int[] arr = {-1, 0, 1, 2, -1, -4};
        TripletSum tripletSum = new TripletSum();
        Set<List<Integer>> lists = tripletSum.tripletSum(arr, 0);
        System.out.println(lists);
    }
}
