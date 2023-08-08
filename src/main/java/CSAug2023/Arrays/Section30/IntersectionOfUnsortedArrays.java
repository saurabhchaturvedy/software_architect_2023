package CSAug2023.Arrays.Section30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfUnsortedArrays {


    public void intersectionUnsorted(int[] first, int[] second, List<Integer> finalList) {

        int i = 0;
        int j = 0;

        Set<Integer> integerSet = new HashSet<>();

        while (i < first.length) {
            integerSet.add(first[i]);
            i++;
        }


        while (j < second.length) {

            if (integerSet.contains(second[j])) {
                finalList.add(second[j]);
            }

            j++;
        }
    }

    public static void main(String[] args) {

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {7, 8, 2, 3, 9, 11};

        List<Integer> finalList = new ArrayList<>();
        IntersectionOfUnsortedArrays intersectionOfUnsortedArrays = new IntersectionOfUnsortedArrays();
        intersectionOfUnsortedArrays.intersectionUnsorted(first, second, finalList);
        System.out.println(finalList);
    }
}
