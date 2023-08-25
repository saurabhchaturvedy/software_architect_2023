package TechInt;

import java.util.*;

public class TopKFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Create a frequency map of elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Create a list of buckets where each index represents frequency
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        // Populate the buckets with elements based on their frequency
        for (int num : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(num);
            buckets[frequency].add(num);
        }
        
        // Collect the top k frequent elements from the buckets
        List<Integer> topKFrequent = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && topKFrequent.size() < k; i--) {
            if (!buckets[i].isEmpty()) {
                topKFrequent.addAll(buckets[i]);
            }
        }
        
        return topKFrequent;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> topKFrequent = topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + topKFrequent);
    }
}
