package CodingSimplifiedSep2023.Arrays.CircularArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingDuplicateValues {


    public List<List<Integer>> findMissingDuplicateValues(int[] arr) {


        if (arr.length <= 0) {
            return new ArrayList<>();
        }

        int i = 0;

        while (i < arr.length) {

            if (arr[i] != arr[arr[i] - 1]) {

                int otherIndex = arr[i] - 1;

                int temp = arr[i];
                arr[i] = arr[otherIndex];
                arr[otherIndex] = temp;
            } else {

                i++;
            }
        }

        List<Integer> missingValues = new ArrayList<>();
        List<Integer> duplicates = new ArrayList<>();

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {

                missingValues.add(i + 1);
                duplicates.add(arr[i]);
            }
        }

        return Arrays.asList(missingValues, duplicates);
    }


    public static void main(String[] args) {

        int[] arr = {2, 6, 4, 4, 3, 2};

        FindMissingDuplicateValues findMissingDuplicateValues = new FindMissingDuplicateValues();

        System.out.println(" Missing duplicate values : " + findMissingDuplicateValues.findMissingDuplicateValues(arr));
    }
}
