package CodingSimplifiedSep2023.String;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersInString {


    public int uniqueCharsInString(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        return set.size();
    }


    public static void main(String[] args) {

        String str = "aaabbfffftttkk";
        UniqueCharactersInString uniqueCharactersInString = new UniqueCharactersInString();
        System.out.println("Number of unique characters : " + uniqueCharactersInString.uniqueCharsInString(str));
    }
}
