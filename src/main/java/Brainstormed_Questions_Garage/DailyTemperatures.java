package Brainstormed_Questions_Garage;

import java.util.Stack;

public class DailyTemperatures {


    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        int last = 0;

        for (int i = 0; i < arr.length; i++) {


            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                last = stack.pop();
                result[last] = i - last;
            }

            stack.push(i);
        }

        return result;
    }


    public static void main(String[] args) {


        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] ints = dailyTemperatures.dailyTemperatures(arr);
        for (int x : ints) {
            System.out.print(x + " ");
        }
    }
}
