package Last_Minute_Brush_Up_Problems;

import java.util.Stack;

public class NextGreaterElement {


    public int[] nextGreaterElement(int[] arr) {

        int[] nextGreaterElement = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int element = arr[i];


            if (stack.isEmpty()) {
                nextGreaterElement[i] = -1;
                stack.push(element);
                continue;
            }

            if (stack.peek() > element) {
                nextGreaterElement[i] = stack.peek();
                stack.push(element);
                continue;
            }

            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }

            if (stack.isEmpty()) nextGreaterElement[i] = -1;
            else nextGreaterElement[i] = stack.peek();

            stack.push(element);
        }

        return nextGreaterElement;
    }


    public static void main(String[] args) {

        int[] arr = {13,7,6,12};
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] ints = nextGreaterElement.nextGreaterElement(arr);
        for (int x : ints) {
            System.out.print(x + " ");
        }
    }
}
