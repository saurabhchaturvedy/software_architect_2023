package CodingSimplifiedSep2023.Arrays.Problem40;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortBasedOnFrequencyAndValue {


    public List<Integer> sortOnFrequencyValue(List<Integer> list) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : list) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }


        Collections.sort(list, (k1, k2) -> {

            int f1 = map.get(k1);
            int f2 = map.get(k2);

            if (f1 != f2) {
                return f2 - f1;
            }

            return k1 - k2;
        });

        return list;
    }

    public static void main(String[] args) {


        int[] arr = {1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 6, 8, 7};
        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
        SortBasedOnFrequencyAndValue sortBasedOnFrequencyAndValue = new SortBasedOnFrequencyAndValue();

        List<Integer> integers = sortBasedOnFrequencyAndValue.sortOnFrequencyValue(list);

        for (int x : integers) {
            System.out.print(x + " ");
        }
    }
}
