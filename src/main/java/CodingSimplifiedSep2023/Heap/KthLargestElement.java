package CodingSimplifiedSep2023.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {


    public int KthLargestElementMaxHeap(int[] arr, int k) {

        if (k < 0 || k > arr.length) {
            return -1;
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int x : arr) {
            priorityQueue.add(x);
        }

        for (int i = 0; i < k - 1; i++) {
            priorityQueue.poll();
        }

        return priorityQueue.peek();
    }


    public int KthLargestElementMinHeap(int[] arr, int k) {


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            priorityQueue.add(arr[i]);
        }


        for (int j = k; j < arr.length; j++) {
            if (arr[j] > priorityQueue.peek()) {

                priorityQueue.poll();
                priorityQueue.add(arr[j]);
            }
        }


        return priorityQueue.peek();
    }


    public static void main(String[] args) {


        int[] arr = {1, 2, 4, 5, 12, 45, 22, 16};

        KthLargestElement kthLargestElement = new KthLargestElement();
        System.out.println("3rd largest element : " + kthLargestElement.KthLargestElementMaxHeap(arr, 3));

        System.out.println("3rd largest element min heap : " + kthLargestElement.KthLargestElementMinHeap(arr, 3));
    }
}
