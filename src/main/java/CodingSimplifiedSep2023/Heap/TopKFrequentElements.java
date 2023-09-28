package CodingSimplifiedSep2023.Heap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TopKFrequentElements {


    public List<Integer> topKFrequentElementsMaxHeap(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((n1, n2) -> {
            return n2.getValue() - n1.getValue();
        });

        maxHeap.addAll(map.entrySet());

        List<Integer> topKFrequentElements = new ArrayList<>();
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            topKFrequentElements.add(maxHeap.poll().getKey());
        }

        return topKFrequentElements;
    }


    public List<Integer> topKFrequentElementsMinHeap(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((n1, n2) -> {
            return n1.getValue() - n2.getValue();
        });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (minHeap.size() < k) {
                minHeap.add(entry);
            } else {

                if (entry.getValue() > minHeap.peek().getValue()) {
                    minHeap.poll();
                    minHeap.add(entry);
                }
            }

            List<Integer> topKFrequentElements = new ArrayList<>();

            while (!minHeap.isEmpty()) {
                topKFrequentElements.add(minHeap.poll().getKey());
            }

            return topKFrequentElements;
        }

        List<Integer> topKFrequentElements = new ArrayList<>();
        for (int i = 0; i < k && !minHeap.isEmpty(); i++) {
            topKFrequentElements.add(minHeap.poll().getKey());
        }

        return topKFrequentElements;
    }


    public List<Integer> topKFrequentElementsJavaStreams(int[] arr, int k) {


        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }


        List<Integer> frquentElementList = map.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).map(Map.Entry::getKey).collect(Collectors.toList());

        return frquentElementList.subList(0,k);
    }


    public static void main(String[] args) {

        int[] arr = {4, 4, 4, 4, 3, 3, 3, 2, 2, 8, 9, 14, 14, 14, 14, 14, 14, 14, 10};

        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

        System.out.println("Top 3 frequent elements max heap : " + topKFrequentElements.topKFrequentElementsMaxHeap(arr, 3));

        System.out.println();

        System.out.println("Top 3 frequent elements min heap : " + topKFrequentElements.topKFrequentElementsMinHeap(arr, 3));

        System.out.println();

        System.out.println("Top 3 frequent elements Java 8 : " + topKFrequentElements.topKFrequentElementsJavaStreams(arr, 3));
    }
}
