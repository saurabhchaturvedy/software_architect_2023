package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElement {


    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(key);
        }


        int[] res = new int[k];
        int count = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {

            if (bucket[i] != null) {
                for (int j = 0; i < bucket[i].size(); j++) {
                    res[count++] = bucket[i].get(j);
                }

                if (count == k) {
                    break;
                }
            }


        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 5, 6, 5, 5, 4, 5, 8};
        TopKFrequentElement topKFrequentElement = new TopKFrequentElement();
        int[] ints = topKFrequentElement.topKFrequent(arr, 3);

        for (int x : ints) {
            System.out.println(" Element is : " + x);
        }
    }
}
