package Last_Minute_Brush_Up_Problems;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {


    public int[][] insertIntervals(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int n = intervals.length;
        int i = 0;


        while (i < n && intervals[i][1] <= newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }


        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
result.add(newInterval);

        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }


    public static void main(String[] args) {

        int[][] arr = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        InsertInterval insertInterval = new InsertInterval();
        int[][] ints = insertInterval.insertIntervals(arr, newInterval);

        for (int[] x : ints) {
            System.out.print("[");
            for (int y : x) {
                System.out.print(y + " ");
            }

            System.out.print("]");
            System.out.print(" ");
        }

    }
}
