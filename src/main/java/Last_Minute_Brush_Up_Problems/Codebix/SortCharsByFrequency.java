package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharsByFrequency {


    public String sortByFrequency(String str) {
        Map<Character, Integer> map = new HashMap<>();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character>[] frequencyBucket = new List[str.length() + 1];

        for (Character c : map.keySet()) {

            int index = map.get(c);

            if (frequencyBucket[index] == null) {

                frequencyBucket[index] = new ArrayList<>();
            }

            frequencyBucket[index].add(c);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = frequencyBucket.length - 1; i >= 0; i--) {

            if (frequencyBucket[i] != null) {
                for (char c : frequencyBucket[i]) {

                    for (int k = 0; k < map.get(c); k++) {
                        sb.append(c);
                    }
                }
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {

        String str = "mississippi";
        SortCharsByFrequency sortCharsByFrequency = new SortCharsByFrequency();
        System.out.println("Sorted chars by frequency :: " + sortCharsByFrequency.sortByFrequency(str));
    }
}
