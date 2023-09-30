package CodingSimplifiedSep2023.Arrays.Problem30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionUnsortedArrays {


    public List<Integer> unionUnsortedArrays(int[] first, int[] second) {

        Set<Integer> set = new HashSet<>();

        for (int x : first) {
            set.add(x);
        }

        for (int x : second) {
            set.add(x);
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {


        int[] first = {1, 3, 4, 5, 7};
        int[] second = {2, 3, 5, 6};

        UnionUnsortedArrays unionUnsortedArrays = new UnionUnsortedArrays();

        List<Integer> integers = unionUnsortedArrays.unionUnsortedArrays(first, second);

        for (int x : integers) {

            System.out.print(x + " ");
        }
    }
}
