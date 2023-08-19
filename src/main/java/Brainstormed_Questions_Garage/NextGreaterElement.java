package Brainstormed_Questions_Garage;

import java.util.Stack;

public class NextGreaterElement {


    public void nextGreaterElement(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            stack.push(arr[i]);

            int res = stack.empty() ? -1 : stack.peek();

            System.out.print(res + " ");
        }
    }


    public static void main(String[] args) {

        int[]arr = {5,15,10,8,6,12,9,18};
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        nextGreaterElement.nextGreaterElement(arr);
    }
}
