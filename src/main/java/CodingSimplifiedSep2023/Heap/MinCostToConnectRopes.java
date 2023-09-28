package CodingSimplifiedSep2023.Heap;

import java.util.PriorityQueue;

public class MinCostToConnectRopes {


    public int minCostToConnectRopes(int[] ropes) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int rope : ropes) {
            minHeap.add(rope);
        }

        int minCost = 0;
        int tempCost = 0;

        while (minHeap.size() > 1) {

            tempCost = minHeap.poll() + minHeap.poll();

            minCost = minCost + tempCost;


            minHeap.add(tempCost);

        }

        return minCost;
    }


    public static void main(String[] args) {


        int[] ropes = {3, 4, 7, 2};

        MinCostToConnectRopes minCostToConnectRopes = new MinCostToConnectRopes();
        int minnedCostToConnectRopes = minCostToConnectRopes.minCostToConnectRopes(ropes);

        System.out.println("Minimum cost to connect ropes is : " + minnedCostToConnectRopes);
    }
}
