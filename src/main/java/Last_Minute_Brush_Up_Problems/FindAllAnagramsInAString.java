package Last_Minute_Brush_Up_Problems;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {


    public List<Integer> findAllAnagrams(String str, String input) {
        int m = str.length();
        int n = input.length();


        int[] countArray = new int[26];

        // check for initial window

        for (int i = 0; i < n; i++) {

            // increment the value of char at i in str
            countArray[str.charAt(i) - 'a']++;
            // decrement at the same time the value of char at i in input string
            countArray[input.charAt(i) - 'a']--;
        }

        // create a list to keep track of first indices of all found anagrams

        List<Integer> anagramIndexList = new ArrayList<>();

        // now its time to keep sliding the window

        for (int i = n; i < m; i++) {

            if (allZeroes(countArray)) {
                anagramIndexList.add(i - n);
            }

            countArray[str.charAt(i) - 'a']++;
            countArray[str.charAt(i - n) - 'a']--;
        }

        if (allZeroes(countArray)) {
            anagramIndexList.add(m - n);
        }

        return anagramIndexList;
    }

    private boolean allZeroes(int[] countArray) {

        for (int x : countArray) {
            if (x != 0) {
                return false;
            }


        }

        return true;

    }

    public static void main(String[] args) {

        String str = "cbaebabacd";
        String input = "abc";

        FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();
        List<Integer> allAnagrams = findAllAnagramsInAString.findAllAnagrams(str, input);

        System.out.println("All anagrams that are found are at indexes: ");

        for (int x : allAnagrams) {
            System.out.print(x + " ");
        }
    }
}
