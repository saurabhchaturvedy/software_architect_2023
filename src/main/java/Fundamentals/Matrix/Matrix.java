package Fundamentals.Matrix;

public class Matrix {


    public boolean search(int[][] matrix, int item) {

        int n = matrix.length;
        int i = 0;
        int j = n - 1;

        while (i < n && j >= 0) {

            if (matrix[i][j] == item) {
                return true;
            }

            if (matrix[i][j] > item) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}, {130, 140, 150, 160}};
        Matrix mat = new Matrix();
        System.out.println("is element found ?? :: " + mat.search(matrix, 120));
    }
}
