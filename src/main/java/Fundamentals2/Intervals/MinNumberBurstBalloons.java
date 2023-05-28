package Fundamentals2.Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class MinNumberBurstBalloons {


    public int minArrows(int[][] balloons) {
        if (balloons.length == 0) return 0;

        Arrays.sort(balloons, Comparator.comparingInt(i -> i[1]));

        int arrows = 1;
        int pos = balloons[0][1];

        for (int i = 1; i < balloons.length; i++) {
            if (pos >= balloons[i][0]) {
                continue;
            }

            arrows++;
            pos = balloons[i][1];
        }

        return arrows;
    }


    public static void main(String[] args) {

        // [[10,16],[2,8],[1,6],[7,12]]

        int[][] arr = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        MinNumberBurstBalloons minNumberBurstBalloons = new MinNumberBurstBalloons();
        System.out.println("minimum number of arrows are : " + minNumberBurstBalloons.minArrows(arr));
    }
}
