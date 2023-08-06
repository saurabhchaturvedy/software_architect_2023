package Java8;

import java.util.*;

public class FindKeyWithMaxValueInMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 50000);
        map.put("Bob", 60000);
        map.put("Charlie", 55000);

        // Find the key with the maximum value in the map's entries
        Optional<Map.Entry<String, Integer>> maxEntryOptional = map.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (maxEntryOptional.isPresent()) {
            Map.Entry<String, Integer> maxEntry = maxEntryOptional.get();
            String keyWithMaxValue = maxEntry.getKey();
            System.out.println("Key with Maximum Value: " + keyWithMaxValue);
        } else {
            System.out.println("Map is empty.");
        }
    }
}
