package CodingSimplifiedSep2023.String.Problem20;

import java.util.HashMap;
import java.util.Map;

public class AnagramOfAStringInAString {


    public boolean containsAnagram(String str, String pattern) {
        if (str == null || str.length() == 0 || pattern == null || pattern.length() == 0) {
            return false;
        }

        int matchedElements = 0;
        int start = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : pattern.toCharArray()) {
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
                return true;
            }


            if (i >= pattern.length() - 1) {

                char charAtStart = str.charAt(start++);

                if (map.containsKey(charAtStart)) {

                    if (map.get(charAtStart) == 0) {
                        matchedElements--;
                    }

                    map.put(charAtStart, map.get(charAtStart) + 1);

                }
            }


        }

        return false;
    }


    public static void main(String[] args) {

        String str = "bcdcbababd";
        String pattern = "abc";

        AnagramOfAStringInAString anagramOfAStringInAString = new AnagramOfAStringInAString();
        System.out.println(" Anagram exists ? : " + anagramOfAStringInAString.containsAnagram(str, pattern));
    }
}
