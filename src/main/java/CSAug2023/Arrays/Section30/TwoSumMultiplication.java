package CSAug2023.Arrays.Section30;

import java.util.HashSet;
import java.util.Set;

public class TwoSumMultiplication {


    public boolean twoSumMultiplication(int[] arr, int target) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (target % arr[i] == 0 && set.contains(target / arr[i])) {
                return true;
            }

            set.add(arr[i]);
        }

        return false;
    }


    public static void main(String[] args) {

        int[] arr = {2, 3, 8, 6, 5};
        TwoSumMultiplication twoSumMultiplication = new TwoSumMultiplication();
        System.out.println("is a multiplication pair exists ???? " + twoSumMultiplication.twoSumMultiplication(arr, 19));
    }
}
