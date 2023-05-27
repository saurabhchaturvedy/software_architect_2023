package Fundamentals2.Intervals;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {


    public int[][] insertIntervals(int[][] intervals, int[] newInterval) {


        List<int[]> finalIntervals = new ArrayList<>();
        int index = 0;
        int lowVal = newInterval[0];
        int highVal = newInterval[1];
        while (index < intervals.length && intervals[index][1] < newInterval[0]) {
            finalIntervals.add(intervals[index++]);
        }

        while (index < intervals.length && intervals[index][0] <= newInterval[1]) {

            lowVal = Math.min(lowVal, intervals[index][0]);
            highVal = Math.max(highVal, intervals[index][1]);
            index++;
        }

        finalIntervals.add(new int[]{lowVal, highVal});

        while (index < intervals.length) {

            finalIntervals.add(intervals[index++]);
        }

        return finalIntervals.toArray(new int[finalIntervals.size()][]);
    }


    public static void main(String[] args) {

        // [[1,3],[2,6],[8,10],[15,18]]
        // [[1,2],[3,5],[6,7],[8,10],[12,16]]
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        InsertIntervals insertIntervals = new InsertIntervals();
        int[][] ints = insertIntervals.insertIntervals(intervals, new int[]{4, 8});

        for (int[] x : ints) {
            System.out.print("[");
            for (int y : x) {
                System.out.print(y);
            }
            System.out.print("]");
        }
    }
}
