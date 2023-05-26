package Sorting_Algorithms;

import java.util.Arrays;

public class SelectionSort {


    public void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String[] args) {


        int[] arr = {4, 6, 1, 5, 3, 2};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
        Arrays.stream(arr).forEach(x -> {
            System.out.print(x + " ");
        });
    }
}
