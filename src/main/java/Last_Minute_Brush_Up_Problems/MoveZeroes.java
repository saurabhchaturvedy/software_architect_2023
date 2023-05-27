package Last_Minute_Brush_Up_Problems;

import java.util.Arrays;

public class MoveZeroes {


    public void moveZeroes(int[] arr) {

        int insertPosition = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                arr[insertPosition++] = arr[i];
            }
        }
        while (insertPosition < arr.length) {
            arr[insertPosition++] = 0;
        }

    }


    public static void main(String[] args) {

        int[] arr = {0, 1, 5, 0, 12, 0, 9};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(arr);
        Arrays.stream(arr).forEach(x -> {
            System.out.print(x + " ");
        });
    }
}
