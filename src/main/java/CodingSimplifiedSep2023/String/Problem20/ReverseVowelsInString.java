package CodingSimplifiedSep2023.String.Problem20;

public class ReverseVowelsInString {


    public String reverseVowels(String str) {
        int start = 0;
        int end = str.length() - 1;

        char[] ch = str.toCharArray();


        while (start < end) {

            if (!isVowel(str.charAt(start))) {
                start++;
                continue;
            }

            if (!isVowel(str.charAt(end))) {
                end--;
                continue;
            }

            char c = ch[start];
            ch[start] = ch[end];
            ch[end] = c;

            start++;
            end--;
        }

        return String.valueOf(ch);
    }

    private boolean isVowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }


    public static void main(String[] args) {

        ReverseVowelsInString reverseVowelsInString = new ReverseVowelsInString();

        System.out.println("Reversed vowel string is : " + reverseVowelsInString.reverseVowels("hello"));
    }
}
