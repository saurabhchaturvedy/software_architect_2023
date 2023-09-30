package CodingSimplifiedSep2023.Arrays.Problem30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionUnsortedArrays {


    public List<Integer> intersectionUnsortedArrays(int[] first, int[] second) {

        Set<Integer> set = new HashSet<>();

        List<Integer> intersections = new ArrayList<>();

        for (int x : first) {

            set.add(x);
        }

        for (int x : second) {
            if (set.contains(x)) {
                intersections.add(x);
            }
        }

        return intersections;
    }


    public static void main(String[] args) {


        int[] first = {8, 3, 11, 15, 9, 7};
        int[] second = {7, 18, 9, 5};

        IntersectionUnsortedArrays intersectionUnsortedArrays = new IntersectionUnsortedArrays();

        List<Integer> integers = intersectionUnsortedArrays.intersectionUnsortedArrays(first, second);

        for (int x : integers) {
            System.out.print(x + " ");
        }
    }
}
