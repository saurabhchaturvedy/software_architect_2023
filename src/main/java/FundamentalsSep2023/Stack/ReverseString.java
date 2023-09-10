package FundamentalsSep2023.Stack;

public class ReverseString {


    public String reverse(String str) {

        char[] ch = str.toCharArray();

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (Character x : ch) {
            stack.push(x);
        }

        for (int i = 0; i < str.length(); i++) {
            ch[i] = stack.pop();
        }

        return new String(ch);
    }


    public static void main(String[] args) {

        String str = "Saurabh";

        ReverseString reverseString = new ReverseString();

        System.out.println("Reversed string is = " + reverseString.reverse(str));
    }
}
