package CodingSimplifiedSep2023.Arrays.Problem40;

import java.util.*;

public class SortBasedOnFrequencyOccurence {


    public List<Integer> sortBasedOnFrequencyOccurence(List<Integer> list) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {

            map.put(list.get(i), map.getOrDefault(map.get(i), 0) + 1);
        }


        Collections.sort(list, (k1, k2) -> {

            int f1 = map.get(k1);
            int f2 = map.get(k2);

            if (f1 != f2) {
                return f2 - f1;
            }

            return list.indexOf(k1) - list.indexOf(k2);
        });


        return list;
    }


    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 8, 9, 5);

        SortBasedOnFrequencyAndValue sortBasedOnFrequencyAndValue = new SortBasedOnFrequencyAndValue();

        List<Integer> integers = sortBasedOnFrequencyAndValue.sortOnFrequencyValue(list);

        for (int x : integers) {
            System.out.print(x + " ");
        }
    }
}
