package CodingSimplifiedSep2023.String.Problem10;

public class ReverseWords {


    public String reverseWords(String str) {

        String finalStr = "";
        String tempStr = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                finalStr = " " + tempStr + finalStr;
                tempStr = "";
            } else {
                tempStr = tempStr + c;
            }
        }

        finalStr = tempStr + finalStr;

        return finalStr;
    }

    public String reverseWordsStringBuilder(String str) {

        StringBuilder finalStr = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                finalStr.insert(0, tempStr).insert(0, " ");
                tempStr.setLength(0);
            } else {
                tempStr.append(c);
            }
        }

        finalStr.insert(0, tempStr);

        return finalStr.toString();
    }

    public String reverseWordsUsingReverse(String str) {
        str = reverseString(str);
        str = reverseIndividualWord(str);

        return str;
    }

    public String reverseIndividualWord(String str) {

        String finalStr = "";
        String tempStr = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                finalStr = finalStr + tempStr + " ";
                tempStr = "";
            } else {
                tempStr = c + tempStr;
            }
        }

        finalStr = finalStr + tempStr;

        return finalStr;
    }

    public String reverseString(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i) + s;
        }

        return s;
    }

    public static void main(String[] args) {

        ReverseWords reverseWords = new ReverseWords();
        String str = "coding simplified nice";

        System.out.println(reverseWords.reverseWords(str));
        System.out.println(reverseWords.reverseWordsStringBuilder(str));

        System.out.println(reverseWords.reverseWordsUsingReverse(str));
    }
}
