package Good_Solutions_Problems;

import java.util.*;

public class NextGreaterElement {
    public static int[] findNextGreaterElements(int[] arr) {
        int[] result = new int[arr.length];
        Arrays.fill(result, -1); // Initialize with -1
        
        Stack<Integer> stack = new Stack<>(); // Store indices
        
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] nextGreater = findNextGreaterElements(arr);
        
        System.out.println("Element\tNext Greater Element");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t\t" + nextGreater[i]);
        }
    }
}
