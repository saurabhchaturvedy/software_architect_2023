package CSAug2023.Arrays.Section40;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortArrayBasedOnFrequency {


    public List<Integer> sortBasedOnFrequency(int[] arr) {

        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }


        Collections.sort(list, (n1, n2) -> {

            int freq1 = map.get(n1);
            int freq2 = map.get(n2);

            if (freq1 != freq2) {
                return freq2 - freq1;
            }

            return n1 - n2;
        });

        return list;
    }


    public static void main(String[] args) {

        int[] arr = {7, 3, 7, 7, 2, 1, 1, 1, 2, 3, 3, 4, 8, 4};
        SortArrayBasedOnFrequency sortArrayBasedOnFrequency = new SortArrayBasedOnFrequency();
        List<Integer> integers = sortArrayBasedOnFrequency.sortBasedOnFrequency(arr);

        for (int x : integers) {
            System.out.print(x + " ");
        }

    }
}
