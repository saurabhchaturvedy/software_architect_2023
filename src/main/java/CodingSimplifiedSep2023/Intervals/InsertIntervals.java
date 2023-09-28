package CodingSimplifiedSep2023.Intervals;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {


    public int[][] insertInterval(int[][] intervals, int[] newInterval) {

        List<int[]> intervalList = new ArrayList<>();

        int i = 0;

        // end of current interval is less than start of new interval , no overlapping
        while (i < intervals.length && intervals[i][1] <= newInterval[0]) {
            intervalList.add(intervals[i]);
            i++;
        }

        // start of current interval is less than end of new interval , overlapping merge needed
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {

            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }


        intervalList.add(newInterval);

        // add left over intervals
        while (i < intervals.length) {
            intervalList.add(intervals[i]);
            i++;
        }


        return intervalList.toArray(new int[intervalList.size()][]);
    }


    public static void main(String[] args) {


        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        InsertIntervals insertIntervals = new InsertIntervals();
        int[][] ints = insertIntervals.insertInterval(intervals, newInterval);

        for (int[] array : ints) {
            System.out.print(" [ ");
            for (int x : array) {
                System.out.print(x + " ");
            }

            System.out.print(" ] ");
        }
    }
}
