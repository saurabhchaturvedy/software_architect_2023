package Last_Minute_Brush_Up_Problems.Last_Minuters;

public class GridMovement {

    public static int minCost(int[][] grid, int[] costRows, int[] costCols, int startRow, int startCol, int endRow, int endCol) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Create a 2D array to store the minimum cost to reach each cell
        int[][] minCost = new int[rows][cols];

        // Initialize the first row and column
        minCost[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) {
            minCost[i][0] = minCost[i - 1][0] + costRows[i - 1];
        }
        for (int j = 1; j < cols; j++) {
            minCost[0][j] = minCost[0][j - 1] + costCols[j - 1];
        }

        // Fill the rest of the matrix
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                int rowCost = minCost[i - 1][j] + costRows[i - 1];
                int colCost = minCost[i][j - 1] + costCols[j - 1];
                minCost[i][j] = grid[i][j] + Math.min(rowCost, colCost);
            }
        }

        // Return the minimum cost to reach the ending point
        return minCost[endRow][endCol];
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] costRows = {1, 2, 3};
        int[] costCols = {1, 2, 3};

        int startRow = 0;
        int startCol = 0;
        int endRow = 2;
        int endCol = 2;

        int result = minCost(grid, costRows, costCols, startRow, startCol, endRow, endCol);

        System.out.println("Minimum cost to move from start to end: " + result);
    }
}