package FundamentalsSep2023.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {


    public String[] generateBinary(int num) {
        String[] result = new String[num];

        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 0; i < num; i++) {
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

        String[] binaryNumbers = generateBinary.generateBinary(5);

        for (String x : binaryNumbers) {

            System.out.print(x + " ");
        }
    }
}
