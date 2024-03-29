package FundamentalsSep2023.Stack;

import java.util.Stack;

public class EvaluatePostfix {


    public int evaluatePostfix(String str) {
        if (str == null) {
            return -1;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (!Character.isDigit(c)) {

                int x = stack.pop();
                int y = stack.pop();


                switch (c) {

                    case '+':
                        stack.push(y + x);
                        break;

                    case '-':
                        stack.push(y - x);
                        break;

                    case '*':
                        stack.push(y * x);
                        break;

                    case '/':
                        stack.push(y / x);
                        break;
                }

            } else {

                stack.push(Character.getNumericValue(c));
            }
        }

        return stack.pop();
    }


    public static void main(String[] args) {

        String str = "34*25*+";

        EvaluatePostfix evaluatePostfix = new EvaluatePostfix();

        System.out.println("Expression evaluation result is ::::: " + evaluatePostfix.evaluatePostfix(str));
    }
}
