package CodingSimplifiedSep2023.Arrays.Problem20;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingValue {


    public int firstRepeatingValue(int[] arr) {

        Set<Integer> set = new HashSet<>();

        int firstRepeatingValue = -1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {

                firstRepeatingValue = arr[i];
            }
        }

        return firstRepeatingValue;
    }


    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 16, 34, 3, 8, 27, 8, 33, 41};

        FirstRepeatingValue firstRepeatingValue = new FirstRepeatingValue();

        System.out.println(" First repeating value is : " + firstRepeatingValue.firstRepeatingValue(arr));
    }
}
