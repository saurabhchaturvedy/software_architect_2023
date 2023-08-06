package Java8;

import java.util.*;

public class FindMaxValueInMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 50000);
        map.put("Bob", 60000);
        map.put("Charlie", 55000);

        // Find the maximum value in the map's values
        Optional<Integer> maxOptional = map.values().stream().max(Integer::compare);

        if (maxOptional.isPresent()) {
            Integer maxValue = maxOptional.get();
            System.out.println("Maximum Value: " + maxValue);
        } else {
            System.out.println("Map is empty.");
        }
    }
}
