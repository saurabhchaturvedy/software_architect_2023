package Last_Minute_Brush_Up_Problems.Codebix;

class MinCostLaserGrid {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        // Initialize variables with starting positions.
        int currentRow = startPos[0], currentCol = startPos[1];
        // Destination positions.
        int targetRow = homePos[0], targetCol = homePos[1];
        // Variable to keep track of the total minimum cost.
        int totalCost = 0;

        // If currentRow is less than targetRow, move down.
        if (currentRow < targetRow) {
            for (int row = currentRow + 1; row <= targetRow; row++) {
                totalCost += rowCosts[row]; // Add cost for each row moved.
            }
        } else {
            // If currentRow is more than targetRow, move up.
            for (int row = targetRow; row < currentRow; row++) {
                totalCost += rowCosts[row]; // Add cost for each row moved.
            }
        }

        // If currentCol is less than targetCol, move right.
        if (currentCol < targetCol) {
            for (int col = currentCol + 1; col <= targetCol; col++) {
                totalCost += colCosts[col]; // Add cost for each column moved.
            }
        } else {
            // If currentCol is more than targetCol, move left.
            for (int col = targetCol; col < currentCol; col++) {
                totalCost += colCosts[col]; // Add cost for each column moved.
            }
        }

        // Return the accumulated total cost.
        return totalCost;
    }


    public static int minCostToHome(int m, int n, int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int startRow = startPos[0];
        int startCol = startPos[1];
        int homeRow = homePos[0];
        int homeCol = homePos[1];

        // Initialize a 2D array to store the minimum cost to reach each cell
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        // The cost to reach the starting cell is 0
        dp[startRow][startCol] = 0;

        // Update the cost for each cell in the grid
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                // Update cost if moving from the top cell
                if (r > 0) {
                    dp[r][c] = Math.min(dp[r][c], dp[r - 1][c] + rowCosts[r]);
                }

                // Update cost if moving from the left cell
                if (c > 0) {
                    dp[r][c] = Math.min(dp[r][c], dp[r][c - 1] + colCosts[c]);
                }
            }
        }

        // The result is the cost to reach the home cell
        return dp[homeRow][homeCol];
    }


    public static void main(String[] args) {
        MinCostLaserGrid minCostLaserGrid = new MinCostLaserGrid();

        int[]startPos = {1,0};
        int[]homePos = {2,3};

        int[]rowCosts = {0,1,2,3};
        int[]colCosts = {0,4,5,6};

        System.out.println(minCostLaserGrid.minCost(startPos,homePos,rowCosts,colCosts));

        //System.out.println(minCostToHome(4,4,startPos,homePos,rowCosts,colCosts));
    }
}
