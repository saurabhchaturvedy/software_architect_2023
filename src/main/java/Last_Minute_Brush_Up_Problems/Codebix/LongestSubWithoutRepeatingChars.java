package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.HashSet;
import java.util.Set;

public class LongestSubWithoutRepeatingChars {


    public int longestSubstringWithoutRepeatingLength(String str) {

        Set<Character> set = new HashSet<>();
        int leftIndex = 0;
        int currIndex = 0;
        int maxLength = 0;

        int strLength = str.length();
        char[] window = str.toCharArray();

        while (currIndex < strLength) {

            if (!set.contains(window[currIndex])) {
                set.add(window[currIndex]);
                currIndex++;
                maxLength = Math.max(maxLength, currIndex - leftIndex);

            } else {

                set.remove(window[currIndex]);
                leftIndex++;
            }
        }

        return maxLength;
    }


    public static void main(String[] args) {

        String str = "abcabcbb";
        LongestSubWithoutRepeatingChars longestSubWithoutRepeatingChars = new LongestSubWithoutRepeatingChars();
        System.out.println("Longest substring length without repeating char : "+longestSubWithoutRepeatingChars.longestSubstringWithoutRepeatingLength(str));
    }
}
