package CSAug2023.Arrays.Section20;

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArrays {


    public List<Integer> unionSortedArrays(int[] first, int[] second, List<Integer> unionList) {
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
                unionList.add(first[i++]);
            } else if (second[j] < first[i]) {
                unionList.add(second[j++]);
            } else {
                unionList.add(first[i]);
                i++;
                j++;
            }

        }


        while (i < first.length) {

            while (i < first.length - 1 && first[i] == first[i + 1]) {
                i++;
            }

            unionList.add(first[i]);
            i++;
        }

        while (j < second.length) {

            while (j < second.length - 1 && second[j] == second[j + 1]) {
                j++;
            }

            unionList.add(second[j]);
            j++;
        }


        return unionList;
    }


    public static void main(String[] args) {

        int arr1[] = {2, 2, 3, 4, 4, 4, 7, 8};
        int arr2[] = {1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10};
        List<Integer> finalList = new ArrayList<>();

        UnionOfSortedArrays unionOfSortedArrays = new UnionOfSortedArrays();
        List<Integer> integers = unionOfSortedArrays.unionSortedArrays(arr1, arr2, finalList);

        for (int x : integers) {
            System.out.print(x + " ");
        }
    }
}
