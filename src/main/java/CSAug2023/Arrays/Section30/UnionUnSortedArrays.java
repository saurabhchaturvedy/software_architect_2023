package CSAug2023.Arrays.Section30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionUnSortedArrays {


    public void unionUnsortedArrays(int[] first, int[] second, Set<Integer> finalList) {

        int i = 0;
        int j = 0;

        while (i < first.length) {
            finalList.add(first[i++]);
        }

        while (j < second.length) {

            finalList.add(second[j++]);
        }


    }


    public static void main(String[] args) {

        int[] arr = {9, 3, 11, 5, 19, 27, 22};
        int[] arr2 = {9, 3, 23, 29};

        UnionUnSortedArrays unionUnSortedArrays = new UnionUnSortedArrays();
        Set<Integer> finalList = new HashSet<>();
        unionUnSortedArrays.unionUnsortedArrays(arr, arr2, finalList);
        System.out.println(finalList);

    }
}
