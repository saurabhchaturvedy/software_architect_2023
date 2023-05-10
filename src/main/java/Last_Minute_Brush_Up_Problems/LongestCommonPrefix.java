package Last_Minute_Brush_Up_Problems;

import java.util.Arrays;

public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] str) {


        StringBuilder sb = new StringBuilder();

        Arrays.sort(str);

        char[] start = str[0].toCharArray();
        char[] end = str[str.length - 1].toCharArray();

        for (int i = 0; i < start.length; i++) {
            if (start[i] != end[i]) break;
            sb.append(start[i]);
        }

        return sb.toString();
    }


    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(" Longest common substring is :: " + longestCommonPrefix.longestCommonPrefix(arr));
    }
}
