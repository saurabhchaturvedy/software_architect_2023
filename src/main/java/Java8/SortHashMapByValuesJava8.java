package Java8;

import java.util.*;

public class SortHashMapByValuesJava8 {
    public static void main(String[] args) {
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Alice", 50000);
        unsortedMap.put("Bob", 60000);
        unsortedMap.put("Charlie", 55000);

        // Create a list of map entries and sort by values using streams
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(unsortedMap.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue());

        // Create a new LinkedHashMap to maintain the sorted order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Salary: " + entry.getValue());
        }
    }
}
