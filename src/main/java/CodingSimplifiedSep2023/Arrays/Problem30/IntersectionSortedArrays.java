package CodingSimplifiedSep2023.Arrays.Problem30;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSortedArrays {


    public List<Integer> intersectionSortedArrays(int[] first, int[] second) {

        int i = 0;
        int j = 0;

        List<Integer> intersections = new ArrayList<>();

        while (i < first.length && j < second.length) {

            while ((i < first.length - 1) && first[i] == first[i + 1]) {
                i++;
            }

            while ((j < second.length - 1) && second[j] == second[j + 1]) {

                j++;
            }


            if (first[i] < second[j]) {
                i++;
            } else if (second[j] < first[i]) {
                j++;
            } else {

                intersections.add(first[i]);
                i++;
                j++;
            }
        }
        return intersections;
    }


    public static void main(String[] args) {

        int[] first = {2, 3, 8, 9, 10, 11};
        int[] second = {3, 8, 9, 15, 16, 17};

        IntersectionSortedArrays intersectionSortedArrays = new IntersectionSortedArrays();

        List<Integer> integers = intersectionSortedArrays.intersectionSortedArrays(first, second);

        for (int x : integers) {

            System.out.print(x + " ");
        }
    }
}
