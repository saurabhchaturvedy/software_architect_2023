package CodingSimplifiedSep2023.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapJava {


    public static void main(String[] args) {


        int[] arr = {7, 12, 11, 9, 19, 15, 3, 20, 44, 37};

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int x : arr) {
            priorityQueue.add(x);
            System.out.print(priorityQueue.peek() + " ");
        }

        System.out.println();

        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }

        System.out.println();

        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());

        for (int x : arr) {
            priorityQueue2.add(x);
            System.out.print(priorityQueue2.peek() + " ");
        }

        System.out.println();

        while (!priorityQueue2.isEmpty()) {
            System.out.print(priorityQueue2.poll() + " ");
        }

    }
}
