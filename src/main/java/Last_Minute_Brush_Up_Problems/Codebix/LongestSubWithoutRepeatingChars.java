package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.HashSet;
import java.util.Set;

public class LongestSubWithoutRepeatingChars {


    public int longestSubstringWithoutRepeatingLength(String str) {

        Set<Character> set = new HashSet<>();
        int leftIndex = 0;
        int rightIndex = 0;
        int maxLength = 0;


        char[] window = str.toCharArray();

        while (rightIndex < str.length()) {

            if (!set.contains(window[rightIndex])) {
                set.add(window[rightIndex]);
                rightIndex++;
                maxLength = Math.max(maxLength, rightIndex - leftIndex);

            } else {

                set.remove(window[rightIndex]);
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
