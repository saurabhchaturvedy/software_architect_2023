package CSAug2023.Arrays.Section40;

import java.util.Random;

public class ShuffleNumbers {


    public void shuffle(int[] arr) {
        Random random = new Random();


        for (int i = 0; i < arr.length; i++) {

            int randomVal = random.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[randomVal];
            arr[randomVal] = temp;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }


    public static void main(String[] args) {


        int[] arr = {4, 7, 2, 9, 18, 5};
        ShuffleNumbers shuffleNumbers = new ShuffleNumbers();
        shuffleNumbers.shuffle(arr);
    }
}
