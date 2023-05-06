package Last_Minute_Brush_Up_Problems;

public class SpiralMatrix {


    public static void spiralMatrix(int[][]matrix)
    {
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int direction=0;

        while (top<=bottom && left<=right) {

            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i]+" ");
                }
                top++;
            } else if (direction==1) {

                for(int i=top; i<=bottom; i++)
                {
                    System.out.println(matrix[i][right]+" ");
                }
right--;
            } else if (direction==2) {

                for(int i=right; i>=left; i--)
                {
                    System.out.print(matrix[bottom][i]+" ");
                }
                bottom--;
            }
            else {

                for(int i=bottom; i>=top; i--)
                {
                    System.out.print(matrix[i][left]+" ");
                }

                left++;
            }

            direction=(direction+1)%4;
        }


    }


    public static void main(String[] args) {

        int[][]arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        spiralMatrix(arr);
    }
}
