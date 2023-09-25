package CodingSimplifiedSep2023.String.Problem20;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithSameCharacterWithKReplacable {


    public int longestSubstringLengthWithKReplacableChars(String str, int k) {

        if (str == null || str.length() == 0 || k <= 0 || k > str.length()) {
            return 0;
        }


        Map<Character, Integer> map = new HashMap<>();

        int maxFrequency = 0;
        int maxLength = 0;
        int start = 0;
        int end = 0;

        while (end < str.length()) {

            char currentChar = str.charAt(end);

            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            maxFrequency = Math.max(maxFrequency, map.get(currentChar));


            if (end - start + 1 - maxFrequency > k) {

                char charAtStart = str.charAt(start);
                map.put(charAtStart, map.get(charAtStart) - 1);

                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
            end++;

        }


        return maxLength;
    }


    public static void main(String[] args) {


        LongestSubstringWithSameCharacterWithKReplacable longestSubstringWithSameCharacterWithKReplacable = new LongestSubstringWithSameCharacterWithKReplacable();

        String str = "bccbababd";

        System.out.println(" Substring length max :: " + longestSubstringWithSameCharacterWithKReplacable.longestSubstringLengthWithKReplacableChars(str, 2));
    }
}
