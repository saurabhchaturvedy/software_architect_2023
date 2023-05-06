package Fundamentals.Stack;

import java.util.Stack;

public class ReverseString {


    public String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            stack.push(c);
        }

        for (int i = 0; i < str.length(); i++) {
            chars[i] = stack.pop();
        }

        return new String(chars);
    }


    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        System.out.println(" reversed string is :: "+reverseString.reverse("america"));
    }
}
