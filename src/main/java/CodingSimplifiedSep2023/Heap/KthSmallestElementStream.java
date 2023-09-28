package CodingSimplifiedSep2023.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementStream {


    PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());


    public int KthSmallestElementStream(int x, int k) {

        if (minHeap.size() < k) {

            minHeap.add(x);

            return minHeap.size() == k ? minHeap.peek() : -1;
        }


        if (x > minHeap.peek()) {

            minHeap.poll();
            minHeap.add(x);
        }

        return minHeap.peek();
    }


    public static void main(String[] args) {


        int[] arr = {9, 13, 5, 2, 10, 15, 18, 27, 22};

        KthSmallestElementStream kthSmallestElementStream = new KthSmallestElementStream();

        for (int x : arr) {
            System.out.print(kthSmallestElementStream.KthSmallestElementStream(x, 3) + " ");
        }
    }
}
