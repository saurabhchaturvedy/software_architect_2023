package CodingSimplifiedSep2023.Arrays.Problem50;

import java.util.ArrayList;
import java.util.List;

public class SubArraysWithMultiplicationLessThanNumber {


    public List<List<Integer>> subArraysWithMultLessThanNumber(int[] arr, int target) {

        int start = 0;
        List<List<Integer>> list = new ArrayList<>();
        int mult = 1;

        for (int i = 0; i < arr.length; i++) {

            mult = mult * arr[i];

            if (mult >= target) {
                mult = mult / arr[start];
                start++;
            }

            List<Integer> newList = new ArrayList<>();

            for (int j = i; j >= start; j--) {
                newList.add(0, arr[i]);
                list.add(newList);
            }
        }

        return list;
    }


    public static void main(String[] args) {

        int arr[] = {4, 2, 5, 3, 6};

        SubArraysWithMultiplicationLessThanNumber subArraysWithMultiplicationLessThanNumber = new SubArraysWithMultiplicationLessThanNumber();
        List<List<Integer>> list = subArraysWithMultiplicationLessThanNumber.subArraysWithMultLessThanNumber(arr, 10);

        System.out.println(list);
    }
}
