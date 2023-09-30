package CodingSimplifiedSep2023.Arrays.Problem40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTripletsForSum {


    public List<List<Integer>> tripletSum(int[] arr, int target) {

        Arrays.sort(arr);

        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {

            int sum = target - arr[i];

            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {

                int t = arr[start] + arr[end];

                if (t == sum) {
                    triplets.add(Arrays.asList(arr[start], arr[end], arr[i]));
                    start++;
                    end--;
                } else if (t < sum) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return triplets;
    }


    public static void main(String[] args) {

        int[] arr = {0, -1, 2, -3, 1};

        FindTripletsForSum findTripletsForSum = new FindTripletsForSum();

        List<List<Integer>> list = findTripletsForSum.tripletSum(arr, -2);

        System.out.println(list);
    }
}
