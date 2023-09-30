package CodingSimplifiedSep2023.Arrays.Problem40;

import java.util.Random;

public class ShuffleArray {


    public void shuffleArray(int[] arr) {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int shuffleValue = random.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[shuffleValue];
            arr[shuffleValue] = temp;
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

        ShuffleArray shuffleArray = new ShuffleArray();

        shuffleArray.shuffleArray(arr);
    }
}
