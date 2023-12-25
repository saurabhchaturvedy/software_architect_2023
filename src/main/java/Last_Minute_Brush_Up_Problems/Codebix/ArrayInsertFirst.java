package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.Arrays;

public class ArrayInsertFirst {


    public static void main(String[] args) {

        int[] array = {1, 2, 3};

        int length = array.length;

        int[] newArray = Arrays.copyOf(array, length + 2);
        System.arraycopy(array, 0, newArray, 2, length);
        newArray[0] = 0;
        newArray[1] = 0;

        for (int x : newArray) {
            System.out.print(x + " ");
        }
    }
}
