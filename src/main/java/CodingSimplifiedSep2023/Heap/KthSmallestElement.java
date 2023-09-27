package CodingSimplifiedSep2023.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {


    public int KthSmallestElementMinHeap(int[] arr, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int x : arr) {
            priorityQueue.add(x);
        }

        for (int i = 0; i < k - 1; i++) {
            priorityQueue.poll();
        }

        return priorityQueue.peek();
    }


    public int KthSmallestElementMaxHeap(int[] arr, int k) {


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            priorityQueue.add(arr[i]);
        }


        for (int j = k; j < arr.length; j++) {
            if (arr[j] < priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(arr[j]);
            }
        }

        return priorityQueue.peek();
    }


    public static void main(String[] args) {

        int[] arr = {45, 23, 77, 61, 83, 18, 57, 73};

        KthSmallestElement kthSmallestElement = new KthSmallestElement();

        System.out.println("Kth Smallest Element : " + kthSmallestElement.KthSmallestElementMinHeap(arr, 3));

        System.out.println("Kth Smallest Element Max Heap : " + kthSmallestElement.KthSmallestElementMaxHeap(arr, 3));
    }
}
