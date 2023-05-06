package Fundamentals.Array;

public class StringPalindrome {


    public boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }


    public static void main(String[] args) {

        String str="radar";
        StringPalindrome stringPalindrome = new StringPalindrome();
        System.out.println("string is palindrome : "+stringPalindrome.isPalindrome(str));
    }
}
