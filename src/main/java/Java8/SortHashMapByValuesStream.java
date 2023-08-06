package Java8;

import java.util.*;
import java.util.stream.*;

public class SortHashMapByValuesStream {
    public static void main(String[] args) {
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Alice", 50000);
        unsortedMap.put("Bob", 60000);
        unsortedMap.put("Charlie", 55000);

        // Sort the map by values using streams and collect to a LinkedHashMap
        LinkedHashMap<String, Integer> sortedMap = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        // Print sorted map
        sortedMap.forEach((name, salary) -> System.out.println("Name: " + name + ", Salary: " + salary));
    }
}
