package CodingSimplifiedSep2023.String.Problem10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagramsInAString {


    public List<Integer> findAllAnagramIndexes(String str, String pattern) {


        if (str == null || str.length() == 0 || pattern == null || pattern.length() == 0) {
            return new ArrayList<>();
        }


        int matchedElements = 0;
        int start = 0;
        List<Integer> allAnagramStartingIndexes = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) - 1);

                if (map.get(currentChar) == 0) {
                    matchedElements++;
                }
            }

            if (matchedElements == map.size()) {
                allAnagramStartingIndexes.add(start);
            }

            if (i >= str.length() - 1) {

                char charAtStart = str.charAt(start++);

                if (map.containsKey(charAtStart)) {

                    if (map.get(charAtStart) == 0) {
                        matchedElements--;
                    }

                    map.put(charAtStart, map.get(charAtStart) + 1);
                }
            }
        }

        return allAnagramStartingIndexes;
    }


    public static void main(String[] args) {

        String str = "bcdcbabcbd";
        String pattern = "abc";

        AllAnagramsInAString allAnagramsInAString = new AllAnagramsInAString();

        System.out.println("All anagrams in a string :: " + allAnagramsInAString.findAllAnagramIndexes(str, pattern));
    }
}
