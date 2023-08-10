package CSAug2023.Arrays.Section40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {


    public List<List<Integer>> fourSum(int[] arr, int targetSum) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {

                int sum = targetSum - (arr[i] + arr[j]);

                int start = j + 1;
                int end = arr.length - 1;

                while (start < end) {

                    int t = arr[start] + arr[end];

                    if (t == sum) {

                        list.add(Arrays.asList(arr[start], arr[end], arr[i], arr[j]));
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

        return list;
    }


    public static void main(String[] args) {

        int[] arr = {1, 0, -1, 0, -2, 2};
        FourSum fourSum = new FourSum();
        List<List<Integer>> list = fourSum.fourSum(arr, 0);
        System.out.println(list);
    }
}
