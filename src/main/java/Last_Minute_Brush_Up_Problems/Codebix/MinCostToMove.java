package Last_Minute_Brush_Up_Problems.Codebix;

public class MinCostToMove {

    public static int minCostToMove(int rows, int cols, int initR, int initC, int finalR, int finalC, int[] costRows, int[] costCols) {
        // Initialize a 2D array to store the minimum cost to reach each cell
        int[][] dp = new int[rows + 1][cols + 1];

        // Set the cost for the starting cell to be 0
        dp[initR][initC] = 0;

        // Update the minimum cost for each cell based on the costRows and costCols arrays
        for (int i = initR; i <= finalR; i++) {
            for (int j = initC; j <= finalC; j++) {
                // Update the cost using the minimum of moving from the cell above and the cell on the left
                dp[i][j] = Math.min(dp[i - 1][j] + costRows[i - 1], dp[i][j - 1] + costCols[j - 1]);
            }
        }

        // The result is stored in the bottom-right cell of the dp array
        return dp[finalR][finalC];
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int initR = 1;
        int initC = 1;
        int finalR = 2;
        int finalC = 3;
        int[] costRows = {1, 2, 3};
        int[] costCols = {4, 5, 6};

        int result = minCostToMove(rows, cols, initR, initC, finalR, finalC, costRows, costCols);
        System.out.println("Minimum cost: " + result);
    }
}
