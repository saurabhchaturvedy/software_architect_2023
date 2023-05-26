package Sorting_Algorithms;

import java.util.Arrays;

public class InsertionSort {


    public void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) {

        int[] arr = {2, 5, 9, 3, 7, 4, 11, 13};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
        Arrays.stream(arr).forEach(x -> {
            System.out.print(x + " ");
        });
    }
}
