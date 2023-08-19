package Brainstormed_Questions_Garage;

import java.util.Stack;

public class NextGreaterElement {


    public void nextGreaterElement(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }


            int res = stack.empty() ? -1 : stack.peek();
            stack.push(arr[i]);

        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }


    public static void main(String[] args) {

        int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        nextGreaterElement.nextGreaterElement(arr);
    }
}
