package CSAug2023.Arrays.Section50;

import java.util.ArrayList;
import java.util.List;

public class SubArraysWithValuesLessThanMult {


    public List<List<Integer>> subArraysLessThanMultiplication(int[] arr, int val) {
        int multipliedValue = 1;
        int start = 0;
        List<List<Integer>> solution = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            multipliedValue = multipliedValue * arr[i];


            while (multipliedValue >= val) {
                multipliedValue = multipliedValue / arr[start];
                start++;
            }
            List<Integer> list = new ArrayList<>();
            for (int j = i; j >= start; j--) {

                list.add(0, arr[j]);
                solution.add(list);
            }
        }

        return solution;
    }


    public static void main(String[] args) {

        int[] arr = {2, 6, 3, 8, 5, 4, 7};
        int target = 30;
        SubArraysWithValuesLessThanMult subArraysWithValuesLessThanMult = new SubArraysWithValuesLessThanMult();
        List<List<Integer>> list = subArraysWithValuesLessThanMult.subArraysLessThanMultiplication(arr, target);
        System.out.println(list);
    }
}
