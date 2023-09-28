package CodingSimplifiedSep2023.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class FrequencySort {


    public String sortByFrequency(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2) -> {

            return e2.getValue().compareTo(e1.getValue());
        });


        maxHeap.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();

        while (!maxHeap.isEmpty()) {

            Map.Entry<Character, Integer> entry = maxHeap.poll();

            for (int i = 0; i < entry.getValue(); i++) {

                sb.append(entry.getKey());
            }
        }


        return sb.toString();
    }

    public static void main(String[] args) {


        String str = "bbbkkkkktttjjjjjjjjdfy";

        FrequencySort frequencySort = new FrequencySort();

        System.out.println("String sorted in frequency order : " + frequencySort.sortByFrequency(str));
    }
}
