package Sorting_Algorithms;

import java.util.Arrays;

public class BubbleSort {


    public void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {5, 6, 9, 4, 8, 2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);

        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}
