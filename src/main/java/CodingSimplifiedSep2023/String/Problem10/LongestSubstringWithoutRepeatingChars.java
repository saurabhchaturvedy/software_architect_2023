package CodingSimplifiedSep2023.String.Problem10;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {


    public int longestSubstringWithoutRepeatingChars(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        int left = 0;
        int right = 0;
        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (right < str.length()) {

            char currentchar = str.charAt(right);

            if (map.containsKey(currentchar)) {
                left = Math.max(left, map.get(currentchar) + 1);
            }


            map.put(currentchar, right);
            maxLength = Math.max(right - left + 1, maxLength);
            right++;
        }

        return maxLength;
    }


    public static void main(String[] args) {

        String str = "babccbacd";

        LongestSubstringWithoutRepeatingChars longestSubstringWithoutRepeatingChars = new LongestSubstringWithoutRepeatingChars();
        int maxLength = longestSubstringWithoutRepeatingChars.longestSubstringWithoutRepeatingChars(str);

        System.out.println("Longest substring length : " + maxLength);
    }
}
