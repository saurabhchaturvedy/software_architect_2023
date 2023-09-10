package FundamentalsSep2023.Array;

public class StringPalindrome {


    public boolean isPalindrome(String str) {

        char[] ch = str.toCharArray();

        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            if (ch[start] != ch[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }


    public static void main(String[] args) {


        String str = "radar";
        StringPalindrome stringPalindrome = new StringPalindrome();
        System.out.println("Is palindrome ? ::: " + stringPalindrome.isPalindrome(str));
    }
}
