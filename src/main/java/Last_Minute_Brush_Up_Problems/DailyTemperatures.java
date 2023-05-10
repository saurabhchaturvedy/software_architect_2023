package Last_Minute_Brush_Up_Problems;

import java.util.Stack;

public class DailyTemperatures {


    public int[] dailyTemperatures(int[] temp) {


        int[] temperatures = new int[temp.length];
        int n = temp.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && temp[i] >= temp[stack.peek()]) {
                stack.pop();
            }


            if (!stack.isEmpty()) {
                temperatures[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return temperatures;
    }

    public static void main(String[] args) {

        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        for (int x : dailyTemperatures.dailyTemperatures(temp)) {
            System.out.print(x + " ");
        }
    }
}
