package CodingSimplifiedSep2023.Arrays.Problem20;

import java.util.HashSet;
import java.util.Set;

public class PairExists {


    public boolean pairExists(int[] arr, int target) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (!set.contains(target - arr[i])) {
                set.add(arr[i]);
            } else {

                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {


        int[] arr = {2, 3, 7, 5, 8, 10, 9};

        PairExists pairExists = new PairExists();

        System.out.println(" Pair exists ? :: " + pairExists.pairExists(arr, 17));
    }
}
