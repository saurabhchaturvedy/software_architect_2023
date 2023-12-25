package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.List;

public class GridMovement {

    public static int minCostXX(int rows, int cols, int initR, int initC, int finalR, int finalC, int[] costRows, int[] costCols) {
        int[][] dp = new int[rows][cols];

        // Initialize the starting point
        dp[initR][initC] = 0;

        // Fill the dp array
        for (int i = initR; i <= finalR; i++) {
            for (int j = initC; j <= finalC; j++) {
                if (i > initR) {
                    dp[i][j] = dp[i - 1][j] + costRows[i - 1];
                }
                if (j > initC) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + costCols[j - 1]);
                }
            }
        }

        // Return the minimum cost to reach the ending point
        return dp[finalR][finalC];
    }

    public static int minCostX(int rows, int cols, int initR, int initC, int finalR, int finalC, List<Integer> costRows, List<Integer> costCols) {
        // Create a 2D array to store the minimum cost to reach each cell
        int[][] minCost = new int[rows][cols];

        // Initialize the first row and column
        for (int i = initR; i < rows; i++) {
            minCost[i][0] = minCost[i - 1][0] + costRows.get(i - 1);
        }
        for (int j = initC; j < cols; j++) {
            minCost[0][j] = minCost[0][j - 1] + costCols.get(j - 1);
        }

        // Fill the rest of the matrix
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                int rowCost = minCost[i - 1][j] + costRows.get(i - 1);
                int colCost = minCost[i][j - 1] + costCols.get(j - 1);
                minCost[i][j] = Math.min(rowCost, colCost);
            }
        }

        // Return the minimum cost to reach the ending point
        return minCost[finalR][finalC];
    }


    public static int minCost(int rows, int cols, int initR, int initC, int finalR, int finalC, List<Integer> costRows, List<Integer> costCols) {
        // Write your code here
        int cost = 0;
        int add;

        //initR to finalR
        add = initR < finalR ? 1 : -1;

        while(initR != finalR){
            if(add == 1) {
                cost += costRows.get(initR);
                initR += add;
            } else {
                initR += add;
                cost += costRows.get(initR);
            }
        }

        //initC to finalC
        add = initC < finalC ? 1 : -1;

        while(initC != finalC){
            if(add == 1) {
                cost += costCols.get(initC);
                initC += add;
            }
            else {
                initC += add;
                cost += costCols.get(initC);
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        // Example costs (replace with your specific costs)
        int rows = 4;
        int cols = 4;
        int initR = 1;
        int initC = 0;
        int finalR = 2;
        int finalC = 3;

        int[] costRows = {1, 2, 3};
        int[] costCols = {4, 5, 6};

        int result = minCostXX(rows, cols, initR, initC, finalR, finalC, costRows, costCols);

        System.out.println("Minimum cost to move from start to end: " + result);
    }
}
