package CodingSimplifiedSep2023.Arrays.Problem20;

import java.util.ArrayList;
import java.util.List;

public class UnionSortedArrays {


    public List<Integer> unionOfSortedArrays(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        List<Integer> union = new ArrayList<>();

        while (i < first.length && j < second.length) {

            while ((i < first.length - 1) && first[i] == first[i + 1]) {
                i++;
            }

            while ((j < second.length - 1) && second[j] == second[j + 1]) {
                j++;
            }


            if (first[i] < second[j]) {

                union.add(first[i]);
                i++;
            } else if (second[j] < first[i]) {

                union.add(second[j]);
                j++;

            } else {

                union.add(first[i]);
                i++;
                j++;
            }


        }


        while (i < first.length) {
            union.add(first[i]);
            i++;
        }

        while (j < second.length) {
            union.add(second[j]);
            j++;
        }

        return union;
    }


    public static void main(String[] args) {


        int[] first = {1, 3, 4, 5, 7};
        int[] second = {2, 3, 5, 6};

        UnionSortedArrays unionSortedArrays = new UnionSortedArrays();

        List<Integer> union = unionSortedArrays.unionOfSortedArrays(first, second);

        for (Integer i : union) {

            System.out.print(i + " ");
        }
    }
}
