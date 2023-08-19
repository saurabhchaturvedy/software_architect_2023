package Brainstormed_Questions_Garage;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {


    public int[] nextGreaterElement(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        Arrays.fill(result, -1);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {

                result[stack.pop()] = arr[i];
            }


            stack.push(i);
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
