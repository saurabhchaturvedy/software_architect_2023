package CodingSimplifiedSep2023.Arrays.Problem40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindQuadrupletsForSum {


    public List<List<Integer>> quadrupletsSum(int[] arr, int target) {

        Arrays.sort(arr);

        List<List<Integer>> quadruplets = new ArrayList<>();

        for (int i = 0; i < arr.length - 3; i++) {

            for (int j = i + 1; j < arr.length - 2; j++) {

                int sum = target - (arr[i] + arr[j]);

                int start = i + 1;
                int end = arr.length - 1;

                while (start < end) {

                    int t = arr[start] + arr[end];

                    if (t == sum) {
                        quadruplets.add(Arrays.asList(arr[start], arr[end], arr[i], arr[j]));
                        start++;
                        end--;
                    } else if (t < sum) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }

        return quadruplets;
    }


    public static void main(String[] args) {

        int arr[] = {1, 2, -3, 4, -2, -1, 3};

        FindQuadrupletsForSum findQuadrupletsForSum = new FindQuadrupletsForSum();

        List<List<Integer>> list = findQuadrupletsForSum.quadrupletsSum(arr, 3);

        System.out.println(list);
    }
}
