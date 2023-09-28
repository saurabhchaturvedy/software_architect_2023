package CodingSimplifiedSep2023.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLargestValue {


    public List<Integer> topKLargest(int[] arr, int k) {


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
        }

        List<Integer> kLargest = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            kLargest.add(priorityQueue.poll());
        }


        return kLargest;
    }


    public List<Integer> topKLargestMinHeap(int[] arr, int k) {


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

        List<Integer> kLargest = new ArrayList<>();
        for (int i = 0; i < k; i++) {

            kLargest.add(priorityQueue.poll());

        }

        return kLargest;
    }


    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        TopKLargestValue topKLargestValue = new TopKLargestValue();

        System.out.println("TOP K Largest : " + topKLargestValue.topKLargest(arr, 3));


        System.out.println("TOP K Largest Min Heap : " + topKLargestValue.topKLargestMinHeap(arr, 3));
    }
}
