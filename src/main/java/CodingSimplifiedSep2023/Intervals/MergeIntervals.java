package CodingSimplifiedSep2023.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {


    public int[][] mergeIntervals(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparing(i -> i[0]));

        List<int[]> intervalList = new ArrayList<>();

        int[] newInterval = intervals[0];
        intervalList.add(newInterval);

        for (int[] interval : intervals) {

            if (interval[0] <= newInterval[1]) {

                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {

                newInterval = interval;
                intervalList.add(newInterval);
            }
        }

        return intervalList.toArray(new int[intervalList.size()][]);
    }


    public static void main(String[] args) {


        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        MergeIntervals mergeIntervals = new MergeIntervals();

        int[][] ints = mergeIntervals.mergeIntervals(intervals);

        for (int[] array : ints) {

            System.out.print(" [ ");
            for (int x : array) {

                System.out.print(x + " ");
            }
            System.out.print(" ] ");
        }
    }
}
