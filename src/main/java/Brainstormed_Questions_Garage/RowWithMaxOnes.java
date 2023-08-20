package Brainstormed_Questions_Garage;

public class RowWithMaxOnes {


    public int rowWithMaxOnes(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        int row = 0;
        int col = cols - 1;

        int rowIndexWithMaxOnes = -1;


        while (row < rows && col >= 0) {

            if (arr[row][col] == 1) {
                rowIndexWithMaxOnes = row;
                col--;
            } else {

                row++;
            }
        }
        return rowIndexWithMaxOnes;

    }


    public static void main(String[] args) {

        int[][] arr = {{0, 0, 1, 1}, {0, 1, 1, 1}, {0, 0, 0, 1}, {0, 0, 0, 0}};

        RowWithMaxOnes rowWithMaxOnes = new RowWithMaxOnes();
        int r = rowWithMaxOnes.rowWithMaxOnes(arr);

        System.out.println("Rows with max ones are : " + r);
    }
}
