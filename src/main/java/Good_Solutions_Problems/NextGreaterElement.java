package Good_Solutions_Problems;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] findNextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1); // Initialize result array with -1

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int index = stack.pop();
                result[index] = nums[i];
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 25, 10, 8, 6, 12};
        int[] nextGreaterElements = findNextGreaterElements(nums);
        System.out.println("Element\tNext Greater Element");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "\t\t" + nextGreaterElements[i]);
        }
    }
}
