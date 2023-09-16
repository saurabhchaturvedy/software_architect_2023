package CodingSimplifiedSep2023.String;

import java.util.Stack;

public class ReverseIndividualWords {


    public String reverseStringsIndividualWords(String str) {

        String tempStr = "";
        String finalStr = "";

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


    public String reverseStringsIndividualWordsBuilder(String str) {

        StringBuilder tempStr = new StringBuilder();
        StringBuilder finalStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == ' ') {
                finalStr.append(tempStr).append(" ");
                tempStr.setLength(0);
            } else {

                tempStr.insert(0, c);
            }
        }

        finalStr = finalStr.append(tempStr);

        return finalStr.toString();
    }


    public void reverseStringsIndividualWordsStack(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == ' ') {

                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            } else {

                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }


    }


    public static void main(String[] args) {

        ReverseIndividualWords reverseIndividualWords = new ReverseIndividualWords();
        System.out.println(" Reverse Individual Words : " + reverseIndividualWords.reverseStringsIndividualWords("Bird garage fan"));

        System.out.println();

        System.out.println(" Reverse Individual Words : " + reverseIndividualWords.reverseStringsIndividualWordsBuilder("Bird garage fan"));

        reverseIndividualWords.reverseStringsIndividualWordsStack("Bird garage fan");
    }
}
