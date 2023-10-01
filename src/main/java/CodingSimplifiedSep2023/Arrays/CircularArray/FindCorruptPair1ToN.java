package CodingSimplifiedSep2023.Arrays.CircularArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCorruptPair1ToN {


    public List<Integer> findCorruptPair(int[] arr) {

        List<Integer> corruptPair = new ArrayList<>();

        int i = 0;

        while (i < arr.length) {

            if (arr[i] != arr[arr[i] - 1]) {

                int destinationIndex = arr[i] - 1;

                int temp = arr[i];
                arr[i] = arr[destinationIndex];
                arr[destinationIndex] = temp;
            }

            i++;
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return Arrays.asList(i + 1, arr[i]);
            }
        }

        return new ArrayList<>();
    }


    public static void main(String[] args) {


        int[] arr = {4, 3, 4, 5, 1};

        FindCorruptPair1ToN findCorruptPair1ToN = new FindCorruptPair1ToN();

        for (int x : findCorruptPair1ToN.findCorruptPair(arr)) {

            System.out.print(x + " ");
        }
    }
}
