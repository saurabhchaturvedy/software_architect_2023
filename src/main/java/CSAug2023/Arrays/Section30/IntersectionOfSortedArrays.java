package CSAug2023.Arrays.Section30;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {


    public List<Integer> intersectionSortedArrays(int[] first, int[] second, List<Integer> finalList) {
        int i = 0;
        int j = 0;

        while (i < first.length && j < second.length) {

            while (i < first.length - 1 && first[i] == first[i + 1]) {
                i++;
            }

            while (j < second.length - 1 && second[j] == second[j + 1]) {
                j++;
            }


            if (first[i] < second[j]) {
                i++;
            } else if (second[j] < first[i]) {

                j++;
            } else {
                finalList.add(first[i]);
                i++;
                j++;
            }

        }

        return finalList;
    }


    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 1, 3, 3, 4, 5, 6, 8};
        int[] arr2 = {2, 4, 7, 9};

        IntersectionOfSortedArrays intersectionOfSortedArrays = new IntersectionOfSortedArrays();
        List<Integer> finalList = new ArrayList<>();
        List<Integer> integers = intersectionOfSortedArrays.intersectionSortedArrays(arr, arr2, finalList);

        for (int x : integers) {
            System.out.print(x + " ");
        }
    }
}
