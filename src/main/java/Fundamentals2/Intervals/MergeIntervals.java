package Fundamentals2.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {


    public int[][] mergeIntervals(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] newInterval = intervals[0];
        mergedIntervals.add(newInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {

                newInterval = interval;
                mergedIntervals.add(newInterval);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }


    public static void main(String[] args) {

        // [[1,3],[2,6],[8,10],[15,18]]

        int[][]intervals = {{1,3},{2,6},{8,10},{15,18}};
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] ints = mergeIntervals.mergeIntervals(intervals);

        for (int[] x : ints) {
            System.out.print("[");
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println("]");
        }

    }
}
