package CodingSimplifiedSep2023.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestPointsToTheOrigin {


    public List<Coordinate> kClosestPointToOriginList(List<Coordinate> coordinateList, int k) {

        if (coordinateList == null || coordinateList.size() == 0) {
            return coordinateList;
        }


        coordinateList.sort((c1, c2) -> c1.distanceFromOrigin() - c2.distanceFromOrigin());

        List<Coordinate> coordinates = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            coordinates.add(coordinateList.get(i));
        }

        return coordinates;
    }


    public List<Coordinate> kClosestPointToOriginMinHeap(List<Coordinate> coordinateList, int k) {


        PriorityQueue<Coordinate> minHeap = new PriorityQueue<>((c1, c2) -> c1.distanceFromOrigin() - c2.distanceFromOrigin());

        for (Coordinate coordinate : coordinateList) {
            minHeap.add(coordinate);
        }

        int i = 0;
        List<Coordinate> coordinates = new ArrayList<>();
        while (!minHeap.isEmpty() && i < k) {
            coordinates.add(minHeap.poll());
            i++;
        }

        return coordinates;
    }


    public List<Coordinate> kClosestPointToOriginMaxHeap(List<Coordinate> coordinateList, int k) {


        PriorityQueue<Coordinate> maxHeap = new PriorityQueue<>((c1, c2) -> {
            return c2.distanceFromOrigin() - c1.distanceFromOrigin();
        });

        for (int i = 0; i < k; i++) {
            maxHeap.add(coordinateList.get(i));
        }

        for (int j = k; j < coordinateList.size(); j++) {

            if (coordinateList.get(j).distanceFromOrigin() < maxHeap.peek().distanceFromOrigin()) {

                maxHeap.poll();
                maxHeap.add(coordinateList.get(j));
            }
        }

        List<Coordinate> coordinates = new ArrayList<>();

        while (!maxHeap.isEmpty()) {
            coordinates.add(maxHeap.poll());
        }

        return coordinates;
    }


    public static void main(String[] args) {


        Coordinate c1 = new Coordinate(3, 3);
        Coordinate c2 = new Coordinate(5, -1);
        Coordinate c3 = new Coordinate(-2, 4);

        List<Coordinate> coordinateList = Arrays.asList(c1, c2, c3);

        KClosestPointsToTheOrigin kClosestPointsToTheOrigin = new KClosestPointsToTheOrigin();
        List<Coordinate> coordinates = kClosestPointsToTheOrigin.kClosestPointToOriginList(coordinateList, 2);

        for (Coordinate c : coordinates) {
            System.out.print(c + " ");
        }

        System.out.println();

        coordinates = kClosestPointsToTheOrigin.kClosestPointToOriginMinHeap(coordinateList, 2);

        for (Coordinate c : coordinates) {
            System.out.print(c + " ");
        }

        System.out.println();

        coordinates = kClosestPointsToTheOrigin.kClosestPointToOriginMaxHeap(coordinateList, 2);

        for (Coordinate c : coordinates) {
            System.out.print(c + " ");
        }
    }


}
