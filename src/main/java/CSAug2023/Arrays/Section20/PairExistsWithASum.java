package CSAug2023.Arrays.Section20;

import java.util.HashSet;
import java.util.Set;

public class PairExistsWithASum {


    public boolean isPairExists(int[] arr, int target) {
        if (arr.length == 0) return false;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(target - arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }

        return false;
    }


    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 8, 9, 11};
        PairExistsWithASum pairExistsWithASum = new PairExistsWithASum();
        System.out.println("Target pair exists or not ???? "+pairExistsWithASum.isPairExists(arr,12));
    }
}
