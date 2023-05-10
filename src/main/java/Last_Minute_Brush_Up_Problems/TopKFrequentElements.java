package Last_Minute_Brush_Up_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {


    public int[] topKFrequent(int[] arr, int k) {

        List<Integer>[] bucket = new List[arr.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int x : arr) {
            frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(key);
        }


        int[] res = new int[k];
        int counter = 0;

        for (int pos = arr.length - 1; pos >= 0 && counter < k; pos--) {

            if (bucket[pos] != null) {
                for (Integer number : bucket[pos]) {
                    res[counter++] = number;
                }
            }
        }

        return res;
    }


    public static void main(String[] args) {

        int[] arr = {3, 4, 4, 4, 7, 7};
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        for (int x : topKFrequentElements.topKFrequent(arr, 2)) {
            System.out.print(x + " ");
        }
    }
}
