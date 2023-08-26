package TechInt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {


    public List<Integer> topKFrequent(int[] arr, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int x : arr) {
            frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1);
        }

        List<Integer>[] bucket = new List[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int freq : frequencyMap.keySet()) {
            int frequencyValue = frequencyMap.get(freq);
            bucket[frequencyValue].add(freq);
        }

        List<Integer> topKFrequentElements = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0 && topKFrequentElements.size() < k; i--) {

            if (!bucket[i].isEmpty()) {
                topKFrequentElements.addAll(bucket[i]);
            }
        }

        return topKFrequentElements;
    }


    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 1, 1, 5, 5, 5, 5, 3};
        TopKFrequent topKFrequent = new TopKFrequent();
        List<Integer> integers = topKFrequent.topKFrequent(arr, 3);

        for (int x : integers) {
            System.out.print(x + " ");
        }
    }
}
