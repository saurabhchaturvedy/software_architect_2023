package Good_Solutions_Problems;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterEle {


    public int[] nextGreaterElement(int[] elements) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[elements.length];
        Arrays.fill(result,-1);
        for(int i = 0; i < elements.length; i++) {
            while(!stack.isEmpty() && elements[stack.peek()]<elements[i]) {
                int idx = stack.pop();
                result[idx] = elements[i];
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] input = { 2, 7, 3, 5, 4, 6, 8 };
        NextGreaterEle nextGreaterEle = new NextGreaterEle();
        int[] ints = nextGreaterEle.nextGreaterElement(input);

        for(int x : ints)
        {
            System.out.print(x+" ");
        }
    }
}
