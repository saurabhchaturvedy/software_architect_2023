package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {


    public int[][] insertIntervals(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;

        while (i < intervals.length && newInterval[0] > intervals[i][1]) {
            result.add(intervals[i]);
            i++;
        }


        while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }


        return result.toArray(new int[result.size()][]);
    }


    public static void main(String[] args) {

        int[][] arr = {{1, 2}, {3, 5}, {6, 7}, {8, 10},{12,16}};
        int[] newInterval = {4, 8};

        InsertIntervals insertIntervals = new InsertIntervals();
        int[][] ints = insertIntervals.insertIntervals(arr, newInterval);

        System.out.println(ints.length);
        for (int[] interval : ints) {
            System.out.print("[");
            for (int x : interval) {
                System.out.print(x);
            }
            System.out.print("]");
        }
    }
}
