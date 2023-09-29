package CodingSimplifiedSep2023.Arrays.Problem10;

public class BubbleSort {


    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {


        int[] arr = {7, 3, 18, 15, 2, 10, 23};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
