package Brainstormed_Questions_Garage;

import java.util.Stack;

public class NextGreaterElement {


    public int[] nextGreaterElement(int[] arr) {


        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {

                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }


    public static void main(String[] args) {

        int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] ints = nextGreaterElement.nextGreaterElement(arr);

        for (int x : ints) {
            System.out.print(x + " ");
        }
    }
}
