package Fundamentals.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {


    public String[] generateBinary(int number) {
        String[] result = new String[number];
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 0; i < number; i++) {
            result[i] = queue.poll();
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";

            queue.offer(s1);
            queue.offer(s2);
        }

        return result;
    }


    public static void main(String[] args) {
        GenerateBinary generateBinary = new GenerateBinary();
        String[] strings = generateBinary.generateBinary(3);
        for (String x : strings) {
            System.out.print(x + " ");
        }
    }
}
