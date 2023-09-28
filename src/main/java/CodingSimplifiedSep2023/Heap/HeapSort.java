package CodingSimplifiedSep2023.Heap;

import java.util.PriorityQueue;

public class HeapSort {


    public int[] heapSort(int[] arr) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int x : arr) {
            priorityQueue.add(x);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = priorityQueue.poll();
        }

        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {13, 8, 1, 56, 17, 19, 16, 61, 33};

        HeapSort heapSort = new HeapSort();

        heapSort.heapSort(arr);

        for (int y : arr) {
            System.out.print(y + " ");
        }
    }
}
