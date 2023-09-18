package CodingSimplifiedSep2023.String.Problem10;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinctChars {


    public int longestSubstringKDistinctChars(String str, int k) {
        if (str == null || str.length() == 0 || k <= 0 || k > str.length()) {
            return -1;
        }

        int maxLength = 0;
        int start = 0;
        int end = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (end < str.length()) {
            char charToPut = str.charAt(end);
            map.put(charToPut, map.getOrDefault(charToPut, 0) + 1);

            while (map.size() > k) {
                char charAtFront = str.charAt(start);
                map.put(charAtFront, map.get(charAtFront) - 1);

                if (map.get(charAtFront) == 0) {
                    map.remove(charAtFront);
                }

                start++;
            }

            maxLength = Math.max(end - start + 1, maxLength);
            end++;
        }

        return maxLength;
    }


    public static void main(String[] args) {

        String str = "bccbabad";

        LongestSubstringKDistinctChars longestSubstringKDistinctChars = new LongestSubstringKDistinctChars();
        System.out.println("Longest substring with 2 distinct charcters : " + longestSubstringKDistinctChars.longestSubstringKDistinctChars(str, 2));
    }
}
