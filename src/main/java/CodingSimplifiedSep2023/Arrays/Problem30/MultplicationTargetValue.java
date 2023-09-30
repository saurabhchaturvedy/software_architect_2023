package CodingSimplifiedSep2023.Arrays.Problem30;

import java.util.HashSet;
import java.util.Set;

public class MultplicationTargetValue {


    public boolean hasTargetValue(int[] arr, int target) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(target / arr[i])) {
                set.add(arr[i]);
            } else {

                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {


        int[] arr = {2, 6, 3, 5, 8, 4};

        MultplicationTargetValue multplicationTargetValue = new MultplicationTargetValue();
        boolean hasTargetValue = multplicationTargetValue.hasTargetValue(arr, 72);

        System.out.println("Array has target value ? :: " + hasTargetValue);
    }
}
